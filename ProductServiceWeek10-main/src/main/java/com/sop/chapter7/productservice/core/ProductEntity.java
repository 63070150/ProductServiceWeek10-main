package com.sop.chapter7.productservice.core;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
public class ProductEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1726413140026356198L;
    @Id
    @Column(unique = true)
    private  String productID;
    private String title;
    private BigDecimal price;
    private Integer quantity;
}
