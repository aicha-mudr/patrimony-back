package com.adratech.patrimony.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "entryrequest")
public class Entryrequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;


    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "idRequest")
    private Set<Entrydeliveryreceipt> numrequest = new LinkedHashSet<>();



    @Column(name = "num_depense")
    private String numDepense;

    @Column(name = "num_marcket")
    private String numMarcket;

    @Column(name = "num_receipt_order")
    private String numReceiptOrder;

    @Column(name = "DAP")
    private String dap;

    @Column(name = "doc_receipt_entry")
    private String docReceiptEntry;

    @ManyToOne()
    @JoinColumn(name = "state")
    private Entrydemandstate state;

    @Column(name = "date_Request")
    private LocalDate dateRequest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumDepense() {
        return numDepense;
    }

    public void setNumDepense(String numDepense) {
        this.numDepense = numDepense;
    }

    @JsonBackReference
    public Set<Entrydeliveryreceipt> getNumrequest() {
        return numrequest;
    }

    public void setNumrequest(Set<Entrydeliveryreceipt> numrequest) {
        this.numrequest = numrequest;
    }

    public String getNumMarcket() {
        return numMarcket;
    }

    public void setNumMarcket(String numMarcket) {
        this.numMarcket = numMarcket;
    }

    public String getNumReceiptOrder() {
        return numReceiptOrder;
    }

    public void setNumReceiptOrder(String numReceiptOrder) {
        this.numReceiptOrder = numReceiptOrder;
    }

    public String getDap() {
        return dap;
    }

    public void setDap(String dap) {
        this.dap = dap;
    }

    public String getDocReceiptEntry() {
        return docReceiptEntry;
    }

    public void setDocReceiptEntry(String docReceiptEntry) {
        this.docReceiptEntry = docReceiptEntry;
    }

    public Entrydemandstate getState() {
        return state;
    }

    public void setState(Entrydemandstate state) {
        this.state = state;
    }

    public LocalDate getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(LocalDate dateRequest) {
        this.dateRequest = dateRequest;
    }

}