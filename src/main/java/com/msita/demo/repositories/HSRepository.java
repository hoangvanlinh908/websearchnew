package com.msita.demo.repositories;

import com.msita.demo.form.HoSoUngTuyen;
import com.msita.demo.form.UngVien;
import com.msita.demo.models.NhaTuyenDungModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HSRepository extends JpaRepository<HoSoUngTuyen,Long> {
    @Query("SELECT m FROM HoSoUngTuyen m WHERE m.MaUngVien = :mauv")
    List<HoSoUngTuyen> finallbyMA(@Param("mauv") String mauv);
    @Query("SELECT m FROM HoSoUngTuyen m WHERE m.MaUngVien = :mauv and  m.MaBaiDang = :mabd")
    List<HoSoUngTuyen> finallbyMA1(@Param("mauv") String mauv, @Param("mabd") String mabd);
    @Query("SELECT m FROM HoSoUngTuyen m WHERE  m.MaBaiDang = :mabd")
    List<HoSoUngTuyen> finallbyMAbd( @Param("mabd") String mabd);
}
