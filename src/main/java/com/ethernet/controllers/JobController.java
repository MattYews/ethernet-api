package com.ethernet.controllers;

import com.ethernet.dtos.JobDto;

public interface JobController {

    JobDto getById(final int id);

    void save(final JobDto jobDto);
}
