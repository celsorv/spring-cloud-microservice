package com.softhouse.shoppingcart.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@RedisHash("cart")
public class Cart {

    @Id
    @NonNull
    private Long id;

    @Getter(AccessLevel.NONE)
    private List<Item> items;

    public List<Item> getItems() {
        if (items == null)
            items = new ArrayList<>();

        return items;
    }

}
