package edu.wctc.dao;

import edu.wctc.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> getCategories() {
        Session session = sessionFactory.getCurrentSession();


        List<Category> categoryList = session.createQuery("from Category", Category.class).getResultList();

        return categoryList;
    }

    @Override
    public Category getCategory(int id) {
       Session session = sessionFactory.getCurrentSession();

       Category category = session.get(Category.class, id);

       return category;
    }
}
