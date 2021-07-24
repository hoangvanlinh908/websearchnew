package com.msita.demo.services;

import com.msita.demo.form.*;
import com.msita.demo.models.BaidangModel;
import com.msita.demo.models.UngVienModel;
import com.msita.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
public class UngVienServices {
    @Autowired
    private UVRepository uvRepository;
    @Autowired
    private HSRepository hsRepository;
    @Autowired
    private UVRepositoryModel uvRepositorymodel;
    @Autowired
    private HocVanRepository hocVanRepository;
    @Autowired
    private KyNangRepository kyNangRepository;
    @Autowired
    private kinhnghiemRepository kinhnghiemRepository;
@Autowired
private NganhNgher nganhNghe;

    @Transactional
    public String checkloginungvien(String email,String matkhau){
        return uvRepository.quyery1(email, matkhau);
    }
    @Transactional
    public void save(UngVienModel s){
        uvRepositorymodel.save(s);
    }
    @Transactional
    public void save1(HoSoUngTuyen s){
        hsRepository.save(s);
    }
    @Transactional
    public List<HoSoUngTuyen> finalluv(String mauv ){
        return  hsRepository.finallbyMA(mauv);
    }
    public void  deldetehs(Long id){
        hsRepository.deleteById(id);
    }
    public  void  savehocvan(HocVan hocVan){
        hocVanRepository.save(hocVan);
    }
    public  void  saveKinhNghiem(KinhNghiem kinhNghiem){
        kinhnghiemRepository.save(kinhNghiem);
    }
    public  void  saveKyNang(KyNang kyNang){
        kyNangRepository.save(kyNang);
    }
    public List<NganhNghe> nganhNgheList()
    {
        return nganhNghe.findAll();
    }
    @Transactional
    public List<HocVan> finhocvan(String ma ){
        return hocVanRepository.finallbyhocvan(ma);
    }
    @Transactional
    public List<KinhNghiem> finKinhNghiem(String ma ){
        return kinhnghiemRepository.finallbyKinhNghiem(ma);
    }
    @Transactional
    public List<KyNang> finKyNang(String ma ){
        return kyNangRepository.findAllById(Collections.singleton(ma));
    }
    public void  deldete1(String id){
        hocVanRepository.deleteById(id);
    }
    public void  deldete2(String id){
        kyNangRepository.deleteById(id);
    }
    public void  deldete3(String id){
        kinhnghiemRepository.deleteById(id);
    }
}
