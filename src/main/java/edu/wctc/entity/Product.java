package edu.wctc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "productid")
private int id;

@Column(name = "productname")
private String name;

public Product(String name)
{
    this.name = name;
}

}
