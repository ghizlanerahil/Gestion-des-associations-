package com.example.gestion_associations.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class association implements Serializable {
    @Id
    @GeneratedValue
    private  Long id;
    private String libelle;
    private String telephone;
    private String adresse;
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public association() {
    }

    public association(Long id, String libelle, String telephone, String adresse, String type) {
        this.id = id;
        this.libelle = libelle;
        this.telephone = telephone;
        this.adresse = adresse;
        this.type = type;
    }

    @Override
    public String toString() {
        return "association{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

