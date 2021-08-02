package com.msita.demo.models;


import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ungvien")


public class UngVienModel {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGeneratorUV")

    private String MaUngVien;
    private String Hoten;
    private String Email;
    private String MatKhau;
    private String SDT;
    private String CMND;
    private String GioiTinh;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date NgaySinh;
    private String DiaChi;
    private String HonNhan;
    private String ThanhTich;
//    @OneToMany(mappedBy ="ungVien1",fetch = FetchType.EAGER)
//    private List<HoSoUngTuyen> hoSoUngTuyens;
//
//    @OneToMany(mappedBy ="ungVien2",fetch = FetchType.EAGER)
//    private List<KyNang> kyNangs;
//
//    @OneToMany(mappedBy ="ungVien3",fetch = FetchType.EAGER)
//    private List<KinhNghiem> kinhNghiems;
//    @OneToMany(mappedBy ="ungVien4",fetch = FetchType.EAGER)
//    private List<HocVan> hocVans;
public UngVienModel() {

}

    public UngVienModel(String maUngVien, String hoten, String email, String matKhau, String SDT, String CMND, String gioiTinh, Date ngaySinh, String diaChi, String honNhan, String thanhTich) {
        MaUngVien = maUngVien;
        Hoten = hoten;
        Email = email;
        MatKhau = matKhau;
        this.SDT = SDT;
        this.CMND = CMND;
        GioiTinh = gioiTinh;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
        HonNhan = honNhan;
        ThanhTich = thanhTich;
    }

    public UngVienModel(String hoten, String email, String matKhau, String SDT, String CMND, String gioiTinh, Date ngaySinh, String diaChi, String honNhan, String thanhTich) {

        Hoten = hoten;
        Email = email;
        MatKhau = matKhau;
        this.SDT = SDT;
        this.CMND = CMND;
        GioiTinh = gioiTinh;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
        HonNhan = honNhan;
        ThanhTich = thanhTich;
    }

    public String getMaUngVien() {
        return MaUngVien;
    }

    public void setMaUngVien(String maUngVien) {
        MaUngVien = maUngVien;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
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

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getHonNhan() {
        return HonNhan;
    }

    public void setHonNhan(String honNhan) {
        HonNhan = honNhan;
    }

    public String getThanhTich() {
        return ThanhTich;
    }

    public void setThanhTich(String thanhTich) {
        ThanhTich = thanhTich;
    }
}
