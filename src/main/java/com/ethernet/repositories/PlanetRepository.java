package com.ethernet.repositories;

import com.ethernet.domain.Planet;

public interface PlanetRepository {

    Planet getById(final int id);
}
