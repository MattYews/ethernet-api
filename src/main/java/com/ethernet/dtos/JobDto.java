package com.ethernet.dtos;

import java.io.Serializable;

public class JobDto implements Serializable {

    private static final long serialVersionUID = 3302852411511448540L;

    private Integer id;
    private int shipId;
    private int planetStartId;
    private int planetDestinationId;
    private String jobType;
    private String jobStatus;
    private int version;

    public JobDto(){}

    public JobDto(final Integer id, final int shipId, final int planetStartId, final int planetDestinationId,
                  final String jobType, final String jobStatus, final int version) {
        this.id = id;
        this.shipId = shipId;
        this.planetStartId = planetStartId;
        this.planetDestinationId = planetDestinationId;
        this.jobType = jobType;
        this.jobStatus = jobStatus;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getShipId() {
        return shipId;
    }

    public void setShipId(int shipId) {
        this.shipId = shipId;
    }

    public int getPlanetStartId() {
        return planetStartId;
    }

    public void setPlanetStartId(int planetStartId) {
        this.planetStartId = planetStartId;
    }

    public int getPlanetDestinationId() {
        return planetDestinationId;
    }

    public void setPlanetDestinationId(int planetDestinationId) {
        this.planetDestinationId = planetDestinationId;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
