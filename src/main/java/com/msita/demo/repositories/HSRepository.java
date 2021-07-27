package com.msita.demo.repositories;

import com.msita.demo.form.HoSoUngTuyen;
import com.msita.demo.form.UngVien;
import com.msita.demo.models.NhaTuyenDungModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface HSRepository extends JpaRepository<HoSoUngTuyen,String> {
    @Query("SELECT m FROM HoSoUngTuyen m WHERE m.MaUngVien = :mauv")
    List<HoSoUngTuyen> finallbyMA(@Param("mauv") String mauv);
    @Query("SELECT m FROM HoSoUngTuyen m WHERE m.MaUngVien = :mauv and  m.MaBaiDang = :mabd")
    List<HoSoUngTuyen> finallbyMA1(@Param("mauv") String mauv, @Param("mabd") String mabd);
    @Transactional
    @Modifying
    @Query("SELECT m FROM HoSoUngTuyen m WHERE  m.MaBaiDang = :mabd")
    List<HoSoUngTuyen> finallbyMAbd( @Param("mabd") String mabd);
    @Transactional
    @Modifying
    @Query("DELETE  FROM HoSoUngTuyen m WHERE  m.MaBaiDang = :mabd")
    void deleteHoSoUngTuyenByMaBaiDang( @Param("mabd") String mabd);
    @Query("SELECT m FROM HoSoUngTuyen m WHERE  m.id = :mabd")
   HoSoUngTuyen finallbycc( @Param("mabd") String mabd);
}