package com.softhouse.productcatalog.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@ToString
@Document(indexName = "product")
public class Product {

    @Id
    private Long id;

    private String name;
    private Integer amount;

}