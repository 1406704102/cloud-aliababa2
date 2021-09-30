package com.pj.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ACCOUNT_CODE")
    private String accountCode;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "COUNT")
    private Integer count;

    @Column(name = "AMOUNT")
    private BigDecimal amount;
}
