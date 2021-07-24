package com.msita.demo.repositories;

import com.msita.demo.form.HocVan;
import com.msita.demo.form.KyNang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KyNangRepository extends JpaRepository<KyNang,String> {
}
