/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webserviceVoiture.webserviceVoiture.voiture_model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TOAVINA
 */
@Repository
public class Comission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "annonce_id" , nullable = false)
    private Ad ad;
    
    private LocalDateTime dateComission = LocalDateTime.now();
    
    private double prix_recu;

    public Comission() {
    }

    public Comission(Long id, Ad ad, double prix_recu) {
        this.id = id;
        this.ad = ad;
        this.prix_recu = prix_recu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }

    public LocalDateTime getDateComission() {
        return dateComission;
    }

    public void setDateComission(LocalDateTime dateComission) {
        this.dateComission = dateComission;
    }

    public double getPrix_recu() {
        return prix_recu;
    }

    public void setPrix_recu(double prix_recu) {
        this.prix_recu = prix_recu;
    }
}
