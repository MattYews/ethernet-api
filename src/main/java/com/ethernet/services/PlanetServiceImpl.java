package com.ethernet.services;

import com.ethernet.domain.Planet;
import com.ethernet.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetServiceImpl implements PlanetService {

    @Autowired
    private PlanetRepository planetRepository;

    @Override
    public Planet getById(final int id) {
        return this.planetRepository.getById(id);
    }
}
