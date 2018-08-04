package com.ethernet.converters;

import com.ethernet.domain.Planet;
import com.ethernet.dtos.PlanetDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component("planetConverter")
public class PlanetConverter implements Converter<Planet, PlanetDto> {

    @Override
    public PlanetDto convert(final Planet source) {
        if (source == null) {
            return null;
        }

        return new PlanetDto(source.getId(), source.getName());
    }
}
