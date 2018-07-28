package com.ethernet.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pilot")
public class Pilot extends BaseEntity {

    private static final long serialVersionUID = -7033498618018567843L;

    private String name;

    public Pilot() {}

    public Pilot(final Integer id, final String name) {
        setId(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
