package edu.wctc.service.converter;

import edu.wctc.entity.Category;
import edu.wctc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToCategoryConverter implements Converter<String, Category> {

    @Autowired
    private CategoryService categoryService;

    @Override
    public Category convert(String categoryId) {
        int categoryIdNumber = Integer.parseInt(categoryId);
        Category theCategory = categoryService.getCategory(categoryIdNumber);
        return theCategory;
    }
}
