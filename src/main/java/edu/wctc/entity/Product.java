package edu.wctc.entity;

import edu.wctc.entity.ProductDetail;

public class Product {
    private int productID;
    private String productName;
    private ProductDetail detail;

    public Product() {

    }

    public ProductDetail getDetail() {
        return detail;
    }

    public void setDetail(ProductDetail detail) {
        this.detail = detail;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}