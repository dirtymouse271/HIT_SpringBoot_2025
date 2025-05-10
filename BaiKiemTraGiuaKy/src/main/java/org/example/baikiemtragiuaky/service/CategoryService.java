package org.example.baikiemtragiuaky.service;

import org.example.baikiemtragiuaky.domain.entity.Category;

import java.util.List;

public interface CategoryService {
    public Category createCategory(Category category);
    public void deleteCategory(int id);
    public List<Category> getAllCategories();
    public Category getCategoryById(int id);
}
