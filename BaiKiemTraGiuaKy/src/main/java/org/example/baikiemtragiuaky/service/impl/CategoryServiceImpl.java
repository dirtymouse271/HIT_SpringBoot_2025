package org.example.baikiemtragiuaky.service.impl;


import lombok.RequiredArgsConstructor;
import org.example.baikiemtragiuaky.domain.entity.Category;
import org.example.baikiemtragiuaky.repository.CategoryRepository;
import org.example.baikiemtragiuaky.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(int id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
