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
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NAME_EMPLOYEE")
    private String nameEmployee;

    @Column(name = "ID_ENTITYSTATE")
    private Integer idEntitystate;

    @Fetch(value = FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "idEmploye")
    private Set<Invproduct> invproducts = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public Integer getIdEntitystate() {
        return idEntitystate;
    }

    public void setIdEntitystate(Integer idEntitystate) {
        this.idEntitystate = idEntitystate;
    }

    @JsonBackReference
    public Set<Invproduct> getInvproducts() {
        return invproducts;
    }

    public void setInvproducts(Set<Invproduct> invproducts) {
        this.invproducts = invproducts;
    }

}