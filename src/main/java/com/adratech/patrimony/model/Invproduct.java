package com.adratech.patrimony.model;

import com.fasterxml.jackson.annotation.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "invproduct")
public class Invproduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_product")
    private Product idProduct;



    @Column(name = "NUMINV")
    private Integer numinv;

    @Column(name = "NUMSERIE")
    private Integer numserie;



    @Column(name = "observation")
    private String observation;

    @Column(name = "observationsortie")
    private String observationSortie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProductState")
    private Productstate idProductState;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_demandAffectation")
    private Affectationdemand idDemandaffectation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_employe")
    private Employee idEmploye;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Delivery")
    private Entrydeliveryreceipt idDelivery;





    public Entrydeliveryreceipt getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(Entrydeliveryreceipt idDelivery) {
        this.idDelivery = idDelivery;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@JsonManagedReference(value = "prod-inv")
    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getNuminv() {
        return numinv;
    }

    public void setNuminv(Integer numinv) {
        this.numinv = numinv;
    }

    public Integer getNumserie() {
        return numserie;
    }

    public void setNumserie(Integer numserie) {
        this.numserie = numserie;
    }


    public Productstate getIdProductState() {
        return idProductState;
    }

    public void setIdProductState(Productstate idProductState) {
        this.idProductState = idProductState;
    }

    public Affectationdemand getIdDemandaffectation() {
        return idDemandaffectation;
    }

    public void setIdDemandaffectation(Affectationdemand idDemandaffectation) {
        this.idDemandaffectation = idDemandaffectation;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Employee getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Employee idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getObservationSortie() {
        return observationSortie;
    }

    public void setObservationSortie(String observationSortie) {
        this.observationSortie = observationSortie;
    }
}