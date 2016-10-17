/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kuungfu-sheep
 */
@Entity
@Table(name = "match")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Match.findAll", query = "SELECT m FROM Match m"),
    @NamedQuery(name = "Match.findById", query = "SELECT m FROM Match m WHERE m.id = :id"),
    @NamedQuery(name = "Match.findByEquipe1", query = "SELECT m FROM Match m WHERE m.equipe1 = :equipe1"),
    @NamedQuery(name = "Match.findByEquipe2", query = "SELECT m FROM Match m WHERE m.equipe2 = :equipe2"),
    @NamedQuery(name = "Match.findByCote", query = "SELECT m FROM Match m WHERE m.cote = :cote"),
    @NamedQuery(name = "Match.findByDateHeure", query = "SELECT m FROM Match m WHERE m.dateHeure = :dateHeure")})
public class Match implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "equipe1")
    private String equipe1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "equipe2")
    private String equipe2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cote")
    private float cote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_heure")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeure;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMatch")
    private Collection<Paris> parisCollection;

    public Match() {
    }

    public Match(Integer id) {
        this.id = id;
    }

    public Match(Integer id, String equipe1, String equipe2, float cote, Date dateHeure) {
        this.id = id;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.cote = cote;
        this.dateHeure = dateHeure;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(String equipe1) {
        this.equipe1 = equipe1;
    }

    public String getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(String equipe2) {
        this.equipe2 = equipe2;
    }

    public float getCote() {
        return cote;
    }

    public void setCote(float cote) {
        this.cote = cote;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Date dateHeure) {
        this.dateHeure = dateHeure;
    }

    @XmlTransient
    public Collection<Paris> getParisCollection() {
        return parisCollection;
    }

    public void setParisCollection(Collection<Paris> parisCollection) {
        this.parisCollection = parisCollection;
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
        if (!(object instanceof Match)) {
            return false;
        }
        Match other = (Match) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.entities.Match[ id=" + id + " ]";
    }
    
}
