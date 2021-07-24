package com.msita.demo.repositories;

import com.msita.demo.form.NganhNghe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NganhNgher extends JpaRepository<NganhNghe,Long> {

}
