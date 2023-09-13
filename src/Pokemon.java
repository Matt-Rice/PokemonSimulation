/**
 * 
 */

/**
 * @author Matt Rice
 * @version 1-6-2023
 * Pokemon.java
 * Will create a pokemon with stats, type(s) and moves
 */
public class Pokemon {
	public String pokeName;
	public int healthPoints;
	public int attack;
	public int defense;
	public int specialAttack;
	public int specialDefense;
	public int speed;
	public Type type;
	public Move damageMove;
	
	public Pokemon(String name, int hp, int atk, int def, int spAtk, int spDef, int spd, String typ, Move move){ //type, moveset
		healthPoints = hp;
		attack = atk;
		defense = def;
		specialAttack = spAtk;
		specialDefense = spDef;
		speed = spd;
		type = new Type(typ);
		damageMove = move;
	}//end Pokemon
	
	public int getDefense() {
		return defense;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public Type getPokemonType() {
		return type;
	}
	
	 
	
	
	public static void useMove(Pokemon attacker, Move move, Pokemon defender) {
		Type moveType = move.getType(); // Type of the move
		Type defenderType = defender.getPokemonType(); // Type of the defender
		Type attackerType = attacker.getPokemonType();// Type of the attacker
		
		double typing = moveType.compareTypeMatchup(defenderType); // The type comparison of the move and the defenders type
		
		double stab = attackerType.typeEquals(moveType); // The comparison to show if STAB applies
		
		// Damage calculation formula: might add critical hits, items, high-rolls/low-rolls, etc.
		double damage = (((((2*50)/5)+2)*move.getPower()*(attacker.getAttack()/defender.getDefense()))/50) * typing * stab;
		
		// Printing out results
		System.out.println("STAB value: " + stab); 
		
		System.out.println("Type advantage: " + typing);
		
		System.out.println("Damage done: " + damage);
		
	}
	
	
	public static void main (String[]args) {
		Move rockSlide = new Move(70, 100, "Fire");
		
		Pokemon charizard = new Pokemon("Charizard", 100, 135, 60, 45, 34, 5,"Fire", rockSlide);
		
		Pokemon venasaur = new Pokemon("Venasaur", 100, 135, 60, 45, 34, 5,"Grass", rockSlide);
		
		useMove(charizard, rockSlide, venasaur);
		
		System.out.println(charizard.getAttack() + "\n" + venasaur.getDefense() + "\n" + rockSlide.getPower());
		
	}
	
	
}
