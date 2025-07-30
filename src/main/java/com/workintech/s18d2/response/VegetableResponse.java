package com.workintech.s18d2.response;

import com.workintech.s18d2.entity.Vegetable;

public record VegetableResponse(String message, Vegetable vegetable) {
}