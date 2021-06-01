package com.learning.springrecipe.repositories;

import com.learning.springrecipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipiesRepository extends CrudRepository<Recipe, Long> {
}
