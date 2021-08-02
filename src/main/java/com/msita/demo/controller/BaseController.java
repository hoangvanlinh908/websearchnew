package com.msita.demo.controller;


import com.msita.demo.form.NganhNghe;
import com.msita.demo.form.NhaTuyenDung;
import com.msita.demo.form.UngVien;
import com.msita.demo.form.search;
import com.msita.demo.models.NhaTuyenDungModel;
import com.msita.demo.services.NhaTuyenDungServices;
import com.msita.demo.services.UngVienServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpSession;
import java.util.List;

public class BaseController {
    @Autowired
    protected NhaTuyenDungServices nhaTuyenDungServices;
    @Autowired
    protected UngVienServices ungVienServices;
    @ModelAttribute("text")
    public String  nhaTuyenDungModelList(HttpSession session){
        return (String) session.getAttribute("loginFormUser");
    }
    @ModelAttribute("textUV")
    public String  ungvien(HttpSession session){
        return (String) session.getAttribute("loginFormUserUV");
    }
    @ModelAttribute("textn")
    public List<NhaTuyenDung> nhaTuyenDungs(HttpSession session){
        String loginUser = (String) session.getAttribute("loginFormUser");
        return  nhaTuyenDungServices.finbyidntd(loginUser);
    }
    @ModelAttribute("textn1")
    public List<UngVien> ungViens(HttpSession session){
        String loginUser = (String) session.getAttribute("loginFormUserUV");
        return  ungVienServices.finungvien(loginUser);
    }
    @ModelAttribute("listnn")
    public List<NganhNghe> nganhNgheList(HttpSession session){

        return  ungVienServices.nganhNgheList();
    }
    @ModelAttribute("search")
    public search Seach(){
        return new search();
    }
}
