package com.ethernet.services;

import com.ethernet.domain.Pilot;
import com.ethernet.repositories.PilotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotServiceImpl implements PilotService {

    @Autowired
    private PilotRepository pilotRepository;

    @Override
    public Pilot getById(final int id) {
        return this.pilotRepository.getById(id);
    }
}