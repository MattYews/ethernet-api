package com.ethernet.domain;

import com.ethernet.enums.ShipStatus;
import com.ethernet.enums.ShipType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ship")
public class Ship extends BaseEntity {

    private static final long serialVersionUID = 4670186660162762144L;

    @Column(name = "FK_PilotID")
    private int pilotId;

    private String name;

    @Column(name = "type")
    private ShipType shipType;

    @Column(name = "status")
    private ShipStatus shipStatus;

    public Ship(){}

    public Ship(final Integer id, final int pilotId, final String name, final ShipType shipType, final ShipStatus shipStatus) {
        setId(id);
        this.pilotId = pilotId;
        this.name = name;
        this.shipType = shipType;
        this.shipStatus = shipStatus;
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

    public ShipType getShipType() {
        return shipType;
    }

    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }

    public ShipStatus getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(ShipStatus shipStatus) {
        this.shipStatus = shipStatus;
    }
}
