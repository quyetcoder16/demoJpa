package com.example.demoJPA.DAO;

import com.example.demoJPA.entity.SinhVien;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class SinhVienDAOImple implements SinhVienDAO{

    EntityManager entityManager;

    @Autowired
    public SinhVienDAOImple(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(SinhVien sinhvien) {
        this.entityManager.persist(sinhvien);
    }
}
