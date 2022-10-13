package com.adratech.patrimony.model;

import com.fasterxml.jackson.annotation.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "affectationdemand")
public class Affectationdemand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "NumDemand")
    private String numDemand;

    @Column(name = "numBonSortie")
    private String numBonSortie;

    @Column(name = "dateBonSortie")
    private String dateBonSortie;

    @Column(name = "DATE_AFFECTATION")
    private LocalDate dateAffectation;

    @Column(name = "SignDate")
    private LocalDate SignDate;

    @ManyToOne()
    @JoinColumn(name = "demandstate")
    private Demandstate demandstate;

    @ManyToOne()
    @JoinColumn(name = "id_entity")
    private Entitytable idEntity;



    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "idAffectationdemand")
    @JsonManagedReference("idAffectationdemand")
    private Set<Productaffected> affectedProducts = new LinkedHashSet<>();

    @Column(name = "DOC_DEMAND_AFFECTATION")
    private String docDemandAffectation;

    @Column(name = "beneficiary")
    private String beneficiary;

    @Column(name = "DATE_RECEIPT_AFFECTATION")
    private LocalDate dateReceiptAffectation;

    @Column(name = "DOC_BON_AFFECTATION")
    private String docBonAffectation;

    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "idDemandaffectation")
    private Set<Invproduct> invproducts = new LinkedHashSet<>();





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getNumDemand() {
        return numDemand;
    }

    public void setNumDemand(String numDemand) {
        this.numDemand = numDemand;
    }

    public LocalDate getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(LocalDate dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    public Demandstate getDemandstate() {
        return demandstate;
    }

    public void setDemandstate(Demandstate demandstate) {
        this.demandstate = demandstate;
    }

    public Entitytable getIdEntity() {
        return idEntity;
    }

    public void setIdEntity(Entitytable idEntity) {
        this.idEntity = idEntity;
    }



    public Set<Productaffected> getAffectedProducts() {
        return affectedProducts;
    }

    public void setAffectedProducts(Set<Productaffected> affectedProducts) {
        this.affectedProducts = affectedProducts;
    }

    public String getDocDemandAffectation() {
        return docDemandAffectation;
    }

    public void setDocDemandAffectation(String docDemandAffectation) {
        this.docDemandAffectation = docDemandAffectation;
    }

    public LocalDate getDateReceiptAffectation() {
        return dateReceiptAffectation;
    }

    public void setDateReceiptAffectation(LocalDate dateReceiptAffectation) {
        this.dateReceiptAffectation = dateReceiptAffectation;
    }

    public String getDocBonAffectation() {
        return docBonAffectation;
    }

    public void setDocBonAffectation(String docBonAffectation) {
        this.docBonAffectation = docBonAffectation;
    }


    @JsonBackReference
    public Set<Invproduct> getInvproducts() {
        return invproducts;
    }

    public void setInvproducts(Set<Invproduct> invproducts) {
        this.invproducts = invproducts;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public LocalDate getSignDate() {
        return SignDate;
    }

    public void setSignDate(LocalDate signDate) {
        SignDate = signDate;
    }

    public String getNumBonSortie() {
        return numBonSortie;
    }

    public void setNumBonSortie(String numBonSortie) {
        this.numBonSortie = numBonSortie;
    }

    public String getDateBonSortie() {
        return dateBonSortie;
    }

    public void setDateBonSortie(String dateBonSortie) {
        this.dateBonSortie = dateBonSortie;
    }
}