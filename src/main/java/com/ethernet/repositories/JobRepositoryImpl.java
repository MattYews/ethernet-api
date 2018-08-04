package com.ethernet.repositories;

import com.ethernet.domain.Job;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class JobRepositoryImpl implements JobRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    private Session session() {
        return this.entityManagerFactory.unwrap(SessionFactory.class).openSession();
    }

    @Override
    public Job getById(final int id) {
        return session().getSessionFactory().openSession().get(Job.class, id);
    }

    @Override
    public void save(final Job job) {
        session().getSessionFactory().openSession().save(job);
    }
}
