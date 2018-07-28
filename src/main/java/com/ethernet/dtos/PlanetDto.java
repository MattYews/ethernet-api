package com.ethernet.dtos;

import java.io.Serializable;

public class PlanetDto implements Serializable {

    private static final long serialVersionUID = 7793315990619724956L;

    private Integer id;
    private String name;

    public PlanetDto() {}

    public PlanetDto(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}