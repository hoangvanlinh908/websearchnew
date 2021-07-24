package com.msita.demo.form;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "kynang")


public class KyNang {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGeneratorKN")
    private String  MaKyNang;
    @NotBlank
    private String KyNangCM;
    @Min(1)
    private Integer MucDo;
    @NotBlank
    private String MoTa;
    private String MaUngien;
//    @ManyToOne
//    @JoinColumn(name = "MaUngien")
//    private UngVien ungVien2;

    public KyNang() {

    }

    public KyNang(String kyNangCM, Integer mucDo, String moTa, String maUngien) {
        KyNangCM = kyNangCM;
        MucDo = mucDo;
        MoTa = moTa;
        MaUngien = maUngien;
    }

    public String getMaKyNang() {
        return MaKyNang;
    }

    public void setMaKyNang(String maKyNang) {
        MaKyNang = maKyNang;
    }

    public String getKyNangCM() {
        return KyNangCM;
    }

    public void setKyNangCM(String kyNangCM) {
        KyNangCM = kyNangCM;
    }

    public Integer getMucDo() {
        return MucDo;
    }

    public void setMucDo(Integer mucDo) {
        MucDo = mucDo;
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
