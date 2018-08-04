package com.ethernet.converters;

import com.ethernet.domain.Job;
import com.ethernet.dtos.JobDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import static com.ethernet.utils.ConverterUtils.enumToString;

@Component(value = "jobConverter")
public class JobConverter implements Converter<Job, JobDto> {

    @Override
    public JobDto convert(final Job source) {
       if (source == null) {
           return null;
       }

       return new JobDto(source.getId(),
               source.getShipId(),
               source.getPlanetStartId(),
               source.getPlanetDestinationId(),
               enumToString(source.getJobType()),
               enumToString(source.getJobStatus()),
               source.getVersion());
    }
}