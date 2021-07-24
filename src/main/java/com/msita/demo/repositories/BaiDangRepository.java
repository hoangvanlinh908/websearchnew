package com.msita.demo.repositories;

import com.msita.demo.form.Baidang;
import com.msita.demo.form.NhaTuyenDung;
import com.msita.demo.models.BaidangModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaiDangRepository extends JpaRepository<Baidang,String> {
    @Query("SELECT m FROM Baidang m WHERE m.nganhNghe.MaNganhNghe = :MaNganhNghe and  m.TieuDe LIKE :title%")
    List<Baidang> searchByNameLike1(@Param("MaNganhNghe") String MaNganhNghe, @Param("title") String title);
    @Query("SELECT m FROM Baidang m WHERE   m.TieuDe LIKE :title%")
    List<Baidang> searchByNameLike2(@Param("title") String title);
    @Query("SELECT m FROM Baidang m WHERE m.nganhNghe.MaNganhNghe = :MaNganhNghe")
    List<Baidang> searchByNameLike3(@Param("MaNganhNghe") String MaNganhNghe);

}
