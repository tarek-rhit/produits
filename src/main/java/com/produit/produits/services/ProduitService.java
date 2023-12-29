package com.produit.produits.services;

import com.produit.produits.entities.Produit;

import java.util.List;

public interface ProduitService {

    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteById(Long pid);
    Produit getProduit(Long pid);
    List<Produit> getAllProduits();
}
