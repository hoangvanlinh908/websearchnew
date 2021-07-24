package com.msita.demo.repositories;

import com.msita.demo.form.NhaTuyenDung;
import com.msita.demo.models.NhaTuyenDungModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NTDModelRepository extends JpaRepository<NhaTuyenDungModel,String> {

    @Query("SELECT m FROM NhaTuyenDungModel m WHERE m.MaNhaTuyenDung = :title")
    NhaTuyenDungModel finallbyMA(@Param("title") String title);
}
