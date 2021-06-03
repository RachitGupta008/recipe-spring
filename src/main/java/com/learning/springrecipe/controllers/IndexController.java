package com.learning.springrecipe.controllers;

import com.learning.springrecipe.model.Recipe;
import com.learning.springrecipe.repositories.RecipiesRepository;
import com.learning.springrecipe.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {
    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = {"","/","/index"},
            method = RequestMethod.GET)
    public String getIndex(){
        List<Recipe> rs = recipeService.getRecipes();


        return "index";
    }
}
