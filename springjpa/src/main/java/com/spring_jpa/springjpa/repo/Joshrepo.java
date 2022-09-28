package com.spring_jpa.springjpa.repo;

import com.spring_jpa.springjpa.entity.JoshEmplyee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Joshrepo extends JpaRepository<JoshEmplyee,Long> {
}
