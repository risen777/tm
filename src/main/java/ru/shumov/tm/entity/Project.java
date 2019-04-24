package ru.shumov.tm.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Project {
    @Id
    private  String id = UUID.randomUUID().toString();
    private  String name;
    private Date dataBegin;
    private  Date dataEnd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDataBegin() {
        return dataBegin;
    }

    public void setDataBegin(Date dataBegin) {
        this.dataBegin = dataBegin;
    }

    public Date getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(Date dataEnd) {
        this.dataEnd = dataEnd;
    }
}
