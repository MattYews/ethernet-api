package com.ethernet.controllers;

import com.ethernet.dtos.ShipDto;

public interface ShipController {

    ShipDto getById(final int id);
}
