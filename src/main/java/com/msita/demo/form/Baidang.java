package com.msita.demo.form;


import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "baidang")

public class Baidang {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.msita.demo.controller.MyGeneratorBD")
    @Column(name = "MaBaiDang")
    private String MaBaiDang;
    @Column(name = "TieuDe")
    private String TieuDe;
    @Column(name = "NgayDang")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date NgayDang;
    @Column(name = "SLTuyenDung")
    private Integer SLTuyenDung;
    @Column(name = "TinhChat")
    private String TinhChat;
    @Column(name = "MucLuong")
    private String MucLuong;
    @Column(name = "DiaChiLamViec")
    private String DiaChiLamViec;
    @Column(name = "TieuChi")
    private String TieuChi;
    @Column(name = "ChiTietCV")
    private String ChiTietCV;
    @Column(name = "HinhAnh")
    private String HinhAnh;
    @Column(name = "TinhTrang")
    private String TinhTrang;
    @Column(name = "MaNhaTuyenDung")
    private String MaNhaTuyenDung;
//    @Column(name = "MaNganhNghe")
//    private String MaNganhNghe;
//    @ManyToOne
//    @JoinColumn(name = "MaNhaTuyenDung")
//    private NhaTuyenDung nhaTuyenDung;
   @ManyToOne
   @JoinColumn(name = "MaNganhNghe")
   private NganhNghe nganhNghe;
//
//
//    @OneToMany(mappedBy ="baidang",fetch = FetchType.EAGER)
//    private List<HoSoUngTuyen> hoSoUngTuyens;

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getMaBaiDang() {
        return MaBaiDang;
    }

    public void setMaBaiDang(String maBaiDang) {
        MaBaiDang = maBaiDang;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String tieuDe) {
        TieuDe = tieuDe;
    }

    public Date getNgayDang() {
        return NgayDang;
    }

    public void setNgayDang(Date ngayDang) {
        NgayDang = ngayDang;
    }

    public Integer getSLTuyenDung() {
        return SLTuyenDung;
    }

    public void setSLTuyenDung(Integer SLTuyenDung) {
        this.SLTuyenDung = SLTuyenDung;
    }

    public String getTinhChat() {
        return TinhChat;
    }

    public void setTinhChat(String tinhChat) {
        TinhChat = tinhChat;
    }

    public String getMucLuong() {
        return MucLuong;
    }

    public void setMucLuong(String mucLuong) {
        MucLuong = mucLuong;
    }

    public String getDiaChiLamViec() {
        return DiaChiLamViec;
    }

    public void setDiaChiLamViec(String diaChiLamViec) {
        DiaChiLamViec = diaChiLamViec;
    }

    public String getTieuChi() {
        return TieuChi;
    }

    public void setTieuChi(String tieuChi) {
        TieuChi = tieuChi;
    }

    public String getChiTietCV() {
        return ChiTietCV;
    }

    public void setChiTietCV(String chiTietCV) {
        ChiTietCV = chiTietCV;
    }


    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }

    public String getMaNhaTuyenDung() {
        return MaNhaTuyenDung;
    }

    public void setMaNhaTuyenDung(String maNhaTuyenDung) {
        MaNhaTuyenDung = maNhaTuyenDung;
    }

    public NganhNghe getNganhNghe() {
        return nganhNghe;
    }

    public void setNganhNghe(NganhNghe nganhNghe) {
        this.nganhNghe = nganhNghe;
    }
}
