package edu.wctc.dao;

import edu.wctc.entity.Product;

import java.util.List;

public interface ProductDAO {

    List<Product> getProducts();

    void saveProduct (Product product);

    Product getProduct(int id);

    void deleteProduct(int id);

    List<Product> getProductsByName(String theSearchTerm);


}
