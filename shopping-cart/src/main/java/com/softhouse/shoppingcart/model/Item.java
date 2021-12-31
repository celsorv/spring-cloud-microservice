package com.softhouse.shoppingcart.model;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RedisHash("item")
public class Item {

    private Long productId;
    private Integer amount;

}
