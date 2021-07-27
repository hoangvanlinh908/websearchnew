package com.msita.demo.repositories;

import com.msita.demo.form.Baidang;
import com.msita.demo.form.NhaTuyenDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NTDRepository extends JpaRepository<NhaTuyenDung,String> {
    @Query("SELECT u.MaNhaTuyenDung FROM NhaTuyenDung u WHERE u.Email = :email and u.MatKhau = :password")
    String quyery12(String email, String password );
}
