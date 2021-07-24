package com.msita.demo.form;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "congviec")

public class CongViec {
    @Id
    private String MaCongViec;
    private String TenCongViec;
    private String MaNganhNghe;

}
