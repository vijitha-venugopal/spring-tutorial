package com.impl;
import com.Dessert;
import org.springframework.stereotype.Component;

@Component
public class Cake implements Dessert {

	@Override
	public void dessertName() {
		System.out.println("----Cake----");
	}
}