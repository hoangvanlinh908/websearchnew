package com.msita.demo.repositories;

import com.msita.demo.form.UngVien;
import com.msita.demo.models.UngVienModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UVRepositoryModel extends JpaRepository<UngVienModel,String> {

}
