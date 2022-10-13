package com.adratech.patrimony.model;

import com.fasterxml.jackson.annotation.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "productaffected")
public class Productaffected {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "idProductaffectednv")
    @JsonBackReference("idProductaffectednv")
    private Noinvproduct idProductaffectednv;



    @Column(name = "QUANTITY_REQUESTED")
    private Integer quantityRequested;

    @Column(name = "QUANTITY_GARANTED")
    private Integer quantityGaranted;

    @Column(name = "OBSERVATION")
    private String observation;



    @Column(name = "noinvdesignation")
    private String noinvdesignation;

    public String getNumDemand() {
        return numDemand;
    }

    public void setNumDemand(String numDemand) {
        this.numDemand = numDemand;
    }

    @Column(name = "numDemand")
    private String numDemand;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "idAffectationdemand")
    @JsonBackReference("idAffectationdemand")
    private Affectationdemand idAffectationdemand;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Affectationdemand getIdAffectationdemand() {
        return idAffectationdemand;
    }

    public void setIdAffectationdemand(Affectationdemand idAffectationdemand) {
        this.idAffectationdemand = idAffectationdemand;
    }

    public Noinvproduct getIdProductaffectednv() {
        return idProductaffectednv;
    }

    public void setIdProductaffectednv(Noinvproduct idProductaffectednv) {
        this.idProductaffectednv = idProductaffectednv;
    }


    public Integer getQuantityRequested() {
        return quantityRequested;
    }

    public void setQuantityRequested(Integer quantityRequested) {
        this.quantityRequested = quantityRequested;
    }

    public Integer getQuantityGaranted() {
        return quantityGaranted;
    }

    public void setQuantityGaranted(Integer quantityGaranted) {
        this.quantityGaranted = quantityGaranted;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getNoinvdesignation() {
        return noinvdesignation;
    }

    public void setNoinvdesignation(String noinvdesignation) {
        this.noinvdesignation = noinvdesignation;
    }
}