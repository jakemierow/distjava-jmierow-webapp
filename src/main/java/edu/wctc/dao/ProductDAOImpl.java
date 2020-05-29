package edu.wctc.dao;

import edu.wctc.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Product> getProducts() {
        Session session = sessionFactory.getCurrentSession();

        List<Product> productList = session.createQuery("from Product", Product.class).getResultList();

        return productList;

    }

    @Override
    public void saveProduct(Product product) {

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(product);

    }

    @Override
    public Product getProduct(int id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Product.class, id);
    }

    @Override
    public void deleteProduct(int id) {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("delete from Product where id = :doomedProduct");
        query.setParameter("doomedProduct", id);

        query.executeUpdate();


        Product productToDelete = session.get(Product.class, id);


    }

    @Override
    public List<Product> getProductsByName(String theSearchTerm) {
        Session session = sessionFactory.getCurrentSession();

        theSearchTerm = "%" + theSearchTerm.toLowerCase() + "%";

        Query<Product> query = session.createQuery("from Product where lower(name) like :search");
        query.setParameter("search", theSearchTerm);

        return query.getResultList();
    }
}
