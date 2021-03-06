package com.treluxcom.metier;
// Generated 9 juin 2018 12:35:35 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Fournisseur generated by hbm2java
 */
@Entity
@Table(name="fournisseur"
    ,schema="public"
)
public class Fournisseur  implements java.io.Serializable {


     private String codepersonne;
     private Personne personne;
     private Integer categorie;
     private String description;
     private Integer cotation;
     private Set commandes = new HashSet(0);
     private Set devises = new HashSet(0);

    public Fournisseur() {
    }

	
    public Fournisseur(Personne personne) {
        this.personne = personne;
    }
    public Fournisseur(Personne personne, Integer categorie, String description, Integer cotation, Set commandes, Set devises) {
       this.personne = personne;
       this.categorie = categorie;
       this.description = description;
       this.cotation = cotation;
       this.commandes = commandes;
       this.devises = devises;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="personne"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="codepersonne", nullable=false, length=40)
    public String getCodepersonne() {
        return this.codepersonne;
    }
    
    public void setCodepersonne(String codepersonne) {
        this.codepersonne = codepersonne;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Personne getPersonne() {
        return this.personne;
    }
    
    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    
    @Column(name="categorie")
    public Integer getCategorie() {
        return this.categorie;
    }
    
    public void setCategorie(Integer categorie) {
        this.categorie = categorie;
    }

    
    @Column(name="description", length=50)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="cotation")
    public Integer getCotation() {
        return this.cotation;
    }
    
    public void setCotation(Integer cotation) {
        this.cotation = cotation;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="fournisseur")
    public Set getCommandes() {
        return this.commandes;
    }
    
    public void setCommandes(Set commandes) {
        this.commandes = commandes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="fournisseur")
    public Set getDevises() {
        return this.devises;
    }
    
    public void setDevises(Set devises) {
        this.devises = devises;
    }




}


