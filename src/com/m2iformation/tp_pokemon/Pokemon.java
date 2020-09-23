package com.m2iformation.tp_pokemon;

public class Pokemon {
	
	/*============ Creation de mes attribut ============*/
	private String nom;
	private double hp;
	private int atk;

	/*============ Creation de mes constructeur ============*/
	public Pokemon() {

	}
	public Pokemon(String nom, double hp, int atk) {
		this.nom = nom;
		this.hp = hp;
		this.atk = atk;
	}


	/*============ Creation de mes getter and setter ============*/

		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public double getHp() {
			return hp;
		}
		public void setHp(double hp) {
			this.hp = hp;
		}
		public int getAtk() {
			return atk;
		}
		public void setAtk(int atk) {
			this.atk = atk;
		}
		

	/*============ Creation de mes Methodes============*/

	public boolean isDead() {
		//		if (this.hp <= 0) {
		//			return true;
		//		}
		//		return false;

		// autre façon de faire 
		return this.hp <= 0; // c'est comme une espece de condition ternaire

	}

	public void attaquer(Pokemon p) {
		p.hp = p.hp - this.atk;
		//		p.hp -= this.atk;
	}

	private String getInstance() {

		if (this instanceof PokemonPlante) {
			return "Plante";
		} else if (this instanceof PokemonFeu) {
			return "Feu";
		}else if (this instanceof PokemonEau) {
			return "Eeu";
		}else {
			return "Normal";
		}
	}


	/*============ Redéfinition de la methode toString ============*/
	@Override
	public String toString() {
		return "Le Pokemon " + getInstance() + " s'appelant " + nom + 
				" a une attaque de " + hp + 
				" et lui reste " + atk + 
				" points de vie.";
	}

}
