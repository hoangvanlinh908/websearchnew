package com.msita.demo.controller.User.UserUngVien;
import com.msita.demo.controller.BaseController;
import com.msita.demo.form.*;
import com.msita.demo.models.UngVienModel;
import com.msita.demo.services.UngVienServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class UngVienController extends BaseController {
    @Autowired
    private UngVienServices ungVienServices;

    @GetMapping("/loginUv")
    public String getLogin(Model model, HttpSession session){
        String loginUserUV = (String) session.getAttribute("loginFormUserUV");
        if (loginUserUV != null) {
            return "redirect:/home";
        }
        session.removeAttribute("loginFormUser");
        model.addAttribute("loginUV", new UngVien());

        return "loginUv";

    }
    @PostMapping("/loginUv")
    public String postLogin(@ModelAttribute("loginUV") UngVien loginUV, final Model model, HttpSession session){
        String Email = loginUV.getEmail();
        String MatKhau =loginUV.getMatKhau();

        if (Email == null || MatKhau == null) {
            model.addAttribute("errorMessage", "xin nhập email và mật khẩu");
            return "loginUv";
        }
        String loginFormUser = ungVienServices.checkloginungvien(Email, MatKhau);
        if (loginFormUser == null) {
            model.addAttribute("errorMessage", "tài khoản và mật khẩu không đúng");
            return "loginUv";
        }
        session.setAttribute("loginFormUserUV", loginFormUser);
        session.removeAttribute("loginFormUser");
        return "redirect:/home";
    }
    @GetMapping("/registerUv")
    public  String register(Model model,HttpSession session){


        model.addAttribute("registerUv",new UngVienModel());
        return "registerUv";

    }
    @PostMapping("/registerUv")
    public  String register(@Valid @ModelAttribute("registerUv") UngVien ungVien,BindingResult bindingResult,  Model model)throws IOException {
        if (bindingResult.hasErrors())  {

            return "registerUv";
        }
        String email = ungVien.getEmail();
        String e = ungVienServices.finemail(email);
        if (e != null)
        {
            model.addAttribute("msss","tài khoản email đã tồn tại");
            return "registerUv";
        }
        String MatKhau = ungVien.getMatKhau();
        String Hoten = ungVien.getHoten();
        String  SDT= ungVien.getSDT();
        String CMND = ungVien.getCMND();
        String  GioiTinh = ungVien.getGioiTinh();
        Date ngaySinh = ungVien.getNgaySinh();
        String diaChi  = ungVien.getDiaChi();
        String  honNhan = ungVien.getHonNhan();
        String thanhTich = ungVien.getThanhTich();
        ungVienServices.save( new  UngVienModel(Hoten,email,MatKhau,SDT,CMND,GioiTinh,ngaySinh,diaChi,honNhan,thanhTich));
        return "redirect:/home";
    }
    @GetMapping("/nophoso")
    public String danhsach(@RequestParam("id") String id ,Model model,HttpSession session){
        String MaBaiDang = id;
        session.setAttribute("idbd",MaBaiDang);
        model.addAttribute("nophoso",new HoSoUngTuyen());
        String mauv = (String) session.getAttribute("loginFormUserUV");
        if (mauv == null) {
            return "redirect:/loginUv";
        }


        return "nophoso";
    }
    @PostMapping("/nophoso")
    public String danhsach(@ModelAttribute("nophoso") HoSoUngTuyen hoSoUngTuyen,HttpSession session,Model model){
        String mauv = (String) session.getAttribute("loginFormUserUV");
        String mabd = (String) session.getAttribute("idbd");
        String MaBaiDang = mabd;
        String MaUngVien = mauv;
        Date NgayDangKy = new Date();
        String TinhTrang = "Chưa duyệt";
        String FileCV = hoSoUngTuyen.getFileCV();
        ungVienServices.save1(new HoSoUngTuyen(MaBaiDang,MaUngVien,NgayDangKy,TinhTrang,FileCV));
        return "redirect:/hoso";
    }
    @GetMapping("/hoso")
    public String hosouv(Model model,HttpSession session){
        String mauv = (String) session.getAttribute("loginFormUserUV");

        if (mauv == null) {
            return "redirect:/loginUv";
        }
        List<HoSoUngTuyen> finalluv = ungVienServices.finalluv(mauv);
        model.addAttribute("finalluv",finalluv);
        return "hoso";
    }
    @GetMapping("/deletehoso")
    public String deletehososs(@RequestParam("id") String id ,Model model,HttpSession session){
        ungVienServices.deldetehs(id);
        return "redirect:/hoso";
    }
    @GetMapping("/deletehocvan")
    public String deletehocvan(@RequestParam("id") String id ,Model model,HttpSession session){
        ungVienServices.deldete1(id);
        return "redirect:/cv";
    }
    @GetMapping("/deletekynang")
    public String deletekynang(@RequestParam("id") String id ,Model model,HttpSession session){
        ungVienServices.deldete2(id);
        return "redirect:/cv";
    }
    @GetMapping("/deletekinhnghiem")
    public String deletehoso(@RequestParam("id") String id ,Model model,HttpSession session){
        ungVienServices.deldete3(id);
        return "redirect:/cv";
    }
    @GetMapping("/hocvan")
    public String thongtinungvien(Model model,HttpSession session){
        String MaUngien = (String) session.getAttribute("loginFormUserUV");
        if (MaUngien == null) {
            return "redirect:/loginUv";
        }
        model.addAttribute("hocvan",new HocVan());


        return "hocvan";
    }
    @PostMapping("/hocvan")
    public  String hocvan(@Valid @ModelAttribute("hocvan") HocVan hocVan, BindingResult bindingResult,Model model,HttpSession session){
        String MaUngien = (String) session.getAttribute("loginFormUserUV");
        if (MaUngien == null) {
            return "redirect:/loginUv";
        }
        if (bindingResult.hasErrors())  {

            return "hocvan";
        }
        String  BangCap = hocVan.getBangCap();
           String Truong = hocVan.getTruong();
            Date ThoiGianTN = hocVan.getThoiGianTN();
            String NgoaiNgu = hocVan.getNgoaiNgu();
            String TrinhDo = hocVan.getTrinhDo();
            String MoTa = hocVan.getMoTa();
          ungVienServices.savehocvan( new HocVan(BangCap,Truong,ThoiGianTN,NgoaiNgu,TrinhDo,MoTa,MaUngien));

        return "redirect:/home";
    }
    @GetMapping("/kynang")
    public String kynang(Model model,HttpSession session){
        String MaUngien = (String) session.getAttribute("loginFormUserUV");
        if (MaUngien == null) {
            return "redirect:/loginUv";
        }
        model.addAttribute("kynang", new KyNang());
        return "kynang";
    }
    @PostMapping("/kynang")
    public String kynang(@Valid @ModelAttribute("kynang") KyNang kyNang, BindingResult bindingResult,HttpSession session){
        String MaUngien = (String) session.getAttribute("loginFormUserUV");
        if (MaUngien == null) {
            return "redirect:/loginUv";
        }
        if (bindingResult.hasErrors())  {

            return "kynang";
        }
        String KyNangCM= kyNang.getKyNangCM();
        int MucDo= kyNang.getMucDo();
        String MoTa= kyNang.getMoTa();
        ungVienServices.saveKyNang(new KyNang(KyNangCM,MucDo,MoTa,MaUngien));
        return "redirect:/home";
    }
    @GetMapping("/kinhnghiem")
    public String kinhnghiem(Model model,HttpSession session){
        String MaUngien = (String) session.getAttribute("loginFormUserUV");
        if (MaUngien == null) {
            return "redirect:/loginUv";
        }
        model.addAttribute("kinhnghiem", new KinhNghiem());
        return "kinhnghiem";
    }
    @PostMapping("/kinhnghiem")
    public String kinhnghiem(@Valid @ModelAttribute("kinhnghiem") KinhNghiem kinhNghiem, BindingResult bindingResult, HttpSession session){
        String MaUngien = (String) session.getAttribute("loginFormUserUV");
        if (MaUngien == null) {
            return "redirect:/loginUv";
        }
        if (bindingResult.hasErrors())  {
            return "kinhnghiem";
        }
        int KinhNghiem= kinhNghiem.getKinhNghiem();
        int SoNam= kinhNghiem.getSoNam() ;
        String CapBacHienTai= kinhNghiem.getCapBacHienTai() ;
        String CongTy= kinhNghiem.getCongTy() ;
        String ChucVu= kinhNghiem.getChucVu() ;
        Date ThoiGianBD= kinhNghiem.getThoiGianBD() ;
        Date ThoiGianKT= kinhNghiem.getThoiGianKT() ;
        String MoTaCV= kinhNghiem.getMoTaCV() ;
        ungVienServices.saveKinhNghiem(new KinhNghiem(KinhNghiem,SoNam,CapBacHienTai,CongTy,ChucVu,ThoiGianBD,ThoiGianKT,MoTaCV,MaUngien));
        
        return "redirect:/home";
    }
    @GetMapping("/cv")
    public  String  thongtinungvien(HttpSession session,Model model){
        String MaUngien = (String) session.getAttribute("loginFormUserUV");
        if (MaUngien == null) {

             return "redirect:/loginUv";
        }
        List<HocVan> hocVans = ungVienServices.finhocvan(MaUngien);
        List<KinhNghiem> kinhNghiems = ungVienServices.finKinhNghiem(MaUngien);
        List<KyNang> kyNangs = ungVienServices.finKyNang(MaUngien);
        List<UngVien> ungViens = ungVienServices.finungvien(MaUngien);
        model.addAttribute("listhocvan",hocVans);
        model.addAttribute("listkinhnghiem",kinhNghiems);
        model.addAttribute("listkynang",kyNangs);
        model.addAttribute("ungvien1",ungViens);
        return "cv";
    }

}
