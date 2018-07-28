package com.ethernet.enums;

public enum JobStatus implements PersistableEnum {

    CARGO("Cargo", "cargo"),

    SMUGGLING("Smuggling", "smuggling"),

    BOUNTY("Bounty", "bounty");

    private String prettyName;
    private String internalName;

    JobStatus(final String prettyName, final String internalName) {
        this.prettyName = prettyName;
        this.internalName = internalName;
    }

    public static JobStatus fromValue(final String value) {
        for (final JobStatus jobStatus : values()) {
            if (jobStatus.getInternalName().equals(value)) {
                return jobStatus;
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
