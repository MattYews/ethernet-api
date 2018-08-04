package com.ethernet.repositories;

import com.ethernet.domain.Ship;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class ShipRepositoryImpl implements ShipRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    private Session session() {
        return this.entityManagerFactory.unwrap(SessionFactory.class).openSession();
    }

    @Override
    public Ship getById(final int id) {
        return session().getSessionFactory().openSession().get(Ship.class, id);
    }
}
