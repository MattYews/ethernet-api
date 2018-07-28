package com.ethernet.converters;

import com.ethernet.domain.Job;
import com.ethernet.dtos.JobDto;
import com.ethernet.enums.JobStatus;
import com.ethernet.enums.JobType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component(value = "jobDtoConverter")
public class JobDtoConverter implements Converter<JobDto, Job> {

    @Override
    public Job convert(final JobDto source) {
        if (source == null) {
            return null;
        }

        final Job job = new Job();
        job.setId(source.getId());
        job.setShipId(source.getShipId());
        job.setPlanetStartId(source.getPlanetStartId());
        job.setPlanetDestinationId(source.getPlanetDestinationId());
        job.setJobType(JobType.valueOf(source.getJobType()));
        job.setJobStatus(JobStatus.fromValue(source.getJobStatus()));

        return job;
    }

}
