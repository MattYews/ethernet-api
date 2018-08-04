package com.ethernet.enums;

public enum ShipType implements PersistableEnum {

    CARGO("Cargo", "cargo"),

    FIGHTER("Fighter", "fighter"),

    HERO("Hero", "hero");

    private String prettyName;
    private String internalName;

    ShipType(final String prettyName, final String internalName) {
        this.prettyName = prettyName;
        this.internalName = internalName;
    }

    public static ShipType fromValue(final String value) {
        for (final ShipType shipType : values()) {
            if (shipType.internalName.equals(value)) {
                return shipType;
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
