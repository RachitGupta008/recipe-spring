package com.learning.springrecipe.repositories;

import com.learning.springrecipe.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
