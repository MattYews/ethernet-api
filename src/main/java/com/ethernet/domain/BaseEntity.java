package com.ethernet.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

@MappedSuperclass
abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = -4372168522336134612L;

    @Id
    private Integer id;

    @Version
    @Column(name = "OBJ_VERSION")
    private int version;

    public Integer getId() {
        return this.id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public int getVersion() {
        return this.version;
    }

    void setVersion(final int version) {
        this.version = version;
    }
}
