/**
 * 
 */

/**
 * @author Matt Rice
 * @version 1-6-2023
 * Stats.java
 * Creates a costructor that has every pokemon stat.
 */
public class Stats {
	
	protected Stat HP;
	protected Stat attack;
	protected Stat defense;
	protected Stat spAttack;
	protected Stat spDefense;
	protected Stat speed;
	protected Stat statTotal;
	
	/**
	 * Constuctor that allows the stats of a pokemon to be entered and calculates the stat total of the pokemon
	 * @param hp the health points to be set
	 * @param atk the attack to be set
	 * @param def the defense to be set
	 * @param spAtk the special attack to be set
	 * @param spDef the special defense to be set
	 * @param spd the speed to be set
	 */
	public Stats(int hp, int atk, int def, int spAtk, int spDef, int spd) {
		HP = new Stat(hp);
		attack = new Stat(atk);
		defense = new Stat(def);
		spAttack = new Stat(spAtk);
		spDefense = new Stat(spDef);
		speed = new Stat(spd);
		statTotal = new Stat(hp+atk+def+spAtk+spDef+spd);
	}//end stats
	/**
	 * sets the hp
	 * @param hp the hp to be set
	 */
	public void setHP(int hp) {
		HP.setStat(hp);;
	}//end setHP
	/**
	 * sets the atk
	 * @param atk the atk to be set
	 */
	public void setAtk(int atk) {
		attack.setStat(atk);
	}//end setAtk
	/**
	 * sets the def
	 * @param def the def to be set
	 */
	public void setDef(int def) {
		defense.setStat(def);
	}//end setDef
	/**
	 * sets the special atk
	 * @param spAtk the special atk to be set
	 */
	public void setSpAtk(int spAtk) {
		spAttack.setStat(spAtk);
	}//end setSpAtk
	/**
	 * sets the special def
	 * @param spDef the special def to be set
	 */
	public void setSpDef(int spDef) {
		spDefense.setStat(spDef);
	}//end setSpDef
	/**
	 * sets the speed
	 * @param spd the speed to be set
	 */
	public void setSpd(int spd) {
		speed.setStat(spd);
	}//end setSpd
	/**
	 * returns HP
	 * @return HP
	 */
	public double getHP() {
		return HP.getStat();
	}// end getHP
	/**
	 * returns attack
	 * @return attack
	 */
	public double getAtk() {
		return attack.getStat();
	}// end getAtk
	/**
	 * returns attack
	 * @return attack
	 */
	public double getDef() {
		return defense.getStat();
	}// end getDef
	/**
	 * returns special attack
	 * @return spAttack
	 */
	public double getSpAtk() {
		return spAttack.getStat();
	}// end getSpAtk
	/**
	 * returns special defense
	 * @return special defense
	 */
	public double getSpDef() {
		return spDefense.getStat();
	}//end getSpDef
	/**
	 * return speed
	 * @return speed
	 */
	public double getSpd() {
		return speed.getStat();
	}//get speed
	
	public void raiseAtk() {
		attack.raiseStat();
	}
	
	public void raiseDef() {
		defense.raiseStat();
	}
	
	public void raiseSpAtk() {
		spAttack.raiseStat();
	}
	
	public void raiseSpDef() {
		spDefense.raiseStat();
	}
	
	public void raiseSpd() {
		speed.raiseStat();
	}
	
	public void lowerAtk() {
		attack.lowerStat();
	}
	
	public void lowerDef() {
		defense.lowerStat();
	}
	
	public void lowerSpAtk() {
		spAttack.lowerStat();
	}
	
	public void lowerSpDef() {
		spDefense.lowerStat();
	}
	
	public void lowerSpd() {
		speed.lowerStat();
	}
	
}
