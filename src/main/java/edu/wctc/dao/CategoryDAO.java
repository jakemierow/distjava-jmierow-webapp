package edu.wctc.dao;

import edu.wctc.entity.Category;

import java.util.List;

public interface CategoryDAO {


    List<Category> getCategories();


    Category getCategory(int id);


}
