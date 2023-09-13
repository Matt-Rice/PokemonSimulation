/**
 * 
 */

/**
 * @author mjric
 *
 */
 public class Type {
	 private String name;
	 
	/**
	 * Type constructor
	 * @param name the name of the type
	 */
	public Type(String name) {
		 this.name = name;
		 
	 }
	
	/**
	 * Gets name
	 * @return name
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * Checks to see if offense type is super effective
	 * @param defender the type of the defender
	 * @return true if the type is supereffective and false if it is not
	 */
	public boolean isSuperEffective(Type defender) {	
		
		if (name == "Fire") {
			if (defender.name == "Grass")
				return true;
			
			else if (defender.name == "Bug")
				return true;
			
			else if (defender.name == "Steel")
				return true;
			
			else if (defender.name == "Ice")
					return true;
			else 
				return false;
		}//end fire
		
		else if (name == "Water") {
			if (defender.name == "Ground")
				return true;
			
			else if (defender.name == "Rock")
				return true;
			
			else if (defender.name == "Fire")
				return true;
			
			else 
				return false;
		}//end Water
		
		else if (name == "Grass") {
			if (defender.name == "Ground")
				return true;
			
			else if (defender.name == "Rock")
				return true;
			
			else if (defender.name == "Water")
				return true;
			
			else 
				return false;
		}//end Grass
		else if (name == "Electric") {
			if (defender.name == "Water")
				return true;
			
			else if (defender.name == "Flying")
				return true;
			
			else 
				return false;
		}//end Electric
		
		else if (name == "Ice") {
			if (defender.name == "Ground")
				return true;
			
			else if (defender.name == "Grass")
				return true;
			
			else if (defender.name == "Flying")
				return true;
			
			else if (defender.name == "Dragon")
				return true;
			
			else 
				return false;
		}//end Ice
		
		else if (name == "Fighting") {
			if (defender.name == "Normal")
				return true;
			
			else if (defender.name == "Ice")
				return true;
			
			else if (defender.name == "Rock")
				return true;
			
			else if (defender.name == "Dark")
				return true;
			
			else if (defender.name == "Steel")
				return true;
			
			else 
				return false;
		}//end Fighting
		
		else if (name == "Poison") {
			if (defender.name == "Grass")
				return true;
			
			else if (defender.name == "Fairy")
				return true;
			 
			else 
				return false;
		}//end Poison
		
		else if (name == "Ground") {
			if (defender.name == "Fire")
				return true;
			
			else if (defender.name == "Electric")
				return true;
			
			else if (defender.name == "Poison")
				return true;
			
			else if (defender.name == "Rock")
				return true;
			
			else if (defender.name == "Steel")
				return true;
			
			else 
				return false;
		}//end Ground
		
		else if (name == "Flying") {
			if (defender.name == "Grass")
				return true;
			
			else if (defender.name == "Figthing")
				return true;
			
			else if (defender.name == "Bug")
				return true;
			 
			else 
				return false;
		}//end Flying
		
		else if (name == "Psychic") {
			if (defender.name == "Fighting")
				return true;
			
			else if (defender.name == "Poison")
				return true;
			
			else 
				return false;
		}//end Psychic
		
		else if (name == "Bug") {
			if (defender.name == "Grass")
				return true;
			
			else if (defender.name == "Psychic")
				return true;
			
			else if (defender.name == "Dark")
				return true;
			 
			else 
				return false;
		}//end Bug
		
		else if (name == "Rock") {
			if (defender.name == "Fire")
				return true;
			
			else if (defender.name == "Ice")
				return true;
			
			else if (defender.name == "Poison")
				return true;
			
			else if (defender.name == "Rock")
				return true;
			
			else if (defender.name == "Steel")
				return true;
			
			else 
				return false;
		}//end Rock
		
		else if (name == "Ghost") {
			if (defender.name == "Psychic")
				return true;
			
			else if (defender.name == "Ghost")
				return true;
			 
			else 
				return false;
		}//end Ghost
		
		else if (name == "Dragon") {
			if (defender.name == "Dragon")
				return true;
		
			else 
				return false;
		}//end Dragon
		
		else if (name == "Dark") {
			if (defender.name == "Pyschic")
				return true;
			
			else if (defender.name == "Ghost")
				return true;
			 
			else 
				return false;
		}//end Dark
		
		else if (name == "Steel") {
			if (defender.name == "Ice")
				return true;
			
			else if (defender.name == "Rock")
				return true;
			
			else if (defender.name == "Fairy")
				return true;
		
			else 
				return false;
		}//end Steel
		
		else if (name == "Fairy") {
			if (defender.name == "Fighting")
				return true;
			
			else if (defender.name == "Dragon")
				return true;
			
			else if (defender.name == "Dark")
				return true;
			 
			else 
				return false;
		}//end Fairy
		
		else
			return false;
	}//end isSuperEffective
	
	
	
	
	
	
	/**
	 * Checks to see if type is not very effective
	 * @param defender The type of the defender
	 * @return true if the type is not very effective and false if it is not
	 */
	public boolean isNotVeryEffective(Type defender) {
		
		if (name == "Fire") {
			if (defender.name == "Fire")
				return true;
			
			else if (defender.name == "Water")
				return true;
			
			else if (defender.name == "Rock")
				return true;
			
			else if (defender.name == "Dragon")
					return true;
			else 
				return false;
		}//end fire
		
		else if (name == "Normal") {
			if (defender.name == "Rock")
				return true;
			
			else if (defender.name == "Steel")
				return true;
			
			else 
				return false;
		}//end Normal
		
		else if (name == "Water") {
			if (defender.name == "Water")
				return true;
			
			else if (defender.name == "Grass")
				return true;
			
			else if (defender.name == "Dragon")
				return true;
			
			else 
				return false;
		}//end Water
		
		else if (name == "Grass") {
			if (defender.name == "Fire")
				return true;
			
			else if (defender.name == "Grass")
				return true;
			
			else if (defender.name == "Poison")
				return true;
			
			else if (defender.name == "Flying")
				return true;
			
			else if (defender.name == "Bug")
				return true;
			
			else if (defender.name == "Dragon")
				return true;
			
			else if (defender.name == "Steel")
				return true;
			
			else 
				return false;
		}//end Grass
		else if (name == "Electric") {
			if (defender.name == "Grass")
				return true;
			
			else if (defender.name == "Electric")
				return true;
			
			else if (defender.name == "Dragon")
				return true;
			else 
				return false;
		}//end Dragon
		
		else if (name == "Ice") {
			if (defender.name == "Fire")
				return true;
			
			else if (defender.name == "Water")
				return true;
			
			else if (defender.name == "Ice")
				return true;
			
			else if (defender.name == "Steel")
				return true;
			
			else 
				return false;
		}//end Ice
		
		else if (name == "Fighting") {
			if (defender.name == "Poison")
				return true;
			
			else if (defender.name == "Flying")
				return true;
			
			else if (defender.name == "Psychic")
				return true;
			
			else if (defender.name == "Bug")
				return true;
			
			else if (defender.name == "Fairy")
				return true;
			
			else 
				return false;
		}//end Fighting
		
		else if (name == "Poison") {
			if (defender.name == "Poison")
				return true;
			
			else if (defender.name == "Ground")
				return true;
			
			else if (defender.name == "Rock")
				return true;
			
			else if (defender.name == "Ghost")
				return true;
			 
			else 
				return false;
		}//end Poison
		
		else if (name == "Ground") {
			if (defender.name == "Grass")
				return true;
			
			else if (defender.name == "Bug")
				return true;
			
			else 
				return false;
		}//end Ground
		
		else if (name == "Flying") {
			if (defender.name == "Electric")
				return true;
			
			else if (defender.name == "Figthing")
				return true;
			
			else if (defender.name == "Bug")
				return true;
			 
			else 
				return false;
		}//end Flying
		
		else if (name == "Psychic") {
			if (defender.name == "Fighting")
				return true;
			
			else if (defender.name == "Poison")
				return true;
			
			else 
				return false;
		}//end Psychic
		
		else if (name == "Bug") {
			if (defender.name == "Grass")
				return true;
			
			else if (defender.name == "Psychic")
				return true;
			
			else if (defender.name == "Dark")
				return true;
			 
			else 
				return false;
		}//end Bug
		
		else if (name == "Rock") {
			if (defender.name == "Fire")
				return true;
			
			else if (defender.name == "Ice")
				return true;
			
			else if (defender.name == "Poison")
				return true;
			
			else if (defender.name == "Rock")
				return true;
			
			else if (defender.name == "Steel")
				return true;
			
			else 
				return false;
		}//end Rock
		
		else if (name == "Ghost") {
			if (defender.name == "Psychic")
				return true;
			
			else if (defender.name == "Ghost")
				return true;
			 
			else 
				return false;
		}//end Ghost
		
		else if (name == "Dragon") {
			if (defender.name == "Steel")
				return true;
		
			else
				return false;
		}//end Dragon
		
		else if (name == "Dark") {
			if (defender.name == "Dark")
				return true;
			
			else if (defender.name == "Ice")
				return true;
			
			else if (defender.name == "Fairy")
				return true;
			 
			else 
				return false;
		}//end Dark
		
		else if (name == "Steel") {
			if (defender.name == "Fire")
				return true;
			
			else if (defender.name == "Water")
				return true;
			
			else if (defender.name == "Electric")
				return true;
			
			else if (defender.name == "Steel")
				return true;
		
			else 
				return false;
		}//end Steel
		
		else if (name == "Fairy") {
			if (defender.name == "Fire")
				return true;
			
			else if (defender.name == "Poison")
				return true;
			
			else if (defender.name == "Steel")
				return true;
			 
			else 
				return false;
		}//end Fairy
		
		else
			return false;
	}//end isNotVeryEffective
	
	public boolean doesNotEffect(Type defender) {
		
		if (name == "Normal") {
			if (defender.name == "Ghost")
				return true;
			 
			else 
				return false;
		}//end Normal
		
		else if (name == "Electric") {
			if (defender.name == "Ground")
				return true;
			 
			else 
				return false;
		}//end Electric
		
		else if (name == "Fighting") {
			if (defender.name == "Ghost")
				return true;
			 
			else 
				return false;
		}//end Ghost
		
		else if (name == "Ground") {
			if (defender.name == "Flying")
				return true;
			 
			else 
				return false;
		}//end Ground
		
		else if (name == "Psychic") {
			if (defender.name == "Dark")
				return true;
			 
			else 
				return false;
		}//end Psychic
		
		else if (name == "Ghost") {
			if (defender.name == "Normal")
				return true;
			 
			else 
				return false;
		}//end Ghost
		
		else if (name == "Dragon") {
			if (defender.name == "Fairy")
				return true;
			 
			else 
				return false;
		}//end Dragon
		
		else 
			return false;
	}//end doesNotEffect
	
	/**
	 * Will compare the attacking type and the defending type
	 * @param defender the type of the defender
	 * @return 2 if it is super effective, 1 if it is regularly effective, 
	 * 0 if it does not effect the defender, and 0.5 if it is not very effective
	 */
	public double compareTypeMatchup(Type defender) {
		if (isSuperEffective(defender))
			return 2;
		
		else if (isNotVeryEffective(defender))
			return 0.5;
		
		else if (doesNotEffect(defender))
			return 0;
		
		else
			return 1;
	}//end compareTypeMatchup
	
	/**
	 * Compares the names of two different types
	 * @param defender the second type to be compared
	 * @return 1.5 if the types are equal and 1 if they are not
	 */
	public double typeEquals(Type defender) {
		if(name == defender.getName())
			return 1.5;
		else
			return 1;
	}
	
 }//end Type
