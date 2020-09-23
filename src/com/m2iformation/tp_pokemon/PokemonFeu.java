package com.m2iformation.tp_pokemon;

public class PokemonFeu extends Pokemon {
	public PokemonFeu(String nom, double hp, int atk) {
		super(nom, hp, atk);
	}

	@Override
	public void attaquer(Pokemon p) {
		if (p instanceof PokemonPlante) {
			// pour attaquer le pokemon plante deux fois
			p.setHp(p.getHp() - (2 * this.getAtk()));
		}else if (p instanceof PokemonFeu || p instanceof PokemonFeu) {
			p.setHp(p.getHp() - (0.5 * this.getAtk()));
		}else {
			p.setHp(p.getHp() - this.getAtk());
		}
		
	}

	
	
	
	

}
