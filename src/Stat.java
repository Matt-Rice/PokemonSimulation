/**
 * 
 */

/**
 * @author mjric
 *
 */
public class Stat {
	double value;
	
	public Stat(int data) {
		value=data;
	}
	
	public void setStat(int data) {
		value=data;
	}
	
	public double getStat() {
		return value;
	}
	
	public void raiseStat() {
		value=value*1.5;
	}
	public void sharplyRaiseStat() {
		value=value*2;
	}
	public void lowerStat() {
		value=value*0.666;
	}
}
