package com.msita.demo.repositories;

import com.msita.demo.form.HocVan;
import com.msita.demo.form.KinhNghiem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface kinhnghiemRepository extends JpaRepository<KinhNghiem,String> {
    @Query("SELECT m FROM KinhNghiem m WHERE  m.MaUngien= :mauv")
    List<KinhNghiem> finallbyKinhNghiem(@Param("mauv") String mauv);
}
