package com.example.SpringBoot_CapstoneSystem_SWP.CapstoneSystem.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Long countUser() {
        Session session = this.sessionFactory.getCurrentSession();
        return (Long) session.
                createQuery("select count(1) from User").uniqueResult();
    }
}
