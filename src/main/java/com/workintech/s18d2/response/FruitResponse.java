package com.workintech.s18d2.response;

import com.workintech.s18d2.entity.Fruit;

public record FruitResponse(String message, Fruit fruit) {
}