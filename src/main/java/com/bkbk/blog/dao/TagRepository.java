package com.bkbk.blog.dao;

import com.bkbk.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
}
