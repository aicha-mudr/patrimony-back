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
@Table(name = "demandstate")
public class Demandstate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "STATE")
    private String state;

    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY,mappedBy = "demandstate")
    private Set<Affectationdemand> affectationdemands = new LinkedHashSet<>();

    public Demandstate(Integer id, String state) {
        this.id = id;
        this.state = state;
    }

    public Demandstate() {
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
    public Set<Affectationdemand> getAffectationdemands() {
        return affectationdemands;
    }

    public void setAffectationdemands(Set<Affectationdemand> affectationdemands) {
        this.affectationdemands = affectationdemands;
    }

}