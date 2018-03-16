import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
		double csquared = Math.multiplyExact(legA, legA) + Math.multiplyExact(legB, legB);
		return csquared;
		  
        
    }
}