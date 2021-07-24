package com.msita.demo.repositories;

import com.msita.demo.form.Baidang;
import com.msita.demo.form.HocVan;
import com.msita.demo.models.BaidangModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HocVanRepository extends JpaRepository<HocVan,String> {
    @Query("SELECT m FROM HocVan m WHERE  m.MaUngien= :mauv")
    List<HocVan> finallbyhocvan(@Param("mauv") String mauv);
}
