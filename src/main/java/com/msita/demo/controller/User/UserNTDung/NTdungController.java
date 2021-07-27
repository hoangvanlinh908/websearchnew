package com.msita.demo.controller.User.UserNTDung;
import com.msita.demo.controller.BaseController;
import com.msita.demo.form.*;
import com.msita.demo.models.BaidangModel;
import com.msita.demo.models.NhaTuyenDungModel;
import com.msita.demo.services.NhaTuyenDungServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class NTdungController extends BaseController {
    @Autowired
    private  NhaTuyenDungServices nhaTuyenDungServices;

    @GetMapping("/login")
    public String getLogin(Model model,HttpSession session){
        String loginUserId = (String) session.getAttribute("loginFormUser");
        if (loginUserId != null) {
            return "redirect:/home";
        }
        session.removeAttribute("loginFormUserUV");
        model.addAttribute("loginNTD", new NhaTuyenDung());
        model.addAttribute("registerloginNTD", new NhaTuyenDung());
        return "login";

    }
    @PostMapping("/login")
    public String postLogin(@ModelAttribute("loginNTD") NhaTuyenDung loginNTD, final Model model, HttpSession session){
        String Email = loginNTD.getEmail();
        String MatKhau =loginNTD.getMatKhau();

        if (Email == null || MatKhau == null) {
            model.addAttribute("errorMessage", "xin nhập email và mật khẩu ");
            return "login";
        }
        String loginFormUser = nhaTuyenDungServices.getlogin(Email, MatKhau);
        if (loginFormUser == null) {
            model.addAttribute("errorMessage", "tài khoản và mật khẩu không đúng");
            return "login";
        }
        session.removeAttribute("loginFormUserUV");
        session.setAttribute("loginFormUser", loginFormUser);

        return "redirect:/home";
    }
    @GetMapping("/register")
    public  String register(Model model,HttpSession session){
        String loginUser = (String) session.getAttribute("loginFormUser");
        model.addAttribute("text",loginUser);
        model.addAttribute("text1",nhaTuyenDungServices.finallByidntd(loginUser));
        model.addAttribute("register",new NhaTuyenDungModel());
        return "register";

    }
    @PostMapping("/register")
    public  String register(@Valid @ModelAttribute("register") NhaTuyenDung nhaTuyenDung, BindingResult bindingResult, @RequestParam("Logo") MultipartFile logo1, Model model)throws IOException {
        if (bindingResult.hasErrors())  {

            return "register";
        }
        String email = nhaTuyenDung.getEmail();
        NhaTuyenDungModel nhaTuyenDung1 = nhaTuyenDungServices.finallByidemail(email);
        if (nhaTuyenDung1 != null)
        {
            model.addAttribute("mss","tài khoản email đã tồn tại");
            return "register";
        }
        String MatKhau = nhaTuyenDung.getMatKhau();
        String TenCongTy = nhaTuyenDung.getTenCongTy();
        String LinhVuc = nhaTuyenDung.getLinhVuc();
        String SoLuoc = nhaTuyenDung.getSoLuoc();
        String  DiaChi = nhaTuyenDung.getDiaChi();
        String MaSoThue = nhaTuyenDung.getMaSoThue();
        String DoiTuong  = nhaTuyenDung.getDoiTuong();
        String Logo = logo1.getOriginalFilename();
        if (!Logo.contains(".jpg") && !Logo.contains(".png")&& !Logo.contains(".PNG")) {
            model.addAttribute("message", "Invalid image file");
            return "register";
        }
        Path imagePath = Paths.get("src/main/resources/static/imglogo/" + Logo);
        Files.write(imagePath, logo1.getBytes());
        nhaTuyenDungServices.save1(new NhaTuyenDungModel(email,MatKhau,TenCongTy,LinhVuc,Logo,SoLuoc,DiaChi,MaSoThue,DoiTuong));
        return "redirect:/home";
    }

    @GetMapping("/Dangbai")
    public  String dangbai(Model model,HttpSession session){
        String loginUserId = (String) session.getAttribute("loginFormUser");
        if (loginUserId == null) {
            return "redirect:/login";
        }  String loginUser = (String) session.getAttribute("loginFormUser");
        model.addAttribute("text",loginUser);
        model.addAttribute("text1",nhaTuyenDungServices.finallByidntd(loginUser));
        model.addAttribute("dangbai",new BaidangModel());
        model.addAttribute(("nganhnghe"),nhaTuyenDungServices.finallNN());
        return "dangbai";
    }
    @PostMapping("/Dangbai")
    public  String dangbai(@Valid @ModelAttribute("dangbai") BaidangForm baidang, BindingResult bindingResult, @RequestParam("HinhAnh") MultipartFile hinhanh, Model model, HttpSession session)throws IOException{
        if (bindingResult.hasErrors())  {

            return "dangbai";
        }
        String TieuDe = baidang.getTieuDe();
        Date NgayDang = java.util.Calendar.getInstance().getTime();
        int SLTuyenDung = baidang.getSLTuyenDung();
        String  TinhChat= baidang.getTinhChat();
        String MucLuong = baidang.getMucLuong();
        String DiaChiLamViec = baidang.getDiaChiLamViec();
        String TieuChi = baidang.getTieuChi();
        String ChiTietCV = baidang.getChiTietCV();
        String loginNTD = (String) session.getAttribute("loginFormUser");
        String MaNhaTuyenDung = loginNTD;
        String HinhAnh = hinhanh.getOriginalFilename();
        String MaNganhNghe = baidang.getMaNganhNghe();
        if (!HinhAnh.contains(".jpg") && !HinhAnh.contains(".png")&& !HinhAnh.contains(".PNG")) {
            model.addAttribute("message", "Invalid image file");
            return "addProduct";
        }
        Path imagePath = Paths.get("src/main/resources/static/imgbd/" + HinhAnh);
        Files.write(imagePath, hinhanh.getBytes());
        nhaTuyenDungServices.save2(new BaidangModel(TieuDe,NgayDang,SLTuyenDung,TinhChat,MucLuong,DiaChiLamViec,TieuChi,ChiTietCV,HinhAnh,MaNhaTuyenDung,MaNganhNghe));



        return "redirect:/home";
    }
    @GetMapping("/editbd")
    public  String editbd(@RequestParam("id") String id,Model model,HttpSession session){
        String mantd = (String) session.getAttribute("loginFormUser");

        if (mantd == null) {
            return "redirect:/login";
        }
        model.addAttribute(("nganhnghe"),nhaTuyenDungServices.finallNN());
        BaidangModel baidang = nhaTuyenDungServices.finbymabd(id);
        String MaBaiDang= baidang.getMaBaiDang();
        String TieuDe = baidang.getTieuDe();
        Date NgayDang = baidang.getNgayDang();
        int SLTuyenDung = baidang.getSLTuyenDung();
        String  TinhChat= baidang.getTinhChat();
        String MucLuong = baidang.getMucLuong();
        String DiaChiLamViec = baidang.getDiaChiLamViec();
        String TieuChi = baidang.getTieuChi();
        String ChiTietCV = baidang.getChiTietCV();
        String HinhAnh = baidang.getHinhAnh();
        String MaNganhNghe = baidang.getMaNganhNghe();
        String MaNhaTuyenDung = baidang.getMaNhaTuyenDung();
        model.addAttribute("editbd",new BaidangModel(MaBaiDang,TieuDe, NgayDang, SLTuyenDung, TinhChat, MucLuong, DiaChiLamViec, TieuChi, ChiTietCV, HinhAnh, MaNhaTuyenDung, MaNganhNghe));
        return "editbd";
    }
    @PostMapping("/editbd")
    public String editbaidang(@ModelAttribute("editbd") BaidangForm baidang,BindingResult bindingResult,@RequestParam("HinhAnh") MultipartFile hinhanh, HttpSession session,Model model) throws IOException{
        String MaBaiDang= baidang.getMaBaiDang();
        baidang.setMaBaiDang(MaBaiDang);
        String TieuDe = baidang.getTieuDe();
        baidang.setTieuDe(TieuDe);
        Date NgayDang = new Date();
        baidang.setNgayDang(NgayDang);
        int SLTuyenDung = baidang.getSLTuyenDung();
        baidang.setSLTuyenDung(SLTuyenDung);
        String  TinhChat= baidang.getTinhChat();
        baidang.setTinhChat(TinhChat);
        String MucLuong = baidang.getMucLuong();
        baidang.setMucLuong(MucLuong);
        String DiaChiLamViec = baidang.getDiaChiLamViec();
        baidang.setDiaChiLamViec(DiaChiLamViec);
        String TieuChi = baidang.getTieuChi();
        baidang.setTieuChi(TieuChi);
        String ChiTietCV = baidang.getChiTietCV();
        baidang.setChiTietCV(ChiTietCV);
        String MaNganhNghe = baidang.getMaNganhNghe();
        baidang.setMaNganhNghe(MaNganhNghe);
        String loginNTD = (String) session.getAttribute("loginFormUser");
        String MaNhaTuyenDung = loginNTD;
        baidang.setMaNhaTuyenDung(MaNhaTuyenDung);
        String HinhAnh = null;
        if (hinhanh != null && !hinhanh.isEmpty()) {
            HinhAnh = hinhanh.getOriginalFilename();
            if (!HinhAnh.contains(".jpg") && !HinhAnh.contains(".png")) {
                model.addAttribute("message", "Invalid image file");
                return "editProduct";
            }

            BaidangModel baidangModel = nhaTuyenDungServices.finbymabd(baidang.getMaBaiDang());

            Path  oldImagePath = Paths.get("src/main/resources/static/imgbd/" + baidangModel.getHinhAnh());
            Files.delete(oldImagePath);

            Path imagePath = Paths.get("src/main/resources/static/imgbd/" + HinhAnh);
            Files.write(imagePath, hinhanh.getBytes());

        }
        if (HinhAnh == null  ){
            nhaTuyenDungServices.save3(new BaidangForm(MaBaiDang,TieuDe, NgayDang, SLTuyenDung, TinhChat, MucLuong, DiaChiLamViec, TieuChi, ChiTietCV, MaNhaTuyenDung, MaNganhNghe));
        }
        else {
            nhaTuyenDungServices.save2(new BaidangModel(MaBaiDang,TieuDe, NgayDang, SLTuyenDung, TinhChat, MucLuong, DiaChiLamViec, TieuChi, ChiTietCV, HinhAnh, MaNhaTuyenDung, MaNganhNghe));
        }
        return "redirect:/home";
    }


    @GetMapping("/logout")
    public String loguot(HttpSession session){

        session.removeAttribute("loginFormUser");

        session.removeAttribute("loginFormUserUV");
        return "redirect:/home";
    }
    @GetMapping("/edit-NTD")
    public  String edit(@RequestParam("id") String id,Model model,HttpSession session){
        String mantd = (String) session.getAttribute("loginFormUser");

        if (mantd == null) {
            return "redirect:/login";
        }
            List<NhaTuyenDungModel> nhaTuyenDung = nhaTuyenDungServices.finbyidntd1(id);
            String MaNhaTuyenDung = nhaTuyenDung.get(0).getMaNhaTuyenDung();
        String email = nhaTuyenDung.get(0).getEmail();
        String MatKhau = nhaTuyenDung.get(0).getMatKhau();
        String TenCongTy = nhaTuyenDung.get(0).getTenCongTy();
        String LinhVuc = nhaTuyenDung.get(0).getLinhVuc();
        String SoLuoc = nhaTuyenDung.get(0).getSoLuoc();
        String  DiaChi = nhaTuyenDung.get(0).getDiaChi();
        String MaSoThue = nhaTuyenDung.get(0).getMaSoThue();
        String DoiTuong  = nhaTuyenDung.get(0).getDoiTuong();
        String Logo = nhaTuyenDung.get(0).getLogo();
        model.addAttribute("nhatuyendung",new NhaTuyenDungModel(MaNhaTuyenDung,email,MatKhau,TenCongTy,LinhVuc,SoLuoc,DiaChi,MaSoThue,DoiTuong,Logo));
        return "editNTD";
    }
    @PostMapping("/edit")
    public  String editNTD(@Valid @ModelAttribute("nhatuyendung") NhaTuyenDung nhaTuyenDung, BindingResult bindingResult, @RequestParam("Logo") MultipartFile logo1, Model model)throws IOException {
        if (bindingResult.hasErrors())  {
            return "editNTD";
        }

        String  MaNhaTuyenDung= nhaTuyenDung.getMaNhaTuyenDung();
        nhaTuyenDung.setMaNhaTuyenDung(MaNhaTuyenDung);
        String email = nhaTuyenDung.getEmail();
        nhaTuyenDung.setEmail(email);
        String MatKhau = nhaTuyenDung.getMatKhau();
        nhaTuyenDung.setMatKhau(MatKhau);
        String TenCongTy = nhaTuyenDung.getTenCongTy();
        nhaTuyenDung.setTenCongTy(TenCongTy);
        String LinhVuc = nhaTuyenDung.getLinhVuc();
        nhaTuyenDung.setLinhVuc(LinhVuc);
        String SoLuoc = nhaTuyenDung.getSoLuoc();
        nhaTuyenDung.setSoLuoc(SoLuoc);
        String  DiaChi = nhaTuyenDung.getDiaChi();
        nhaTuyenDung.setDiaChi(DiaChi);
        String MaSoThue = nhaTuyenDung.getMaSoThue();
        nhaTuyenDung.setMaSoThue(MaSoThue);
        String DoiTuong  = nhaTuyenDung.getDoiTuong();
        nhaTuyenDung.setDoiTuong(DoiTuong);
        String Logo = null;
        if (logo1 != null && !logo1.isEmpty()) {
            Logo = logo1.getOriginalFilename();
            if (!Logo.contains(".jpg") && !Logo.contains(".png")) {
                model.addAttribute("message", "Invalid image file");
                return "editProduct";
            }

            NhaTuyenDungModel nhaTuyenDungModel = nhaTuyenDungServices.finallByidntd(nhaTuyenDung.getMaNhaTuyenDung());

            Path  oldImagePath = Paths.get("src/main/resources/static/imglogo/" + nhaTuyenDungModel.getLogo());
            Files.delete(oldImagePath);

            Path imagePath = Paths.get("src/main/resources/static/imglogo/" + Logo);
            Files.write(imagePath, logo1.getBytes());

        }
      if (Logo == null  ){
            nhaTuyenDungServices.save(new NhaTuyenDung(MaNhaTuyenDung,email,MatKhau,TenCongTy,LinhVuc,SoLuoc,DiaChi,MaSoThue,DoiTuong));
        }
        else
            nhaTuyenDungServices.save1(new NhaTuyenDungModel(MaNhaTuyenDung,email,MatKhau,TenCongTy,LinhVuc,SoLuoc,DiaChi,MaSoThue,DoiTuong,Logo));

        return "redirect:/home";
    }
    @GetMapping("/danhsachbd")
    public  String sanhsachbaidang(HttpSession session,Model model){
        String mantd = (String) session.getAttribute("loginFormUser");

        if (mantd == null) {
            return "redirect:/login";
        }
        List<BaidangModel> finallntd = nhaTuyenDungServices.finbymantd(mantd);
        model.addAttribute("finallnntd",finallntd);
        return "danhsachbd";
    }
    @GetMapping("/danhsachungtuyen")
    public String danhsachungtuyen(@RequestParam("id") String id ,Model model,HttpSession session){
        String mantd = (String) session.getAttribute("loginFormUser");

        if (mantd == null) {
            return "redirect:/login";
        }
        List<HoSoUngTuyen> dsuv = nhaTuyenDungServices.finallbd(id);
        model.addAttribute("finlistuv",dsuv);
        return "danhsachungtuyen";
    }
    @GetMapping("/deletebd")
    public String deletebd(@RequestParam("id") String id ,Model model,HttpSession session){
        String mantd = (String) session.getAttribute("loginFormUser");

        if (mantd == null) {
            return "redirect:/login";
        }
       nhaTuyenDungServices.deldetehsmabd(id);
        nhaTuyenDungServices.deldetebd(id);
        return "redirect:/danhsachbd";
    }
    @GetMapping("/xemcv")
    public  String  xemthongtinungvien(@RequestParam("id") String id ,HttpSession session,Model model){
        String MaUngien = (String) session.getAttribute("loginFormUser");
        if (MaUngien == null) {

            return "redirect:/login";
        }
        List<HocVan> hocVans = ungVienServices.finhocvan(id);
        List<KinhNghiem> kinhNghiems = ungVienServices.finKinhNghiem(id);
        List<KyNang> kyNangs = ungVienServices.finKyNang(id);
        List<UngVien> ungViens = ungVienServices.finungvien(id);
        model.addAttribute("listhocvan1",hocVans);
        model.addAttribute("listkinhnghiem1",kinhNghiems);
        model.addAttribute("listkynghiem1",kyNangs);
        model.addAttribute("ungvien",ungViens);
        return "xemcv";
    }
    @GetMapping("/duyet")
    public  String duyet(@RequestParam("id") String id){
        HoSoUngTuyen hoSoUngTuyen = nhaTuyenDungServices.finid(id);
        if(hoSoUngTuyen.getTinhTrang().equals("Chưa duyệt")){
           hoSoUngTuyen.setTinhTrang("Đã duyệt");
            ungVienServices.save1(hoSoUngTuyen);
        }
        else {
            hoSoUngTuyen.setTinhTrang("Chưa duyệt");
            ungVienServices.save1(hoSoUngTuyen);
        }
        return "redirect:/danhsachungtuyen?id="+hoSoUngTuyen.getMaBaiDang();
    }
    @GetMapping("/deletehoso1")
    public String deletehososs(@RequestParam("id") String id ,Model model,HttpSession session){
        HoSoUngTuyen hoSoUngTuyen = nhaTuyenDungServices.finid(id);
        ungVienServices.deldetehs(id);
        return "redirect:/danhsachungtuyen?id="+hoSoUngTuyen.getMaBaiDang();
    }
    }
