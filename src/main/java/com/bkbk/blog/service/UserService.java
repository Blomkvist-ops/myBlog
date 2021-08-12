package com.bkbk.blog.service;

import com.bkbk.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
