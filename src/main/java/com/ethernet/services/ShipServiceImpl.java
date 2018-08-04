package com.ethernet.services;

import com.ethernet.domain.Ship;
import com.ethernet.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipServiceImpl implements ShipService {

    @Autowired
    private ShipRepository shipRepository;

    @Override
    public Ship getById(final int id) {
        return this.shipRepository.getById(id);
    }
}
