package com.msita.demo.form;



public class search {
    private  String TieuDe;
    private String NganhNghe;

    public search() {

    }
    public search(String tieuDe, String nganhNghe) {
        TieuDe = tieuDe;
        NganhNghe = nganhNghe;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String tieuDe) {
        TieuDe = tieuDe;
    }

    public String getNganhNghe() {
        return NganhNghe;
    }

    public void setNganhNghe(String nganhNghe) {
        NganhNghe = nganhNghe;
    }
}
