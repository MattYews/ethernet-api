package com.ethernet.enums;

public enum ShipStatus implements PersistableEnum {

    DOCKED("Dcoked", "docked"),

    TRAVELLING("Travelling", "travelling"),

    RETURNING("Returning", "returning");

    private String prettyName;
    private String internalName;

    ShipStatus(final String prettyName, final String internalName) {
        this.prettyName = prettyName;
        this.internalName = internalName;
    }

    public static ShipStatus fromValue(final String value) {
        for (final ShipStatus shipStatus : values()) {
            if (shipStatus.internalName.equals(value)) {
                return shipStatus;
            }
        }

        return null;
    }

    @Override
    public String getInternalName() {
        return this.internalName;
    }

    @Override
    public String getPrettyName() {
        return this.prettyName;
    }
}
