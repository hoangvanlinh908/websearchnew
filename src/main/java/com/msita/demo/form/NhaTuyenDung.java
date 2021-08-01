package com.msita.demo.form;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "nhatuyendung")


public class NhaTuyenDung {

    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGenerator")
    private String MaNhaTuyenDung;
    @NotBlank(message = "không được để trống")
    @Email(message = "không được để trống @")
    private String Email;
    @NotBlank(message = "không được để trống")
    private String MatKhau;
    @NotBlank(message = "không được để trống")
    private String TenCongTy;
    @NotBlank(message = "không được để trống")
    private String LinhVuc;
    @NotBlank(message = "không được để trống")
    private String SoLuoc;
    @NotBlank(message = "không được để trống")
    private String DiaChi;
    @Positive(message = "nhập số")
    @Size(min = 12,max = 12 ,message = "mã số thuế 12 số")
    private String MaSoThue;
    @NotBlank(message = "không được để trống")
    private String DoiTuong;
    private String XacMinh;
    private String TinhTrang;


    public NhaTuyenDung(String maNhaTuyenDung, @javax.validation.constraints.Email String email, @NotBlank String matKhau, @NotBlank String tenCongTy, @NotBlank String linhVuc, @NotBlank String soLuoc, @NotBlank String diaChi, @NotBlank String maSoThue, @NotBlank String doiTuong) {
        MaNhaTuyenDung = maNhaTuyenDung;
        Email = email;
        MatKhau = matKhau;
        TenCongTy = tenCongTy;
        LinhVuc = linhVuc;
        SoLuoc = soLuoc;
        DiaChi = diaChi;
        MaSoThue = maSoThue;
        DoiTuong = doiTuong;

    }

    public NhaTuyenDung() {

    }

    public NhaTuyenDung(String email, String matKhau, String tenCongTy, String linhVuc, String soLuoc, String diaChi, String maSoThue, String doiTuong) {
        Email = email;
        MatKhau = matKhau;
        TenCongTy = tenCongTy;
        LinhVuc = linhVuc;

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
