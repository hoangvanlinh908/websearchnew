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
    @Column(name = "MaNganhNghe")
    private String MaNganhNghe;
    @Column(name = "TenCongViec")
    private String TenCongViec;
    public CongViec() {

    }


    public String getMaCongViec() {
        return MaCongViec;
    }

    public void setMaCongViec(String maCongViec) {
        MaCongViec = maCongViec;
    }

 

    public String getTenCongViec() {
        return TenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        TenCongViec = tenCongViec;
    }
}
