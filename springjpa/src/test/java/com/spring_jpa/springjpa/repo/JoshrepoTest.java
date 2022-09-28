package com.spring_jpa.springjpa.repo;

import com.spring_jpa.springjpa.entity.JoshEmplyee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class JoshrepoTest {
    @Autowired
    Joshrepo joshrepo;

    @Test
    public void savedata(){
        JoshEmplyee joshEmplyee = JoshEmplyee.builder()
                .Name("Lohith")
                .build();
        joshrepo.save(joshEmplyee);
    }

}