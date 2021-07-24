package com.msita.demo.form;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hosoungtuyen")

public class HoSoUngTuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String MaBaiDang;
    private String MaUngVien;
//    @ManyToOne
//    @JoinColumn(name = "MaBaiDang")
//    private Baidang baidang;
//    @ManyToOne
//    @JoinColumn(name = "MaUngVien")
//    private UngVien ungVien1;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date NgayDangKy;
    private String TinhTrang;
    private String FileCV;

    public HoSoUngTuyen() {

    }

    public HoSoUngTuyen(String maBaiDang, String maUngVien, Date ngayDangKy, String tinhTrang, String fileCV) {
        MaBaiDang = maBaiDang;
        MaUngVien = maUngVien;
        NgayDangKy = ngayDangKy;
        TinhTrang = tinhTrang;
        FileCV = fileCV;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
