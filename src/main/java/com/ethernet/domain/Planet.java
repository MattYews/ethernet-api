package com.ethernet.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "planet")
public class Planet extends BaseEntity {

    private static final long serialVersionUID = -5237232623980679847L;

    private String name;

    public Planet(){}

    public Planet(final Integer id, final String name) {
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
