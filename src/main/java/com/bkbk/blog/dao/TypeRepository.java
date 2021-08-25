package com.bkbk.blog.dao;

import com.bkbk.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TypeRepository extends JpaRepository<Type,Long>, CrudRepository<Type, Long> {


   Type findByName(String name);

   @Query("select t from Type t")
   List<Type> findTop(Pageable pageable);

}
