package com.bkbk.blog.dao;

import com.bkbk.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);

    @Override
    Optional<Type> findById(Long aLong);

    @Override
    void delete(Type type);

    Optional<Type> save(Optional<Type> t);

    void delete(Long id);

}
