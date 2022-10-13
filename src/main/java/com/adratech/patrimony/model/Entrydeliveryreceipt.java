package com.adratech.patrimony.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "entrydeliveryreceipt")
public class Entrydeliveryreceipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;



    @Column(name = "numDeliveryReceipt")
    private String numDeliveryReceipt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_request")
    private Entryrequest idRequest;

    @Column(name = "vendor")
    private String vendor;



    @Column(name = "date_Delivery")
    private LocalDate dateDelivery;

    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idDelivery")
    private Set<Invproduct> idDelivery = new LinkedHashSet<>();

    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idEntrydeliveryreceipt")
    @JsonManagedReference("idDeliverynoinv")
    private Set<Deliverynoinv> idDeliverynoinv = new LinkedHashSet<>();





    @JsonBackReference
    public Set<Invproduct> getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(Set<Invproduct> idDelivery) {
        this.idDelivery = idDelivery;
    }



    public Set<Deliverynoinv> getIdDeliverynoinv() {
        return idDeliverynoinv;
    }

    public void setIdDeliverynoinv(Set<Deliverynoinv> idDeliverynoinv) {
        this.idDeliverynoinv = idDeliverynoinv;
    }

    public Entryrequest getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(Entryrequest idRequest) {
        this.idRequest = idRequest;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumDeliveryReceipt() {
        return numDeliveryReceipt;
    }

    public void setNumDeliveryReceipt(String numDeliveryReceipt) {
        this.numDeliveryReceipt = numDeliveryReceipt;
    }


    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public LocalDate getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(LocalDate dateDelivery) {
        this.dateDelivery = dateDelivery;
    }



}