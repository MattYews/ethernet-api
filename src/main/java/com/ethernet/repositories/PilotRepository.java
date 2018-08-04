package com.ethernet.repositories;

import com.ethernet.domain.Pilot;

public interface PilotRepository {

    Pilot getById(final int id);
}
