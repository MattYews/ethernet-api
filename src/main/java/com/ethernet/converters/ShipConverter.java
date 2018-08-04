package com.ethernet.converters;

import com.ethernet.domain.Ship;
import com.ethernet.dtos.ShipDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import static com.ethernet.utils.ConverterUtils.enumToString;

@Component("shipConverter")
public class ShipConverter implements Converter<Ship, ShipDto> {

    @Override
    public ShipDto convert(final Ship source) {
        if (source == null) {
            return null;
        }

        return new ShipDto(source.getId(),
                source.getPilotId(),
                source.getName(),
                enumToString(source.getShipType()),
                enumToString(source.getShipStatus()));

    }
}
