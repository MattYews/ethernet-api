package com.ethernet.repositories;

import com.ethernet.domain.Job;

public interface JobRepository {

    Job getById(final int id);

    void save(final Job job);
}
