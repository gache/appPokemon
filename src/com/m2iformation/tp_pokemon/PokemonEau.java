package com.m2iformation.tp_pokemon;

public class PokemonEau extends Pokemon {
	public PokemonEau(String nom, double hp, int atk) {
		super(nom, hp, atk);
	}
	
	@Override
	public void attaquer(Pokemon p) {
		if (p instanceof PokemonFeu) {
			// pour attaquer le pokemon plante deux fois
			p.setHp(p.getHp() - (2 * this.getAtk()));
		}else if (p instanceof PokemonEau || p instanceof PokemonPlante) {
			p.setHp(p.getHp() - (0.5 * this.getAtk()));
		}else {
			p.setHp(p.getHp() - this.getAtk());
		}
		
	}
}
