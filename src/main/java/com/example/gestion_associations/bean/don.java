package com.example.gestion_associations.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class don implements Serializable {
    @Id
    @GeneratedValue
    private  Long id;
    private Double montant;
    private String typePaiement;
    @Temporal(TemporalType.DATE)
    private Date dateDon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(String typePaiement) {
        this.typePaiement = typePaiement;
    }

    public Date getDateDon() {
        return dateDon;
    }

    public void setDateDon(Date dateDon) {
        this.dateDon = dateDon;
    }

    public don() {
    }

    public don(Long id, Double montant, String typePaiement, Date dateDon) {
        this.id = id;
        this.montant = montant;
        this.typePaiement = typePaiement;
        this.dateDon = dateDon;
    }

    @Override
    public String toString() {
        return "don{" +
                "id=" + id +
                ", montant=" + montant +
                ", typePaiement='" + typePaiement + '\'' +
                ", dateDon=" + dateDon +
                '}';
    }
}
