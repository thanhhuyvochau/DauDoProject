package com.example.SpringBoot_CapstoneSystem_SWP.CapstoneSystem.service;

import com.example.SpringBoot_CapstoneSystem_SWP.CapstoneSystem.dao.UserDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao ;

    @Override
    public Long coutUser() {
        return  userDao.countUser() ;

    }
}
