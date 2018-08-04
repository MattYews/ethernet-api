package com.ethernet.controllers;

import com.ethernet.converters.ShipConverter;
import com.ethernet.domain.Ship;
import com.ethernet.dtos.ShipDto;
import com.ethernet.services.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ethernet/ship")
public class ShipControllerImpl implements ShipController {

    @Autowired
    private ShipService shipService;

    @Autowired
    private ShipConverter shipConverter;

    @Override
    @ResponseBody
    @GetMapping("/{id}")
    public ShipDto getById(@PathVariable final int id) {
        final Ship ship = this.shipService.getById(id);

        return this.shipConverter.convert(ship);
    }
}
