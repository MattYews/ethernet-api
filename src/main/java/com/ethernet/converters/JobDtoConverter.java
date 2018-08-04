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

        return new Job(source.getId(),
                source.getShipId(),
                source.getPlanetStartId(),
                source.getPlanetDestinationId(),
                JobType.fromValue(source.getJobType()),
                JobStatus.fromValue(source.getJobStatus()),
                source.getVersion());
    }

}
