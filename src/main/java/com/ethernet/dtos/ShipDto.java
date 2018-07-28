package com.ethernet.dtos;

import java.io.Serializable;

public class ShipDto implements Serializable {

    private static final long serialVersionUID = -1905442030312181965L;

    private Integer id;
    private int pilotId;
    private String name;
    private String shipType;
    private String shipStatus;

    public ShipDto(){}

    public ShipDto(final Integer id, final int pilotId, final String name, final String shipType,
                   final String shipStatus) {
        this.id = id;
        this.pilotId = pilotId;
        this.name = name;
        this.shipType = shipType;
        this.shipStatus = shipStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPilotId() {
        return pilotId;
    }

    public void setPilotId(int pilotId) {
        this.pilotId = pilotId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(String shipStatus) {
        this.shipStatus = shipStatus;
    }
}
