package edu.wctc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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


@NotNull(message = "required")
@Size(min = 1, message = "must be greater than 0")
@Column(name = "productname")
private String name;


@NotNull(message = "required")
@Min(value = 1, message = "must be greater than 0")
@Column(name = "price")
private Integer price;



@NotNull
@ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "categoryid")
    private Category category;

public Product(String name)
{
    this.name = name;
}

}
