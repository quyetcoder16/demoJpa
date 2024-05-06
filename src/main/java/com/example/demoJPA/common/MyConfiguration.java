package com.example.demoJPA.common;

import com.example.demoJPA.DAO.SinhVienDAOImple;
import com.example.demoJPA.entity.SinhVien;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class MyConfiguration {
    @Bean
    public CommandLineRunner getRunner(SinhVienDAOImple sinhVienDAOImple){
        return Runner -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap ten : ");
            String ten = scanner.nextLine();
            System.out.println("nhap email");
            String email = scanner.nextLine();

            SinhVien sv = new SinhVien(ten,email);
            sinhVienDAOImple.save(sv);

        };
    }
}
