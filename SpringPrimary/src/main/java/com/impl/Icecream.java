package com.impl;

import com.Dessert;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
class Icecream implements Dessert {
	@Override
	public void dessertName() {
		System.out.println("--- Icecream ---");
	}
}