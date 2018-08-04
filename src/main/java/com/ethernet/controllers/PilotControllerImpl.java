package com.ethernet.controllers;

import com.ethernet.converters.PilotConverter;
import com.ethernet.domain.Pilot;
import com.ethernet.dtos.PilotDto;
import com.ethernet.services.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ethernet/pilot")
public class PilotControllerImpl implements PilotController {

    @Autowired
    private PilotService pilotService;

    @Autowired
    private PilotConverter pilotConverter;

    @Override
    @ResponseBody
    @GetMapping("/{id}")
    public PilotDto getById(@PathVariable final int id) {
        final Pilot pilot = this.pilotService.getById(id);

        return this.pilotConverter.convert(pilot);
    }
}
