package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
class DessertService {
    private Dessert dessert;
	@Autowired
	public DessertService(@Qualifier("icecream") Dessert dessert){
		this.dessert = dessert;
	}
	Dessert getDessert() {
		return dessert;
	}
}