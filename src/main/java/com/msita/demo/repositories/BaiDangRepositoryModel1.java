package com.msita.demo.repositories;

import com.msita.demo.form.BaidangForm;
import com.msita.demo.models.BaidangModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiDangRepositoryModel1 extends JpaRepository<BaidangForm,String> {
}
