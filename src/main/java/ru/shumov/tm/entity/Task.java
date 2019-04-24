package ru.shumov.tm.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Task {

    @Id
    private  String id = UUID.randomUUID().toString();
    private  String name;
    private Date dataBegin;
    private  Date dataEnd;

    @ManyToOne
    private  Project project;


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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
