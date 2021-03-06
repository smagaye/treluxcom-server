package com.treluxcom.metier;
// Generated 9 juin 2018 12:35:35 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Produit generated by hbm2java
 */
@Entity
@Table(name="produit"
    ,schema="public"
)
public class Produit  implements java.io.Serializable {


     private String codeproduit;
     private Etagere etagere;
     private Famille famille;
     private Panier panier;
     private Stock stock;
     private BigDecimal prixfournisseur;
     private BigDecimal prixgerant;
     private Date dateexpiration;
     private Integer remise;

    public Produit() {
    }

	
    public Produit(String codeproduit, Famille famille, Stock stock) {
        this.codeproduit = codeproduit;
        this.famille = famille;
        this.stock = stock;
    }
    public Produit(String codeproduit, Etagere etagere, Famille famille, Panier panier, Stock stock, BigDecimal prixfournisseur, BigDecimal prixgerant, Date dateexpiration, Integer remise) {
       this.codeproduit = codeproduit;
       this.etagere = etagere;
       this.famille = famille;
       this.panier = panier;
       this.stock = stock;
       this.prixfournisseur = prixfournisseur;
       this.prixgerant = prixgerant;
       this.dateexpiration = dateexpiration;
       this.remise = remise;
    }
   
     @Id 

    
    @Column(name="codeproduit", nullable=false, length=50)
    public String getCodeproduit() {
        return this.codeproduit;
    }
    
    public void setCodeproduit(String codeproduit) {
        this.codeproduit = codeproduit;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="codeetagere")
    public Etagere getEtagere() {
        return this.etagere;
    }
    
    public void setEtagere(Etagere etagere) {
        this.etagere = etagere;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="codefamille", nullable=false)
    public Famille getFamille() {
        return this.famille;
    }
    
    public void setFamille(Famille famille) {
        this.famille = famille;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="codepanier")
    public Panier getPanier() {
        return this.panier;
    }
    
    public void setPanier(Panier panier) {
        this.panier = panier;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="codestock", nullable=false)
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    
    @Column(name="prixfournisseur", precision=12)
    public BigDecimal getPrixfournisseur() {
        return this.prixfournisseur;
    }
    
    public void setPrixfournisseur(BigDecimal prixfournisseur) {
        this.prixfournisseur = prixfournisseur;
    }

    
    @Column(name="prixgerant", precision=12)
    public BigDecimal getPrixgerant() {
        return this.prixgerant;
    }
    
    public void setPrixgerant(BigDecimal prixgerant) {
        this.prixgerant = prixgerant;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dateexpiration", length=13)
    public Date getDateexpiration() {
        return this.dateexpiration;
    }
    
    public void setDateexpiration(Date dateexpiration) {
        this.dateexpiration = dateexpiration;
    }

    
    @Column(name="remise")
    public Integer getRemise() {
        return this.remise;
    }
    
    public void setRemise(Integer remise) {
        this.remise = remise;
    }




}


