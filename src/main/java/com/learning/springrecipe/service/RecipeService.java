package com.learning.springrecipe.service;

import com.learning.springrecipe.model.Recipe;
import com.learning.springrecipe.repositories.RecipiesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RecipeService {

    private RecipiesRepository recipiesRepository;

    public RecipeService(RecipiesRepository recipiesRepository) {
        this.recipiesRepository = recipiesRepository;
    }

    public List<Recipe> getRecipes(){
        return (List<Recipe>) recipiesRepository.findAll();
    }
}
