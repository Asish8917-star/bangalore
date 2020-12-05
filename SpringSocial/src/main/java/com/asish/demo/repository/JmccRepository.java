package com.asish.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asish.demo.entity.Jmcc_Patrapur;
@Repository
public interface JmccRepository extends JpaRepository<Jmcc_Patrapur, Integer> {

}
