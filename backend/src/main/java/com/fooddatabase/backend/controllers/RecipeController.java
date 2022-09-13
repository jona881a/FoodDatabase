package com.fooddatabase.backend.controllers;

import com.fooddatabase.backend.managers.RecipeManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/recipe")
public class RecipeController {

    RecipeManager recipeManager;

    public RecipeController(RecipeManager recipeManager) {
        this.recipeManager = recipeManager;
    }
}
