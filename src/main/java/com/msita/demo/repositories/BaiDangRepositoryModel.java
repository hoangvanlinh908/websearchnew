package com.msita.demo.repositories;

import com.msita.demo.form.Baidang;
import com.msita.demo.form.HoSoUngTuyen;
import com.msita.demo.models.BaidangModel;
import com.msita.demo.models.NhaTuyenDungModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaiDangRepositoryModel extends JpaRepository<BaidangModel,String> {
    @Query("SELECT m FROM BaidangModel m WHERE  m.MaNhaTuyenDung= :mabd")
    List<BaidangModel> finallbyBD(@Param("mabd") String mabd);
    @Query("SELECT m FROM BaidangModel m WHERE m.TieuDe LIKE %:title%")
    List<BaidangModel> searchByNameLike(@Param("title") String title);
    @Query("SELECT m FROM BaidangModel m WHERE m.MaNganhNghe = :MaNganhNghe and  m.TieuDe LIKE :title%")
    List<BaidangModel> searchByNameLike1(@Param("MaNganhNghe") String MaNganhNghe, @Param("title") String title);
    @Query("SELECT m FROM BaidangModel m WHERE m.MaBaiDang = :title")
    BaidangModel finallbyMABD(@Param("title") String title);
}
