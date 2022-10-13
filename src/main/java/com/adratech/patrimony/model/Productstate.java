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
@Table(name = "productstate")
public class Productstate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "STATE")
    private String state;

    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY,mappedBy = "idProductState")
    private Set<Invproduct> invproducts = new LinkedHashSet<>();

    public Productstate(Integer id, String state) {
        this.id = id;
        this.state = state;
    }

    public Productstate() {
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
    public Set<Invproduct> getInvproducts() {
        return invproducts;
    }

    public void setInvproducts(Set<Invproduct> invproducts) {
        this.invproducts = invproducts;
    }

}