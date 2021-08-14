package com.bkbk.blog.dao;

import com.bkbk.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<Type,Long>, CrudRepository<Type, Long> {


   Type findByName(String name);



}
