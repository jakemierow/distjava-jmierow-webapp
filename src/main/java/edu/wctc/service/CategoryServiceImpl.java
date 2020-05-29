package edu.wctc.service;

import edu.wctc.dao.CategoryDAO;
import edu.wctc.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService
{

    @Autowired
    private CategoryDAO CategoryDAO;

    @Override
    @Transactional
    public List<Category> getCategories() {
        return CategoryDAO.getCategories();
    }

    @Override
    @Transactional
    public Category getCategory(int id) {
        return CategoryDAO.getCategory(id);
    }
}
