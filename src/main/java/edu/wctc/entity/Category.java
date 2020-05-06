package edu.wctc.entity;

import javax.persistence.*;

@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryid")
    private int categoryId;

    @Column(name = "categoryname")
    private String categoryName;

    public Category(String categoryName)
    {
        this.categoryName = categoryName;
    }

}
