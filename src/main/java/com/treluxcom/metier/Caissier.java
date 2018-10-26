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
 * Caissier generated by hbm2java
 */
@Entity
@Table(name="caissier"
    ,schema="public"
)
public class Caissier  implements java.io.Serializable {


     private String codepersonne;
     private Employe employe;
     private Set paniercaissiers = new HashSet(0);

    public Caissier() {
    }

	
    public Caissier(Employe employe) {
        this.employe = employe;
    }
    public Caissier(Employe employe, Set paniercaissiers) {
       this.employe = employe;
       this.paniercaissiers = paniercaissiers;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="employe"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="codepersonne", nullable=false, length=40)
    public String getCodepersonne() {
        return this.codepersonne;
    }
    
    public void setCodepersonne(String codepersonne) {
        this.codepersonne = codepersonne;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Employe getEmploye() {
        return this.employe;
    }
    
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="caissier")
    public Set getPaniercaissiers() {
        return this.paniercaissiers;
    }
    
    public void setPaniercaissiers(Set paniercaissiers) {
        this.paniercaissiers = paniercaissiers;
    }




}

