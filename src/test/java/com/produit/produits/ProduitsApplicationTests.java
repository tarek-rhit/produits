package com.produit.produits;

import com.produit.produits.entities.Produit;
import com.produit.produits.repositories.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Date;
import java.util.List;

@SpringBootTest
class ProduitsApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;

    @Test
    public void testCreateProduit(){
        Produit produit = new Produit("Mousse", 20.45, new Date());
        produitRepository.save(produit);
    }

    @Test
    public void testupdateProduit(){
        Produit p = produitRepository.findById(1L).get();
        p.setPrixProduit(18.23);
        produitRepository.save(p);
        System.out.println(p);
    }

    @Test
    public void testFindProduit(){
        Produit pro = produitRepository.findById(4L).get();
        System.out.println(pro);
    }

    @Test
    public void testGetALLProduit(){
        List<Produit> produitList = produitRepository.findAll();
        for (Produit p: produitList
             ) {
            System.out.println(p);
        }
    }


    @Test
    public void testDeleteProduit(){
        produitRepository.deleteById(1L);
        System.out.println("Le produit est supprimé");



        }


}
