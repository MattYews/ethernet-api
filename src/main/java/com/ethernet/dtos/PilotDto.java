package com.ethernet.dtos;

import java.io.Serializable;

public class PilotDto implements Serializable {

    private static final long serialVersionUID = -6906819998448202283L;

    private Integer id;
    private String name;

    public PilotDto() {}

    public PilotDto(final Integer id, final String name) {
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
