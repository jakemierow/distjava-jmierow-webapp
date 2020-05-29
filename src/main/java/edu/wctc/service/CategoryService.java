package edu.wctc.service;

import edu.wctc.entity.Category;

import java.util.List;

public interface CategoryService
{

    List<Category> getCategories();

    Category getCategory(int id);

}
