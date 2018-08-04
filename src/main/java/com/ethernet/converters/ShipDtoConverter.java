package com.ethernet.converters;

import com.ethernet.domain.Ship;
import com.ethernet.dtos.ShipDto;
import com.ethernet.enums.ShipStatus;
import com.ethernet.enums.ShipType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component("shipDtoConverter")
public class ShipDtoConverter implements Converter<ShipDto, Ship> {

    @Override
    public Ship convert(final ShipDto source) {
        if (source == null) {
            return null;
        }

        return new Ship(source.getId(),
                source.getPilotId(),
                source.getName(),
                ShipType.fromValue(source.getShipType()),
                ShipStatus.fromValue(source.getShipStatus()));
    }

}
