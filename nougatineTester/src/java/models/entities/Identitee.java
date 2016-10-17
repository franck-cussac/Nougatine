/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kuungfu-sheep
 */
@Entity
@Table(name = "identitee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Identitee.findAll", query = "SELECT i FROM Identitee i"),
    @NamedQuery(name = "Identitee.findById", query = "SELECT i FROM Identitee i WHERE i.id = :id"),
    @NamedQuery(name = "Identitee.findByGenre", query = "SELECT i FROM Identitee i WHERE i.genre = :genre"),
    @NamedQuery(name = "Identitee.findByPrenom", query = "SELECT i FROM Identitee i WHERE i.prenom = :prenom"),
    @NamedQuery(name = "Identitee.findByNom", query = "SELECT i FROM Identitee i WHERE i.nom = :nom"),
    @NamedQuery(name = "Identitee.findByBirthdate", query = "SELECT i FROM Identitee i WHERE i.birthdate = :birthdate")})
public class Identitee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "genre")
    private String genre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users idUser;

    public Identitee() {
    }

    public Identitee(Integer id) {
        this.id = id;
    }

    public Identitee(Integer id, String genre, String prenom, String nom, Date birthdate) {
        this.id = id;
        this.genre = genre;
        this.prenom = prenom;
        this.nom = nom;
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Users getIdUser() {
        return idUser;
    }

    public void setIdUser(Users idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Identitee)) {
            return false;
        }
        Identitee other = (Identitee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.entities.Identitee[ id=" + id + " ]";
    }
    
}
