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

    //Hibernate join here
    private Ship ship;

    //Hibernate join here
    private Planet startPlanet;

    //Hibernate join here
    private Planet destination;

    @Column(name = "type")
    private JobType jobType;

    @Column(name = "status")
    private JobStatus jobStatus;

    public Job(){}

    public Job(final Integer id, final Ship ship, final Planet startPlanet, final Planet destination,
               final JobType jobType, final JobStatus jobStatus, final int version) {
        setId(id);
        this.ship = ship;
        this.startPlanet = startPlanet;
        this.destination = destination;
        this.jobType = jobType;
        this.jobStatus = jobStatus;
        setVersion(version);
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Planet getStartPlanet() {
        return startPlanet;
    }

    public void setStartPlanet(Planet startPlanet) {
        this.startPlanet = startPlanet;
    }

    public Planet getDestination() {
        return destination;
    }

    public void setDestination(Planet destination) {
        this.destination = destination;
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
