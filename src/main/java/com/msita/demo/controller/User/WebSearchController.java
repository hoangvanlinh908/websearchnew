package com.msita.demo.controller.User;

import com.msita.demo.controller.BaseController;
import com.msita.demo.form.Baidang;
import com.msita.demo.form.search;
import com.msita.demo.services.NhaTuyenDungServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.util.List;
@Controller
public class WebSearchController extends BaseController {
    @Autowired
    private NhaTuyenDungServices nhaTuyenDungServices;

    @GetMapping("/home")
    public  String findBaiDang(Model model, HttpSession session){
            List<Baidang> finall= nhaTuyenDungServices.finall();
        String loginUser = (String) session.getAttribute("loginFormUser");
        String loginUserUV = (String) session.getAttribute("loginFormUserUV");
//        List<NhaTuyenDung> nhaTuyenDung = nhaTuyenDungServices.finbyidntd(loginUser);
//        model.addAttribute("textn",nhaTuyenDung);
//        model.addAttribute("text",loginUser);
//        model.addAttribute("textUV",loginUserUV);
        model.addAttribute("text1",nhaTuyenDungServices.finallByidntd(loginUser));
        model.addAttribute("findBD",finall);
        return "homepage";
    }
    @GetMapping("/deltail-id")
    public String deltail(@RequestParam("id") String id, Model model){
        //  Tạo List để chưa các thuộc tính của product theo id
        List<Baidang> baidang = nhaTuyenDungServices.finbyid(id);
        // Thêm mới một đối tượng deltail vào model
        model.addAttribute("text123",baidang);
        // Trả về deltail
        return "deltail";

    }
    // Đường dẫn lúc này là: /search và method GET
    @GetMapping("/search")
    public String shopSearch(Model model, HttpSession session){
        // Lấy name từ session search1
        String mann = (String) session.getAttribute("search1");
        String name = (String) session.getAttribute("search2");
        //  Tạo List để chưa các Product được tìm kiếm theo tên
        if(mann.equals("1") ){
            List<Baidang> baidangModels = nhaTuyenDungServices.search2(name);
            model.addAttribute("search2",baidangModels);
        }
        else {
            List<Baidang> baidangModels = nhaTuyenDungServices.search(mann, name);
            // Thêm mới một đối tượng search2 vào model
            model.addAttribute("search2", baidangModels);
        } // Trả về shop-product
        return "homepagesearch";
    }
    // Đường dẫn lúc này là: /search và method POST
    @PostMapping("/search")
    public String getSearch(@ModelAttribute("search") search search, Model model, HttpSession session) {
        // Tạo Biến name lấy từ model search lấy name
        String name = search.getTieuDe();
        String nganhnghe = search.getNganhNghe();
        if (name == null || name.equals(""))
        {
            // Thêm mới một đối tượng mess9 vào model
            model.addAttribute("mess9","ko có sản phẩm ");
        }
        // Thêm name vào session search1
        session.setAttribute("search1", nganhnghe);
        session.setAttribute("search2", name);
        // Trả về search
        return "redirect:/search";
    }
    @GetMapping("nganhnghe")
    public String ngangnghe(@RequestParam("id") String id,Model model){
        List<Baidang> listnn =  nhaTuyenDungServices.search3(id);
        model.addAttribute("listnn1",listnn);
        return "nganhnghelist";
    }
}
