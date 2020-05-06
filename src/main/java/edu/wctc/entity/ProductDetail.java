package edu.wctc.entity;

import javax.persistence.*;

@Table(name = "productdetails")
public class ProductDetail {

    @OneToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "productid")
    private Product product;

    @Column(name = "price")
    private int price;

    @OneToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "categoryid")
    private Category category;


    public ProductDetail(int price)
    {
        this.price = price;
    }

}