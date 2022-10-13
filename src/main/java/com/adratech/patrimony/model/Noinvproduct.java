package com.adratech.patrimony.model;

import com.fasterxml.jackson.annotation.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "noinvproduct")
public class Noinvproduct implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "idProduct")
    private Product idProduct;

    @Column(name = "QUANTITY_STOCK")
    private Integer quantityStock;

    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "idProductaffectednv")
    @JsonManagedReference("idProductaffectednv")
    private Set<Productaffected> productaffecteds = new LinkedHashSet<>();

    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "idProductnv")
    private Set<Deliverynoinv> deliverynoinvs = new LinkedHashSet<>();


    public Noinvproduct() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(Integer quantityStock) {
        this.quantityStock = quantityStock;
    }


    public Set<Productaffected> getProductaffecteds() {
        return productaffecteds;
    }

    public void setProductaffecteds(Set<Productaffected> productaffecteds) {
        this.productaffecteds = productaffecteds;
    }


    @JsonBackReference
    public Set<Deliverynoinv> getDeliverynoinvs() {
        return deliverynoinvs;
    }

    public void setDeliverynoinvs(Set<Deliverynoinv> deliverynoinvs) {
        this.deliverynoinvs = deliverynoinvs;
    }

}