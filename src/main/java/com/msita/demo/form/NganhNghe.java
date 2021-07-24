package com.msita.demo.form;



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "nganhnghe")


public class NganhNghe {
    @Id
    private String MaNganhNghe ;
    private String TenNganhNghe;
    private String Logo;
    @OneToMany(mappedBy ="nganhNghe",fetch = FetchType.EAGER)
    private List<Baidang> baidang;

    public NganhNghe() {

    }

    public NganhNghe(String maNganhNghe, String tenNganhNghe, String logo, List<Baidang> baidang) {
        MaNganhNghe = maNganhNghe;
        TenNganhNghe = tenNganhNghe;
        Logo = logo;
        this.baidang = baidang;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getMaNganhNghe() {
        return MaNganhNghe;
    }

    public void setMaNganhNghe(String maNganhNghe) {
        MaNganhNghe = maNganhNghe;
    }

    public String getTenNganhNghe() {
        return TenNganhNghe;
    }

    public void setTenNganhNghe(String tenNganhNghe) {
        TenNganhNghe = tenNganhNghe;
    }

    public List<Baidang> getBaidang() {
        return baidang;
    }

    public void setBaidang(List<Baidang> baidang) {
        this.baidang = baidang;
    }
}
