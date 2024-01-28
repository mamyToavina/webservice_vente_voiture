/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webserviceVoiture.webserviceVoiture.service;

import com.webserviceVoiture.webserviceVoiture.repository.CategoryRepository;
import com.webserviceVoiture.webserviceVoiture.voiture_model.Category;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TOAVINA
 */

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository category_repo;
    
    public Category findById(Long id){
        try {
            Optional<Category> userOptional = category_repo.findById(id);
            return userOptional.orElse(null);
        } catch (NumberFormatException e) {
            System.out.println("L'ID n'est pas un nombre valide : " + id);
            return null;
        }
    }
}
