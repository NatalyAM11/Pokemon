package model;

import processing.core.PApplet;

public abstract class Pokemons {
	
	public PApplet app;
	public int posX, posY, vida, poder;
	public String debilidad, nombre, tipo;
	
	
	public Pokemons(int posX, int posY, String nombre, int poder,int vida, String tipo) {
		
		this.posX=posX;
		this.posY=posY;
		this.nombre = nombre;
		this.poder = poder;
		this.vida = vida;
		this.tipo = tipo;
		
	}
	
	public abstract void pintar();
	public abstract void mover();
	public abstract void pintarGif();
	
	
	

}
