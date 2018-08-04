package com.ethernet.converters;

import com.ethernet.domain.Pilot;
import com.ethernet.dtos.PilotDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component("pilotDtoConverter")
public class PilotDtoConverter implements Converter<PilotDto, Pilot> {

    @Override
    public Pilot convert(final PilotDto source) {
        if (source == null) {
            return null;
        }

        return new Pilot(source.getId(), source.getName());
    }
}
