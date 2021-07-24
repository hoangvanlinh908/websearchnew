package com.msita.demo.repositories;

import com.msita.demo.form.NhaTuyenDung;
import com.msita.demo.form.UngVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UVRepository extends JpaRepository<UngVien,String> {
    @Query("SELECT u.MaUngVien FROM UngVien u WHERE u.Email = :email and u.MatKhau = :password")
    String quyery1(String email, String password );
}
