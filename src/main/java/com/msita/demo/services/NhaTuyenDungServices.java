package com.msita.demo.services;

import com.msita.demo.form.Baidang;
import com.msita.demo.form.HoSoUngTuyen;
import com.msita.demo.form.NganhNghe;
import com.msita.demo.form.NhaTuyenDung;
import com.msita.demo.models.BaidangModel;
import com.msita.demo.models.NhaTuyenDungModel;
import com.msita.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class NhaTuyenDungServices {
    @Autowired
    private HSRepository hsRepository;
    @Autowired
    private BaiDangRepository baiDangRepository;
    @Autowired
    private NTDRepository ntdRepository;
    @Autowired
    private NTDModelRepository ntdModelRepository;
    @Autowired
    private BaiDangRepositoryModel baiDangRepositoryModel;
    @Autowired
    private BaiDangRepositoryModel1 baiDangRepositoryModel1;
    @Autowired
    private NganhNgheRepository nganhNgheRepository;
    public List<Baidang> finall(){
        return  baiDangRepository.findAll();
    }
    @Transactional
    public  String getlogin(String email, String mtakhau){
        return ntdRepository.quyery1(email,mtakhau);
    }
    @Transactional
    public void  save(NhaTuyenDung nhaTuyenDung){
        ntdRepository.save(nhaTuyenDung);
    }
    @Transactional
    public void  save1(NhaTuyenDungModel nhaTuyenDung){
       ntdModelRepository.save(nhaTuyenDung);
    }
    @Transactional
    public void  save2(BaidangModel baidangModel){
        baiDangRepositoryModel.save(baidangModel);
    }
    public List<NganhNghe> finallNN(){
        return  nganhNgheRepository.findAll();
    }
    public NhaTuyenDungModel finallByidntd(String ma){
        return ntdModelRepository.finallbyMA(ma);
    }

    public List<NhaTuyenDung> finbyidntd(String ma){
        return  ntdRepository.findAllById(Collections.singleton(ma));
    }
    public List<NhaTuyenDungModel> finbyidntd1(String ma){
        return  ntdModelRepository.findAllById(Collections.singleton(ma));
    }
    public List<Baidang> finbyid(String id){
        return baiDangRepository.findAllById(Collections.singleton(id));
    }
    public  List<BaidangModel> finbymantd(String mantd){
        return baiDangRepositoryModel.finallbyBD(mantd);
    }
    @Transactional
    public List<HoSoUngTuyen> finallbd(String mabd ){
        return  hsRepository.finallbyMAbd(mabd);
    }
    public void  deldetehs(Long id){
        hsRepository.deleteById(id);
    }
    public  List<BaidangModel> searchname(String ten){
        return  baiDangRepositoryModel.searchByNameLike(ten);
    }
    public List<Baidang> search(String mann,String Name)
    {
        return baiDangRepository.searchByNameLike1(mann, Name);
    }
    public List<Baidang> search2(String Name)
    {
        return baiDangRepository.searchByNameLike2( Name);
    }
    public List<Baidang> search3(String mann)
    {
        return baiDangRepository.searchByNameLike3( mann);
    }
}
