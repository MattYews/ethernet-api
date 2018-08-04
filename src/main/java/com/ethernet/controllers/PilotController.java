package com.ethernet.controllers;

import com.ethernet.dtos.PilotDto;

public interface PilotController {

    PilotDto getById(final int id);
}
