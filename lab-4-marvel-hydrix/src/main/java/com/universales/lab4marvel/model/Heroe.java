package com.universales.lab4marvel.model;

/**
 * 'Heroe' object is nicely represented in JSON over a regular String.
 */
public class Heroe {

	public String heroe;

	public Heroe() {
		super();
	}	
	
	public Heroe(String heroe) {
		this();
		this.heroe = heroe;
	}

	public String getHeroe() {
		return heroe;
	}
	
	public String getString() {
		return getHeroe();
	}

	public void setHeroe(String heroe) {
		this.heroe = heroe;
	}
	
	
}