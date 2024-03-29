package guru.springframework.services;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.domain.Recipe;

@Service
public interface RecipeService {
	
	Set<Recipe> getRecipes();
	
	Recipe findById(String id);
	
	RecipeCommand findCommandById(String id);
	
	RecipeCommand saveRecipeCommand(RecipeCommand command);
	
	void deleteById(String id);
}
