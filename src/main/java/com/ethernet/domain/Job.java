package com.ethernet.domain;

import com.ethernet.enums.JobStatus;
import com.ethernet.enums.JobType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "job")
public class Job extends BaseEntity {

    private static final long serialVersionUID = 7375588662901349422L;

    @Column(name = "FK_ShipID")
    private Integer shipId;

    @Column(name = "FK_Planet_StartID")
    private int planetStartId;

    @Column(name = "FK_Planet_DestinationID")
    private int planetDestinationId;

    @Column(name = "type")
    private JobType jobType;

    @Column(name = "status")
    private JobStatus jobStatus;

    public Job(){}

    public Job(final Integer id, final int shipId, final int planetStartId, final int planetDestinationId, final JobType jobType,
               final JobStatus jobStatus, final int version) {
        setId(id);
        this.shipId = shipId;
        this.planetStartId = planetStartId;
        this.planetDestinationId = planetDestinationId;
        this.jobType = jobType;
        this.jobStatus = jobStatus;
        setVersion(version);
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
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

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }
}
