package com.ethernet.controllers;

import com.ethernet.converters.JobConverter;
import com.ethernet.converters.JobDtoConverter;
import com.ethernet.domain.Job;
import com.ethernet.dtos.JobDto;
import com.ethernet.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/job")
public class JobControllerImpl implements JobController {

    @Autowired
    private JobService jobService;

    @Autowired
    private JobConverter jobConverter;

    @Autowired
    private JobDtoConverter jobDtoConverter;

    @Override
    @ResponseBody
    @GetMapping("/{id}")
    public JobDto getById(@PathVariable final int id) {
        final Job job = this.jobService.getById(id);

        return this.jobConverter.convert(job);
    }

    @Override
    @ResponseBody
    @PostMapping("/save")
    public void save(@RequestBody final JobDto jobDto) {
        final Job job = this.jobDtoConverter.convert(jobDto);

        this.jobService.save(job);
    }
}
