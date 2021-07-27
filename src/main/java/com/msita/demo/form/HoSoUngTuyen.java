package com.msita.demo.form;


import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hosoungtuyen")

public class HoSoUngTuyen {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGeneratorCC")

    private String id;
    private String MaBaiDang;
    private String MaUngVien;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date NgayDangKy;
    private String TinhTrang;
    private String FileCV;

    public HoSoUngTuyen() {

    }

    public HoSoUngTuyen(String id, String maBaiDang, String maUngVien, Date ngayDangKy, String tinhTrang, String fileCV) {
        this.id = id;
        MaBaiDang = maBaiDang;
        MaUngVien = maUngVien;
        NgayDangKy = ngayDangKy;
        TinhTrang = tinhTrang;
        FileCV = fileCV;
    }

    public HoSoUngTuyen(String maBaiDang, String maUngVien, Date ngayDangKy, String tinhTrang, String fileCV) {
        MaBaiDang = maBaiDang;
        MaUngVien = maUngVien;
        NgayDangKy = ngayDangKy;
        TinhTrang = tinhTrang;
        FileCV = fileCV;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaBaiDang() {
        return MaBaiDang;
    }

    public void setMaBaiDang(String maBaiDang) {
        MaBaiDang = maBaiDang;
    }

    public String getMaUngVien() {
        return MaUngVien;
    }

    public void setMaUngVien(String maUngVien) {
        MaUngVien = maUngVien;
    }

    public Date getNgayDangKy() {
        return NgayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        NgayDangKy = ngayDangKy;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }

    public String getFileCV() {
        return FileCV;
    }

    public void setFileCV(String fileCV) {
        FileCV = fileCV;
    }
}
