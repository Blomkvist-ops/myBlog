package com.bkbk.blog.service;

import com.bkbk.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TypeService {
    Type saveType(Type type);

    Optional<Type> getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    Optional<Type> updateType(Long id, Type type);

    void deleteType(Long id);
}
