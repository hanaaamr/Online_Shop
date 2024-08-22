package com.demo.demo66.core.Service.impl;

import com.demo.demo66.core.Infrastructure.repo.UserRepository;
import com.demo.demo66.core.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


}
