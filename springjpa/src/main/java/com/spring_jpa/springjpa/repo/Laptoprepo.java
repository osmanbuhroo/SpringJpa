package com.spring_jpa.springjpa.repo;

import com.spring_jpa.springjpa.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Laptoprepo extends JpaRepository<Laptop,Long> {
}
