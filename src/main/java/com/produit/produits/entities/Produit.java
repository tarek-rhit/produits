package com.produit.produits.entities;

import jakarta.persistence.*;



@Entity
@Table(name="produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    @Column
    private String nameProduit;
    @Column
    private Double prixProduit;
    @Column
    private Date dateCreationProduit;


    public Produit() {
    }

    public Produit(String nameProduit, Double prixProduit, Date dateCreationProduit) {
        this.nameProduit = nameProduit;
        this.prixProduit = prixProduit;
        this.dateCreationProduit = dateCreationProduit;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getNameProduit() {
        return nameProduit;
    }

    public void setNameProduit(String nameProduit) {
        this.nameProduit = nameProduit;
    }

    public Double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(Double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public Date getDateCreationProduit() {
        return dateCreationProduit;
    }

    public void setDateCreationProduit(Date dateCreationProduit) {
        this.dateCreationProduit = dateCreationProduit;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "idProduit=" + idProduit +
                ", nameProduit='" + nameProduit + '\'' +
                ", prixProduit=" + prixProduit +
                ", dateCreationProduit=" + dateCreationProduit +
                '}';
    }
}
