package com.ethernet.services;

import com.ethernet.domain.Job;

public interface JobService {

    Job getById(final int id);

    void save(final Job job);
}
