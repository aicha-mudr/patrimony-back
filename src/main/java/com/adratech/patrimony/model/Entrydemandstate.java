package com.adratech.patrimony.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "entrydemandstate")
public class Entrydemandstate {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "state")
    private String state;

    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "state")
    private Set<Entryrequest> entryrequests = new LinkedHashSet<>();

    public Entrydemandstate(Integer id, String state) {
        this.id = id;
        this.state = state;
    }
    public Entrydemandstate(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @JsonBackReference
    public Set<Entryrequest> getEntryrequests() {
        return entryrequests;
    }

    public void setEntryrequests(Set<Entryrequest> entryrequests) {
        this.entryrequests = entryrequests;
    }

}