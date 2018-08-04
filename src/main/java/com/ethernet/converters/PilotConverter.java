package com.ethernet.converters;

import com.ethernet.domain.Pilot;
import com.ethernet.dtos.PilotDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component("pilotConverter")
public class PilotConverter implements Converter<Pilot, PilotDto> {

    @Override
    public PilotDto convert(final Pilot source) {
        if (source == null) {
            return null;
        }

        return new PilotDto(source.getId(), source.getName());
    }
}
