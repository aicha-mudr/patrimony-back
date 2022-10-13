package com.adratech.patrimony.model;

import com.fasterxml.jackson.annotation.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "subcategory")
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false , updatable = false)
    private Long id;


    @Column(name = "Subcategory_name")
    private String subcategoryName;

    @Column(name = "Inventory")
    private Boolean inventory;

    @Column(name = "Serie")
    private Boolean serie;


    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "subcategory")
    private Set<Product> products = new LinkedHashSet<>();


    @ManyToOne()
    @JoinColumn(name = "idCategory")
    private Category categories;



    public Category getCategories() {
        return categories;
    }

    public void setCategories(Category categories) {
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public Boolean getInventory() {
        return inventory;
    }

    public void setInventory(Boolean inventory) {
        this.inventory = inventory;
    }

    public Boolean getSerie() {
        return serie;
    }

    public void setSerie(Boolean serie) {
        this.serie = serie;
    }
    @JsonBackReference
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
