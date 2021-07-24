package com.msita.demo.form;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "kinhnghiem")


public class KinhNghiem {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGeneratorKIN")
    private String MaKinhNghiem;
    @Min(1)
    private Integer  KinhNghiem;
    @Min(1)
    private Integer SoNam ;
    @NotBlank
    private String CapBacHienTai;
    @NotBlank
    private String CongTy;
    @NotBlank
    private String ChucVu;

    private Date ThoiGianBD;

    private Date ThoiGianKT;
    @NotBlank
    private String MoTaCV;
    private String MaUngien;
//    @ManyToOne
//    @JoinColumn(name = "MaUngien")
//    private UngVien ungVien3;


    public KinhNghiem() {

    }

    public KinhNghiem(Integer kinhNghiem, Integer soNam, String capBacHienTai, String congTy, String chucVu, Date thoiGianBD, Date thoiGianKT, String moTaCV, String maUngien) {
        KinhNghiem = kinhNghiem;
        SoNam = soNam;
        CapBacHienTai = capBacHienTai;
        CongTy = congTy;
        ChucVu = chucVu;
        ThoiGianBD = thoiGianBD;
        ThoiGianKT = thoiGianKT;
        MoTaCV = moTaCV;
        MaUngien = maUngien;
    }

    public String getMaKinhNghiem() {
        return MaKinhNghiem;
    }

    public void setMaKinhNghiem(String maKinhNghiem) {
        MaKinhNghiem = maKinhNghiem;
    }

    public Integer getKinhNghiem() {
        return KinhNghiem;
    }

    public void setKinhNghiem(Integer kinhNghiem) {
        KinhNghiem = kinhNghiem;
    }

    public Integer getSoNam() {
        return SoNam;
    }

    public void setSoNam(Integer soNam) {
        SoNam = soNam;
    }

    public String getCapBacHienTai() {
        return CapBacHienTai;
    }

    public void setCapBacHienTai(String capBacHienTai) {
        CapBacHienTai = capBacHienTai;
    }

    public String getCongTy() {
        return CongTy;
    }

    public void setCongTy(String congTy) {
        CongTy = congTy;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String chucVu) {
        ChucVu = chucVu;
    }

    public Date getThoiGianBD() {
        return ThoiGianBD;
    }

    public void setThoiGianBD(Date thoiGianBD) {
        ThoiGianBD = thoiGianBD;
    }

    public Date getThoiGianKT() {
        return ThoiGianKT;
    }

    public void setThoiGianKT(Date thoiGianKT) {
        ThoiGianKT = thoiGianKT;
    }

    public String getMoTaCV() {
        return MoTaCV;
    }

    public void setMoTaCV(String moTaCV) {
        MoTaCV = moTaCV;
    }

    public String getMaUngien() {
        return MaUngien;
    }

    public void setMaUngien(String maUngien) {
        MaUngien = maUngien;
    }
}
