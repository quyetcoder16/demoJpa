package com.example.demoJPA.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SinhVien")
public class SinhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ho_ten")
    private String hoTen;

    @Column(name = "email")
    private String email;

    public SinhVien() {}

    public SinhVien(String hoTen, String email) {
        this.hoTen = hoTen;
        this.email = email;
    }


}
