package com.asish.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asish.demo.entity.JmccAccount;
@Repository
public interface JmccAccountRepository extends JpaRepository<JmccAccount, Integer> {

}
