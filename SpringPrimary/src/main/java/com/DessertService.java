package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class DessertService {
    private Dessert dessert;
	public Dessert getDessert() {
		return dessert;
	}
	@Autowired
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
} 