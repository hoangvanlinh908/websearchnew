package com.msita.demo.repositories;

import com.msita.demo.form.HocVan;
import com.msita.demo.form.KinhNghiem;
import com.msita.demo.form.KyNang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KyNangRepository extends JpaRepository<KyNang,String> {
    @Query("SELECT m FROM KyNang m WHERE  m.MaUngien= :mauv")
    List<KyNang> finallbykynang(@Param("mauv") String mauv);
}
