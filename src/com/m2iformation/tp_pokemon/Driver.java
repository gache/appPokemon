package com.m2iformation.tp_pokemon;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pokemon pok = creationPokemon(sc, "Joueur 1");
		Pokemon pok2 = creationPokemon(sc, "Joueur 2");
		
		System.out.println(pok);
		System.out.println(pok2);
		// je fais une boucle while pour faire mes attaques
		// en tant pok  ou pok2 qu'il est pas mort tu es dans la boucle
		int count = 0;
		while (!pok.isDead() && !pok2.isDead()) {
			// condition pour les attaques
			if (count % 2 == 0 ) {
				pok.attaquer(pok2); // paire
			} else {
				pok2.attaquer(pok); // impaire
			}
			count++;
		}
		// condition  pour savoir qui a gagner dans le combat
		if (pok.isDead() || pok2.isDead()) {
			System.out.println(pok2 + " Félicitations");
		} else {
			System.out.println(pok + " Felicitations");
		}
	
	}
	
	private static Pokemon creationPokemon(Scanner sc, String joueur) {
		
		System.out.println(joueur);
		
		System.out.println("Choisis un Pokemon: ");
		System.out.println("\t 1 - Pokemon");
		System.out.println("\t 2 - Pokemon feu");
		System.out.println("\t 3 - Pokemon eau");
		System.out.println("\t 4 - Pokemon plante");
		
		int choix = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Choisi un nom de pokemon: ");
		String nom = sc.nextLine();
		
		System.out.println("Choisi les points de ton pokemon: ");
		double hp = sc.nextDouble();
		
		System.out.println("Choisi les points d'attaque ton pokemon:");
		int atk = sc.nextInt();
		sc.nextLine();
		
		switch (choix) {
		case 1:
			return new Pokemon(nom,hp,atk);
		case 2:
			return new PokemonFeu(nom,hp,atk);
		case 3:
			return new PokemonEau(nom,hp,atk);
		case 4:
			return new PokemonPlante(nom,hp,atk);
		}
		return null;
		
	}

}
