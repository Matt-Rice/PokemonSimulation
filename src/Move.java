/**
 * 
 */

/**
 * @author mjric
 *
 */
public class Move {
	public int power;
	public int moveAccuracy;
	Type moveType;
	
	public Move(int basePower, int accuracy, String typeName) {
		power = basePower;
		moveAccuracy = accuracy;
		moveType = new Type(typeName);
	}
	
	public int getPower() {
		return power;
	}
	
	public int getAccuracy() {
		return moveAccuracy;
	}
	
	public Type getType() {
		return moveType;
	}
}
