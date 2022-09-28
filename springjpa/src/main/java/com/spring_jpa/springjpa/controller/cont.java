package com.spring_jpa.springjpa.controller;

import com.spring_jpa.springjpa.entity.JoshEmplyee;
import com.spring_jpa.springjpa.repo.Joshrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class cont {
    @Autowired
    private Joshrepo joshrepo ;

    @PostMapping("/save")
    public JoshEmplyee savedata (@RequestBody JoshEmplyee joshEmplyee){
        return  joshrepo.save(joshEmplyee);
    }



}
