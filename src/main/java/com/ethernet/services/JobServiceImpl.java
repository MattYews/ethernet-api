package com.ethernet.services;

import com.ethernet.domain.Job;
import com.ethernet.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public Job getById(final int id) {
        return this.jobRepository.getById(id);
    }

    @Override
    @Transactional
    public void save(final Job job) {
        this.jobRepository.save(job);
    }
}
