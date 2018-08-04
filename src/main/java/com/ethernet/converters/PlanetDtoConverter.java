package com.ethernet.converters;

import com.ethernet.domain.Planet;
import com.ethernet.dtos.PlanetDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component("planetDtoConverter")
public class PlanetDtoConverter implements Converter<PlanetDto, Planet> {

    @Override
    public Planet convert(final PlanetDto source) {
        if (source == null) {
            return null;
        }

        return new Planet(source.getId(), source.getName());
    }
}
