package com.ethernet.repositories;

import com.ethernet.domain.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class PlanetRepositoryImpl implements PlanetRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    private Session session() {
        return this.entityManagerFactory.unwrap(SessionFactory.class).openSession();
    }

    @Override
    public Planet getById(final int id) {
        return session().getSessionFactory().openSession().get(Planet.class, id);
    }
}
