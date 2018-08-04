package com.ethernet.controllers;

import com.ethernet.dtos.PlanetDto;

public interface PlanetController {

    PlanetDto getById(final int id);
}
