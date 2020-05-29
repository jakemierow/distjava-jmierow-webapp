package edu.wctc.service;

import edu.wctc.entity.Product;

import java.util.List;

public interface ProductService
{
    List<Product> getProducts();

    void saveProduct (Product product);

    Product getProduct(int id);

    void deleteProduct(int id);

    List<Product> getProductsByName(String theSearchTerm);

}
