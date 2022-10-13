package com.adratech.patrimony.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;

@Entity
@Table(name = "deliverynoinv")
public class Deliverynoinv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "QUANTITY")
    private Integer quantity;



    @ManyToOne()
    @JoinColumn(name = "ID_PRODUCTNV")
    private Noinvproduct idProductnv;

    @ManyToOne()
    @JoinColumn(name = "ID_Entrydeliveryreceipt")
    @JsonBackReference("idDeliverynoinv")
    private Entrydeliveryreceipt idEntrydeliveryreceipt;

    @Column(name = "observation")
    private String observation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Entrydeliveryreceipt getIdEntrydeliveryreceipt() {
        return idEntrydeliveryreceipt;
    }

    public void setIdEntrydeliveryreceipt(Entrydeliveryreceipt idEntrydeliveryreceipt) {
        this.idEntrydeliveryreceipt = idEntrydeliveryreceipt;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



    public Noinvproduct getIdProductnv() {
        return idProductnv;
    }

    public void setIdProductnv(Noinvproduct idProductnv) {
        this.idProductnv = idProductnv;
    }

}