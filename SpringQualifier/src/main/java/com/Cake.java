package com;

import org.springframework.stereotype.Component;

@Component(value="cake")
public class Cake implements Dessert {
    @Override
	public void printName() {
		System.out.println("---  Cake  ---");
	}
} 