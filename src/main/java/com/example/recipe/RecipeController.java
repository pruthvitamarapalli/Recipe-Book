package com.example.recipe;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class RecipeController {

    RecipeService recipeService = new RecipeService();

    @GetMapping("/recipes")
    public ArrayList<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipeById(@PathVariable("recipeId") int recipeId) {
        return recipeService.getRecipeById(recipeId);
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

    @PutMapping("/recipes/{recipeId}")
    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe) {
        return recipeService.updateRecipe(recipeId, recipe);
    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable("recipeId") int recipeId) {
        recipeService.deleteRecipe(recipeId);
    }
}