package com.msita.demo.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "nhatuyendung")


public class NhaTuyenDungModel {

    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGenerator")
    private String MaNhaTuyenDung;
    @Email(message = "không được để trống @")
    @NotBlank(message = "không được để trống")
    private String Email;
    @NotBlank
    private String MatKhau;
    @NotBlank
    private String TenCongTy;
    @NotBlank
    private String LinhVuc;
    @NotBlank
    private String SoLuoc;
    @NotBlank
    private String DiaChi;
    @NotBlank
    private String MaSoThue;
    @NotBlank
    private String DoiTuong;
    private String Logo;

    private String XacMinh;
    private String TinhTrang;
//    @OneToMany(mappedBy ="nhaTuyenDung",fetch = FetchType.EAGER)
//    private List<Baidang> baidangs;


    public NhaTuyenDungModel() {

    }

    public NhaTuyenDungModel(String maNhaTuyenDung, @javax.validation.constraints.Email String email, @NotBlank String matKhau, @NotBlank String tenCongTy, @NotBlank String linhVuc, @NotBlank String soLuoc, @NotBlank String diaChi, @NotBlank String maSoThue, @NotBlank String doiTuong, String logo) {
        MaNhaTuyenDung = maNhaTuyenDung;
        Email = email;
        MatKhau = matKhau;
        TenCongTy = tenCongTy;
        LinhVuc = linhVuc;
        SoLuoc = soLuoc;
        DiaChi = diaChi;
        MaSoThue = maSoThue;
        DoiTuong = doiTuong;
        Logo = logo;

    }

    public NhaTuyenDungModel(String email, String matKhau, String tenCongTy, String linhVuc, String logo, String soLuoc, String diaChi, String maSoThue, String doiTuong) {
        Email = email;
        MatKhau = matKhau;
        TenCongTy = tenCongTy;
        LinhVuc = linhVuc;
        Logo = logo;
        SoLuoc = soLuoc;
        DiaChi = diaChi;
        MaSoThue = maSoThue;
        DoiTuong = doiTuong;
    }

    public String getMaNhaTuyenDung() {
        return MaNhaTuyenDung;
    }

    public void setMaNhaTuyenDung(String maNhaTuyenDung) {
        MaNhaTuyenDung = maNhaTuyenDung;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getTenCongTy() {
        return TenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        TenCongTy = tenCongTy;
    }

    public String getLinhVuc() {
        return LinhVuc;
    }

    public void setLinhVuc(String linhVuc) {
        LinhVuc = linhVuc;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getSoLuoc() {
        return SoLuoc;
    }

    public void setSoLuoc(String soLuoc) {
        SoLuoc = soLuoc;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getMaSoThue() {
        return MaSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        MaSoThue = maSoThue;
    }

    public String getDoiTuong() {
        return DoiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        DoiTuong = doiTuong;
    }

    public String getXacMinh() {
        return XacMinh;
    }

    public void setXacMinh(String xacMinh) {
        XacMinh = xacMinh;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }
}
