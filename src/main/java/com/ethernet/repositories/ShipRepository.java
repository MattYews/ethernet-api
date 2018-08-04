package com.ethernet.repositories;

import com.ethernet.domain.Ship;

public interface ShipRepository {

    Ship getById(final int id);
}
