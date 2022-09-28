package com.spring_jpa.springjpa.repo;

import com.spring_jpa.springjpa.entity.JoshEmplyee;
import com.spring_jpa.springjpa.entity.Laptop;
import com.spring_jpa.springjpa.entity.PersonalInformation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class LaptoprepoTest {
    public  Laptoprepo laptoprepo;
    @Test
    public  void saveLaptop(){
        PersonalInformation personalInformation = PersonalInformation.builder()
                .email("anirudh")
                .address("bng")
                .phoneno(79987989868L)
                .build();
        JoshEmplyee joshEmplyee = JoshEmplyee.builder()
                .Name("Anrudu")
                .personalInformation(personalInformation)
                .build();
        Laptop laptop= Laptop.builder()
                .laptopmodle("Dell")
                .joshEmplyee(joshEmplyee).build();

        laptoprepo.save(laptop);

    }

}