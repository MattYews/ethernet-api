package com.ethernet.converters;

import com.ethernet.domain.Job;
import com.ethernet.dtos.JobDto;
import com.ethernet.enums.PersistableEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component(value = "jobConverter")
public class JobConverter implements Converter<Job, JobDto> {

    @Override
    public JobDto convert(final Job source) {
       if (source == null) {
           return null;
       }

       final JobDto jobDto = new JobDto();
       jobDto.setId(source.getId());
       jobDto.setShipId(source.getShipId());
       jobDto.setPlanetStartId(source.getPlanetStartId());
       jobDto.setPlanetDestinationId(source.getPlanetDestinationId());
       jobDto.setJobType(source.getJobType().toString());
       jobDto.setJobStatus(enumToString(source.getJobStatus()));

       return jobDto;
    }

    private String enumToString(final PersistableEnum enumValue) {
        return enumValue.toString();
    }
}