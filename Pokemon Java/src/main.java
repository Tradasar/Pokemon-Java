import java.util.Iterator;

import javax.swing.*;





public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mainMenu = {
				"New Game",
				"Options",
				"Credits",
				"Quit"
		};
		String name = "Red";
		String nameRival = "Gary";
		//YOUR POKEMON
		int[] pokemonSpeciesID = new int[20];
		String[] pokemonSpeciesName = {
				"Charmander",
				"Bulbasaur",
				"Squirtle"
		};
		int selectedPokemon; 
		int newPokemon;
		String[] pokemonName = new String[20];
		int pokemonIV;
		int[] pokemonEV = new int[20];
		int pokemonNatureID;
		String[] pokemonNature = {
				"Hardy",
				"Lonely",
				"Adamant",
				"Naughty",
				"Brave",
				"Bold",
				"Docile",
				"Impish",
				"Lax",
				"Relaxed",
				"Modest",
				"Mild",
				"Bashful",
				"Rash",
				"Quiet",
				"Calm",
				"Gentle",
				"Careful",
				"Quirky",
				"Sassy",
				"Timid",
				"Hasty",
				"Jolly",
				"Naive",
				"Serious"
		};
		
		Boolean[] isShiny = new Boolean[20];
		int[] hpStat = new int[20];
		int[] speedStat = new int[20];
		int[] attackStat = new int[20];
		int[] defenseStat = new int[20];
		int[] spAttackStat = new int[20];
		int[] spDefenseStat = new int[20];
		int totalIV = 0;
		String[] pokemonElements = {
				"Fire",
				"Grass",
				"Poison",
				"Water"
		};
		int pokemonElementID1;
		int pokemonElementID2 = 0;
		///////////////
		//RIVAL POKEMON
		///////////////
		int[] rivalpokemonSpeciesID = new int[20];
		String[] rivalpokemonName = new String[20];
		int rivalpokemonIV;
		int[] rivalpokemonEV = new int[20];
		int rivalpokemonNatureID;
		int[] rivalhpStat = new int[20];
		int[] rivalspeedStat = new int[20];
		int[] rivalattackStat = new int[20];
		int[] rivaldefenseStat = new int[20];
		int[] rivalspAttackStat = new int[20];
		int[] rivalspDefenseStat = new int[20];
		int rivaltotalIV = 0;
		int rivalpokemonElementID1;
		int rivalpokemonElementID2 = 0;
		
		String[] FightOptions = {
			"Fight", "Item", "Run"
		};
		
		String[] SquirtleMoves = {
			"Tackle", "Tail Whip"
		};
		
		String[] CharmanderMoves = {
			"Growl", "Scratch"
		};
		
		String[] BulbasaurMoves = {
			"Growl", "Tackle"
		};
		int fightselection;
		
		int mainMenuSelection = 0;
		do {
			mainMenuSelection = JOptionPane.showOptionDialog(null, null, "Main Menu", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/title.png")), mainMenu, mainMenu[0]);
			switch(mainMenuSelection){
				case 0:
					
					//Obtenes un nuevo pokemon
					//Si es un squirtle
					
					
					newPokemon = JOptionPane.showOptionDialog(null, null, null, 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/hornDrill.png")), pokemonSpeciesName, pokemonSpeciesName[0]);
					switch(newPokemon) {
						case 0:
							pokemonName[0] = pokemonSpeciesName[0];
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							hpStat[0] = 39 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							attackStat[0] = 52 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							defenseStat[0] = 43 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							spAttackStat[0] = 60 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							spDefenseStat[0] = 50 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							speedStat[0] = 65 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonNatureID = (int) (Math.random() * 24);				
							if (pokemonNatureID == 0) {
								//Hardy
							}
							if (pokemonNatureID == 1) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 2) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 3) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 4) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 5) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 6) {
								//Docile
							}
							if (pokemonNatureID == 7) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 8) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 9) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 10) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 11) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 12) {
								//Bashful
							}
							if (pokemonNatureID == 13) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 14) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 15) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 16) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 17) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 18) {
								//Quirky
							}
							if (pokemonNatureID == 19) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 20) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 21) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 22) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 23) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 24) {
								//Serious
							}
							
							
							pokemonElementID1 = 0;
							if(pokemonElementID2 != 0) {
								JOptionPane.showMessageDialog(null, pokemonName[0] + "\nHP: " + hpStat[0] + "\nAttack: " + attackStat[0] + "\nDefense: " + defenseStat[0] + "\nSp. Attack: " + spAttackStat[0] + "\nSp. Defense: " + spDefenseStat[0] + "\nSpeed: " + speedStat[0] + "\n\nNature: " + pokemonNature[pokemonNatureID] + "\nElements: " + pokemonElements[pokemonElementID1] + ", " + pokemonElements[pokemonElementID2] + "\n\nTotal IVs: " + totalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + pokemonName[0] + ".png")));
							}else {
								JOptionPane.showMessageDialog(null, pokemonName[0] + "\nHP: " + hpStat[0] + "\nAttack: " + attackStat[0] + "\nDefense: " + defenseStat[0] + "\nSp. Attack: " + spAttackStat[0] + "\nSp. Defense: " + spDefenseStat[0] + "\nSpeed: " + speedStat[0] + "\n\nNature: " + pokemonNature[pokemonNatureID] + "\nElement: " + pokemonElements[pokemonElementID1] + "\n\nTotal IVs: " + totalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + pokemonName[0] + ".png")));	
							}
							
							totalIV = 0;
							
							
							//////////////////////////////////////////////
							/////////////////RIVAL POKEMON SELECTION//////
							//////////////////////////////////////////////
							
							rivalpokemonName[0] = pokemonSpeciesName[2];
							rivalpokemonIV = (int) (Math.random()*31 + 1);
							rivalpokemonIV = 2 * rivalpokemonIV + 1;
							rivalhpStat[0] = 44 + rivalpokemonIV;
							rivaltotalIV = rivaltotalIV + rivalpokemonIV;
							rivalpokemonIV = (int) (Math.random()*31 + 1);
							rivalpokemonIV = 2 * rivalpokemonIV + 1;
							rivalattackStat[0] = 48 + rivalpokemonIV;
							rivaltotalIV = rivaltotalIV + rivalpokemonIV;
							rivalpokemonIV = (int) (Math.random()*31 + 1);
							rivalpokemonIV = 2 * rivalpokemonIV + 1;
							rivaldefenseStat[0] = 65 + rivalpokemonIV;
							rivaltotalIV = rivaltotalIV + rivalpokemonIV;
							rivalpokemonIV = (int) (Math.random()*31 + 1);
							rivalpokemonIV = 2 * rivalpokemonIV + 1;
							rivalspAttackStat[0] = 50 + rivalpokemonIV;
							rivaltotalIV = rivaltotalIV + rivalpokemonIV;
							rivalpokemonIV = (int) (Math.random()*31 + 1);
							rivalpokemonIV = 2 * rivalpokemonIV + 1;
							rivalspDefenseStat[0] = 64 + rivalpokemonIV;
							rivaltotalIV = rivaltotalIV + rivalpokemonIV;
							rivalpokemonIV = (int) (Math.random()*31 + 1);
							rivalpokemonIV = 2 * rivalpokemonIV + 1;
							rivalspeedStat[0] = 43 + rivalpokemonIV;
							rivaltotalIV = rivaltotalIV + rivalpokemonIV;
							rivalpokemonNatureID = (int) (Math.random() * 24);				
							if (rivalpokemonNatureID == 0) {
								//Hardy
							}
							if (rivalpokemonNatureID == 1) {
								rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
								rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 2) {
								rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
								rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 3) {
								rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
								rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 4) {
								rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
								rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 5) {
								rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
								rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 6) {
								//Docile
							}
							if (rivalpokemonNatureID == 7) {
								rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
								rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 8) {
								rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
								rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 9) {
								rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
								rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 10) {
								rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
								rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 11) {
								rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
								rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 12) {
								//Bashful
							}
							if (rivalpokemonNatureID == 13) {
								rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
								rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 14) {
								rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
								rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 15) {
								rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
								rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 16) {
								rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
								rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 17) {
								rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
								rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 18) {
								//Quirky
							}
							if (rivalpokemonNatureID == 19) {
								rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
								rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 20) {
								rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
								rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 21) {
								rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
								rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 22) {
								rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
								rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 23) {
								rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
								rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
							}
							if (rivalpokemonNatureID == 24) {
								//Serious
							}
							
							rivalpokemonElementID1 = 3;
							if(pokemonElementID2 != 0) {
								JOptionPane.showMessageDialog(null, rivalpokemonName[0] + "\nHP: " + rivalhpStat[0] + "\nAttack: " + rivalattackStat[0] + "\nDefense: " + rivaldefenseStat[0] + "\nSp. Attack: " + rivalspAttackStat[0] + "\nSp. Defense: " + rivalspDefenseStat[0] + "\nSpeed: " + rivalspeedStat[0] + "\n\nNature: " + pokemonNature[rivalpokemonNatureID] + "\nElements: " + pokemonElements[rivalpokemonElementID1] + ", " + pokemonElements[rivalpokemonElementID2] + "\n\nTotal IVs: " + rivaltotalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + rivalpokemonName[0] + ".png")));
							}else {
								JOptionPane.showMessageDialog(null, rivalpokemonName[0] + "\nHP: " + rivalhpStat[0] + "\nAttack: " + rivalattackStat[0] + "\nDefense: " + rivaldefenseStat[0] + "\nSp. Attack: " + rivalspAttackStat[0] + "\nSp. Defense: " + rivalspDefenseStat[0] + "\nSpeed: " + rivalspeedStat[0] + "\n\nNature: " + pokemonNature[rivalpokemonNatureID] + "\nElement: " + pokemonElements[rivalpokemonElementID1] + "\n\nTotal IVs: " + rivaltotalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + rivalpokemonName[0] + ".png")));	
							}
							
							
							
							rivaltotalIV = 0;
							
							
						break;
						
						case 1:
							pokemonName[0] = pokemonSpeciesName[1];
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							hpStat[0] = 45 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							attackStat[0] = 49 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							defenseStat[0] = 49 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							spAttackStat[0] = 65 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							spDefenseStat[0] = 65 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							speedStat[0] = 45 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonNatureID = (int) (Math.random() * 24);				
							if (pokemonNatureID == 0) {
								//Hardy
							}
							if (pokemonNatureID == 1) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 2) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 3) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 4) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 5) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 6) {
								//Docile
							}
							if (pokemonNatureID == 7) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 8) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 9) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 10) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 11) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 12) {
								//Bashful
							}
							if (pokemonNatureID == 13) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 14) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 15) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 16) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 17) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 18) {
								//Quirky
							}
							if (pokemonNatureID == 19) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 20) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 21) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 22) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 23) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 24) {
								//Serious
							}
							
							
							pokemonElementID1 = 1;
							pokemonElementID2 = 2;
							if(pokemonElementID2 != 0) {
								JOptionPane.showMessageDialog(null, pokemonName[0] + "\nHP: " + hpStat[0] + "\nAttack: " + attackStat[0] + "\nDefense: " + defenseStat[0] + "\nSp. Attack: " + spAttackStat[0] + "\nSp. Defense: " + spDefenseStat[0] + "\nSpeed: " + speedStat[0] + "\n\nNature: " + pokemonNature[pokemonNatureID] + "\nElements: " + pokemonElements[pokemonElementID1] + ", " + pokemonElements[pokemonElementID2] + "\n\nTotal IVs: " + totalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + pokemonName[0] + ".png")));
							}else {
								JOptionPane.showMessageDialog(null, pokemonName[0] + "\nHP: " + hpStat[0] + "\nAttack: " + attackStat[0] + "\nDefense: " + defenseStat[0] + "\nSp. Attack: " + spAttackStat[0] + "\nSp. Defense: " + spDefenseStat[0] + "\nSpeed: " + speedStat[0] + "\n\nNature: " + pokemonNature[pokemonNatureID] + "\nElement: " + pokemonElements[pokemonElementID1] + "\n\nTotal IVs: " + totalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + pokemonName[0] + ".png")));	
							}
							totalIV = 0;
							
							
							
							
							
//////////////////////////////////////////////
			/////////////////RIVAL POKEMON SELECTION//////
			//////////////////////////////////////////////
			
			rivalpokemonName[0] = pokemonSpeciesName[2];
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivalhpStat[0] = 39 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivalattackStat[0] = 52 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivaldefenseStat[0] = 43 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivalspAttackStat[0] = 60 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivalspDefenseStat[0] = 50 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivalspeedStat[0] = 65 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonNatureID = (int) (Math.random() * 24);				
			if (rivalpokemonNatureID == 0) {
				//Hardy
			}
			if (rivalpokemonNatureID == 1) {
				rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 2) {
				rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 3) {
				rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 4) {
				rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
				rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 5) {
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
				rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 6) {
				//Docile
			}
			if (rivalpokemonNatureID == 7) {
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 8) {
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 9) {
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
				rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 10) {
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
				rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 11) {
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 12) {
				//Bashful
			}
			if (rivalpokemonNatureID == 13) {
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 14) {
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
				rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 15) {
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
				rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 16) {
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 17) {
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 18) {
				//Quirky
			}
			if (rivalpokemonNatureID == 19) {
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
				rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 20) {
				rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
				rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 21) {
				rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 22) {
				rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 23) {
				rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 24) {
				//Serious
			}
			
			rivalpokemonElementID1 = 3;
			if(pokemonElementID2 != 0) {
				JOptionPane.showMessageDialog(null, rivalpokemonName[0] + "\nHP: " + rivalhpStat[0] + "\nAttack: " + rivalattackStat[0] + "\nDefense: " + rivaldefenseStat[0] + "\nSp. Attack: " + rivalspAttackStat[0] + "\nSp. Defense: " + rivalspDefenseStat[0] + "\nSpeed: " + rivalspeedStat[0] + "\n\nNature: " + pokemonNature[rivalpokemonNatureID] + "\nElements: " + pokemonElements[rivalpokemonElementID1] + ", " + pokemonElements[rivalpokemonElementID2] + "\n\nTotal IVs: " + rivaltotalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + rivalpokemonName[0] + ".png")));
			}else {
				JOptionPane.showMessageDialog(null, rivalpokemonName[0] + "\nHP: " + rivalhpStat[0] + "\nAttack: " + rivalattackStat[0] + "\nDefense: " + rivaldefenseStat[0] + "\nSp. Attack: " + rivalspAttackStat[0] + "\nSp. Defense: " + rivalspDefenseStat[0] + "\nSpeed: " + rivalspeedStat[0] + "\n\nNature: " + pokemonNature[rivalpokemonNatureID] + "\nElement: " + pokemonElements[rivalpokemonElementID1] + "\n\nTotal IVs: " + rivaltotalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + rivalpokemonName[0] + ".png")));	
			}
			
			
						break;
						
						case 2:
							
							pokemonName[0] = pokemonSpeciesName[2];
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							hpStat[0] = 44 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							attackStat[0] = 48 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							defenseStat[0] = 65 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							spAttackStat[0] = 50 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							spDefenseStat[0] = 64 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							pokemonIV = (int) (Math.random()*31 + 1);
							pokemonIV = 2 * pokemonIV + 1;
							speedStat[0] = 43 + pokemonIV;
							totalIV = totalIV + pokemonIV;
							
							pokemonNatureID = (int) (Math.random() * 24);				
							if (pokemonNatureID == 0) {
								//Hardy
							}
							if (pokemonNatureID == 1) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 2) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 3) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 4) {
								attackStat[0] = (int) (attackStat[0] + attackStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 5) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 6) {
								//Docile
							}
							if (pokemonNatureID == 7) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 8) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 9) {
								defenseStat[0] = (int) (defenseStat[0] + defenseStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 10) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 11) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 12) {
								//Bashful
							}
							if (pokemonNatureID == 13) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 14) {
								spAttackStat[0] = (int) (spAttackStat[0] + spAttackStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 15) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 16) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 17) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 18) {
								//Quirky
							}
							if (pokemonNatureID == 19) {
								spDefenseStat[0] = (int) (spDefenseStat[0] + spDefenseStat[0] * 0.1);
								speedStat[0] = (int) (speedStat[0] - speedStat[0] * 0.1);
							}
							if (pokemonNatureID == 20) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								attackStat[0] = (int) (attackStat[0] - attackStat[0] * 0.1);
							}
							if (pokemonNatureID == 21) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								defenseStat[0] = (int) (defenseStat[0] - defenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 22) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								spAttackStat[0] = (int) (spAttackStat[0] - spAttackStat[0] * 0.1);
							}
							if (pokemonNatureID == 23) {
								speedStat[0] = (int) (speedStat[0] + speedStat[0] * 0.1);
								spDefenseStat[0] = (int) (spDefenseStat[0] - spDefenseStat[0] * 0.1);
							}
							if (pokemonNatureID == 24) {
								//Serious
							}
							
							pokemonElementID1 = 3;
							if(pokemonElementID2 != 0) {
								JOptionPane.showMessageDialog(null, pokemonName[0] + "\nHP: " + hpStat[0] + "\nAttack: " + attackStat[0] + "\nDefense: " + defenseStat[0] + "\nSp. Attack: " + spAttackStat[0] + "\nSp. Defense: " + spDefenseStat[0] + "\nSpeed: " + speedStat[0] + "\n\nNature: " + pokemonNature[pokemonNatureID] + "\nElements: " + pokemonElements[pokemonElementID1] + ", " + pokemonElements[pokemonElementID2] + "\n\nTotal IVs: " + totalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + pokemonName[0] + ".png")));
							}else {
								JOptionPane.showMessageDialog(null, pokemonName[0] + "\nHP: " + hpStat[0] + "\nAttack: " + attackStat[0] + "\nDefense: " + defenseStat[0] + "\nSp. Attack: " + spAttackStat[0] + "\nSp. Defense: " + spDefenseStat[0] + "\nSpeed: " + speedStat[0] + "\n\nNature: " + pokemonNature[pokemonNatureID] + "\nElement: " + pokemonElements[pokemonElementID1] + "\n\nTotal IVs: " + totalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + pokemonName[0] + ".png")));	
							}
							totalIV = 0;

							
							
							
							
//////////////////////////////////////////////
			/////////////////RIVAL POKEMON SELECTION//////
			//////////////////////////////////////////////
			
			rivalpokemonName[0] = pokemonSpeciesName[1];
			rivalpokemonNatureID = (int) (Math.random() * 24);	
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivalhpStat[0] = 45 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivalattackStat[0] = 49 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivaldefenseStat[0] = 49 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivalspAttackStat[0] = 65 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivalspDefenseStat[0] = 65 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonIV = (int) (Math.random()*31 + 1);
			rivalpokemonIV = 2 * rivalpokemonIV + 1;
			rivalspeedStat[0] = 45 + rivalpokemonIV;
			rivaltotalIV = rivaltotalIV + rivalpokemonIV;
			rivalpokemonElementID1 = 3;
			if (rivalpokemonNatureID == 0) {
				//Hardy
			}
			if (rivalpokemonNatureID == 1) {
				rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 2) {
				rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 3) {
				rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 4) {
				rivalattackStat[0] = (int) (rivalattackStat[0] + rivalattackStat[0] * 0.1);
				rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 5) {
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
				rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 6) {
				//Docile
			}
			if (rivalpokemonNatureID == 7) {
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 8) {
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 9) {
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] + rivaldefenseStat[0] * 0.1);
				rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 10) {
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
				rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 11) {
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 12) {
				//Bashful
			}
			if (rivalpokemonNatureID == 13) {
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 14) {
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] + rivalspAttackStat[0] * 0.1);
				rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 15) {
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
				rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 16) {
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 17) {
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 18) {
				//Quirky
			}
			if (rivalpokemonNatureID == 19) {
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] + rivalspDefenseStat[0] * 0.1);
				rivalspeedStat[0] = (int) (rivalspeedStat[0] - rivalspeedStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 20) {
				rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
				rivalattackStat[0] = (int) (rivalattackStat[0] - rivalattackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 21) {
				rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
				rivaldefenseStat[0] = (int) (rivaldefenseStat[0] - rivaldefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 22) {
				rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
				rivalspAttackStat[0] = (int) (rivalspAttackStat[0] - rivalspAttackStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 23) {
				rivalspeedStat[0] = (int) (rivalspeedStat[0] + rivalspeedStat[0] * 0.1);
				rivalspDefenseStat[0] = (int) (rivalspDefenseStat[0] - rivalspDefenseStat[0] * 0.1);
			}
			if (rivalpokemonNatureID == 24) {
				//Serious
			}
			
			if(pokemonElementID2 != 0) {
				JOptionPane.showMessageDialog(null, rivalpokemonName[0] + "\nHP: " + rivalhpStat[0] + "\nAttack: " + rivalattackStat[0] + "\nDefense: " + rivaldefenseStat[0] + "\nSp. Attack: " + rivalspAttackStat[0] + "\nSp. Defense: " + rivalspDefenseStat[0] + "\nSpeed: " + rivalspeedStat[0] + "\n\nNature: " + pokemonNature[rivalpokemonNatureID] + "\nElements: " + pokemonElements[rivalpokemonElementID1] + ", " + pokemonElements[rivalpokemonElementID2] + "\n\nTotal IVs: " + rivaltotalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + rivalpokemonName[0] + ".png")));
			}else {
				JOptionPane.showMessageDialog(null, rivalpokemonName[0] + "\nHP: " + rivalhpStat[0] + "\nAttack: " + rivalattackStat[0] + "\nDefense: " + rivaldefenseStat[0] + "\nSp. Attack: " + rivalspAttackStat[0] + "\nSp. Defense: " + rivalspDefenseStat[0] + "\nSpeed: " + rivalspeedStat[0] + "\n\nNature: " + pokemonNature[rivalpokemonNatureID] + "\nElement: " + pokemonElements[rivalpokemonElementID1] + "\n\nTotal IVs: " + rivaltotalIV, "Pokemon: Java", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + rivalpokemonName[0] + ".png")));	
			}
			
			
						break;
					}
					JOptionPane.showMessageDialog(null,
							"Heh, nothing perssonel' kid",
							"Pokemon: Java",
							0,
							new ImageIcon(main.class.getResource("/img/garyOak.png"))
							);
					JOptionPane.showMessageDialog(null, "Fight, start");
					int hp = hpStat[0];
					int rivalhp = rivalhpStat[0];
					do {
						fightselection = JOptionPane.showOptionDialog(null, "Your pokemon's HP: " + hp + "\n" + nameRival + "'s pokemon's HP: " + rivalhp, "Main Menu", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + rivalpokemonName[0] + ".png")), FightOptions, FightOptions[0]);
						switch(fightselection) {
						case 0:
							if (pokemonName[0].equalsIgnoreCase("Bulbasaur")) {
								int yourMoveKiddo = JOptionPane.showOptionDialog(null, "Your pokemon's HP: " + hp + "\n" + nameRival + "'s pokemon's HP: " + rivalhp, "Main Menu", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + rivalpokemonName[0] + ".png")), BulbasaurMoves, BulbasaurMoves[0]);
							} else {
								if(pokemonName[0].equalsIgnoreCase("Charmander")) {
									int yourMoveKiddo = JOptionPane.showOptionDialog(null, "Your pokemon's HP: " + hp + "\n" + nameRival + "'s pokemon's HP: " + rivalhp, "Main Menu", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + rivalpokemonName[0] + ".png")), CharmanderMoves, CharmanderMoves[0]);
								} else {
									if(pokemonName[0].equalsIgnoreCase("Squirtle")) {
										int yourMoveKiddo = JOptionPane.showOptionDialog(null, "Your pokemon's HP: " + hp + "\n" + nameRival + "'s pokemon's HP: " + rivalhp, "Main Menu", 0, JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/pokemon/" + rivalpokemonName[0] + ".png")), SquirtleMoves, SquirtleMoves[0]);
									}
								}
							}
							
						break;
						case 1:
							JOptionPane.showMessageDialog(null,
									"You throw a banana at " + nameRival + "... It wasn't very efective",
									"Pokemon: Java",
									0,
									new ImageIcon(main.class.getResource("/img/" + rivalpokemonName[0] + ".png"))
									);
						break;
						
						case 2:
							JOptionPane.showMessageDialog(null,
									"Heh, so you couldn't handle the Newtron Style",
									"Pokemon: Java",
									0,
									new ImageIcon(main.class.getResource("/img/garyOak.png"))
									);
						break;
						}
					}while(hp != 0 || rivalhp != 0 || fightselection != 2);
					//batalla pokemon
					
					
					
				break;
						
				case 1:
					//pendiente a terminar
				break;
				case 2:
					//pendiente a terminar
				break;
				case 3:
					JOptionPane.showMessageDialog(null, null, "Goodbye!", JOptionPane.DEFAULT_OPTION, new ImageIcon(main.class.getResource("/img/goodbye.gif")));
				break;
			}
		} 
		while(mainMenuSelection != 3);
	}
}
