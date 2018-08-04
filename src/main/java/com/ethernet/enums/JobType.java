package com.ethernet.enums;

public enum JobType implements PersistableEnum{

    CARGO("Cargo", "cargo"),

    SMUGGLING("Smuggling", "smuggling"),

    BOUNTY("Bounty", "bounty");

    private String prettyName;
    private String internalName;

    JobType(final String prettyName, final String internalName) {
        this.prettyName = prettyName;
        this.internalName = internalName;
    }

    public static JobType fromValue(final String value) {
        for (final JobType jobType : values()) {
            if (jobType.internalName.equals(value)) {
                return jobType;
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
