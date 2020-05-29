package edu.wctc.service;

import edu.wctc.dao.ProductDAO;
import edu.wctc.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO ProductDAO;

    @Override
    @Transactional
    public List<Product> getProducts() {
        return ProductDAO.getProducts();
    }

    @Override
    @Transactional
    public void saveProduct(Product product) {

        ProductDAO.saveProduct(product);
    }

    @Override
    @Transactional
    public Product getProduct(int id) {
        return ProductDAO.getProduct(id);
    }

    @Override
    @Transactional
    public void deleteProduct(int id) {
        ProductDAO.deleteProduct(id);
    }

    @Override
    @Transactional
    public List<Product> getProductsByName(String theSearchTerm) {
        return ProductDAO.getProductsByName(theSearchTerm);
    }
}
