package com.msita.demo.form;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "congviec")

public class CongViec {
    @Id
//    @GeneratedValue(generator = "my_generator")
//    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGeneratorBD")
    @Column(name = "MaCongViec")
    private String MaCongViec;
    @Column(name = "mabaidang")
    private String mabaidang;
    @Column(name = "TenCongViec")
    private String TenCongViec;
    public CongViec() {

    }
    public CongViec(String maCongViec, String mabaidang, String tenCongViec) {
        MaCongViec = maCongViec;
        this.mabaidang = mabaidang;
        TenCongViec = tenCongViec;
    }

    public String getMaCongViec() {
        return MaCongViec;
    }

    public void setMaCongViec(String maCongViec) {
        MaCongViec = maCongViec;
    }

    public String getMabaidang() {
        return mabaidang;
    }

    public void setMabaidang(String mabaidang) {
        this.mabaidang = mabaidang;
    }

    public String getTenCongViec() {
        return TenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        TenCongViec = tenCongViec;
    }
}
