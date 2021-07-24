package com.msita.demo.repositories;

import com.msita.demo.form.Baidang;
import com.msita.demo.form.NganhNghe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NganhNgheRepository extends JpaRepository<NganhNghe,String> {
}
