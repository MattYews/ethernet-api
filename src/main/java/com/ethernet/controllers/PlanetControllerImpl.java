package com.ethernet.controllers;

import com.ethernet.converters.PlanetConverter;
import com.ethernet.domain.Planet;
import com.ethernet.dtos.PlanetDto;
import com.ethernet.services.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ethernet/planet")
public class PlanetControllerImpl implements PlanetController{

    @Autowired
    private PlanetService planetService;

    @Autowired
    private PlanetConverter planetConverter;

    @Override
    @ResponseBody
    @GetMapping("/{id}")
    public PlanetDto getById(@PathVariable final int id) {
        final Planet planet = this.planetService.getById(id);

        return this.planetConverter.convert(planet);
    }
}
