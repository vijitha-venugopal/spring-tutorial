package com;

import org.springframework.stereotype.Component;

@Component(value="icecream")
public class Icecream implements Dessert {
    @Override
	public void printName() {
		System.out.println("---  IceCream  ---");
	}
} 