package com.msita.demo.form;


import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.websocket.OnMessage;
import java.util.Date;

@Entity
@Table(name = "kinhnghiem")


public class KinhNghiem {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGeneratorKIN")
    private String MaKinhNghiem;
    private byte  KinhNghiem;
    @Min(value = 1,message = "ko được bé hơn 1")
    @Positive(message = "nhập số")
    @NotNull(message = "không được để trống")
    private Integer SoNam ;
    @NotBlank(message = "không được để trống")
    private String CapBacHienTai;
    @NotBlank(message = "không được để trống")
    private String CongTy;
    @NotBlank(message = "không được để trống")
    private String ChucVu;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ThoiGianBD;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ThoiGianKT;
    @NotBlank(message = "không được để trống")
    private String MoTaCV;
    private String MaUngien;
//    @ManyToOne
//    @JoinColumn(name = "MaUngien")
//    private UngVien ungVien3;


    public KinhNghiem() {

    }

    public KinhNghiem(byte kinhNghiem, Integer soNam, String capBacHienTai, String congTy, String chucVu, Date thoiGianBD, Date thoiGianKT, String moTaCV, String maUngien) {
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
    public KinhNghiem( Integer soNam, String capBacHienTai, String congTy, String chucVu, Date thoiGianBD, Date thoiGianKT, String moTaCV, String maUngien) {
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

    public byte getKinhNghiem() {
        return KinhNghiem;
    }

    public void setKinhNghiem(byte kinhNghiem) {
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
