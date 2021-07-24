package com.msita.demo.form;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "hocvan")


public class HocVan {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGeneratorHV")
    private String MaHocVan;
    @NotBlank
    private String BangCap;
    @NotBlank
    private String Truong;

    private Date ThoiGianTN;
    @NotBlank
    private String  NgoaiNgu;
    @NotBlank
    private String TrinhDo;
    @NotBlank
    private String MoTa;
    @NotBlank
    private String MaUngien;
//    @ManyToOne
//    @JoinColumn(name = "MaUngien")
//    private UngVien ungVien4;

    public HocVan() {

    }

    public HocVan( String bangCap, String truong, Date thoiGianTN, String ngoaiNgu, String trinhDo, String moTa, String maUngien) {

        BangCap = bangCap;
        Truong = truong;
        ThoiGianTN = thoiGianTN;
        NgoaiNgu = ngoaiNgu;
        TrinhDo = trinhDo;
        MoTa = moTa;
        MaUngien = maUngien;
    }

    public String getMaHocVan() {
        return MaHocVan;
    }

    public void setMaHocVan(String maHocVan) {
        MaHocVan = maHocVan;
    }

    public String getBangCap() {
        return BangCap;
    }

    public void setBangCap(String bangCap) {
        BangCap = bangCap;
    }

    public String getTruong() {
        return Truong;
    }

    public void setTruong(String truong) {
        Truong = truong;
    }

    public Date getThoiGianTN() {
        return ThoiGianTN;
    }

    public void setThoiGianTN(Date thoiGianTN) {
        ThoiGianTN = thoiGianTN;
    }

    public String getNgoaiNgu() {
        return NgoaiNgu;
    }

    public void setNgoaiNgu(String ngoaiNgu) {
        NgoaiNgu = ngoaiNgu;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        TrinhDo = trinhDo;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public String getMaUngien() {
        return MaUngien;
    }

    public void setMaUngien(String maUngien) {
        MaUngien = maUngien;
    }
}
