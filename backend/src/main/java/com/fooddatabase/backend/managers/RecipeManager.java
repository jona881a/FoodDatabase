package com.fooddatabase.backend.managers;

import com.fooddatabase.backend.Repositories.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeManager {

    private RecipeRepository recipeRepository;

    public RecipeManager(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
}
