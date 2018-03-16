import java.lang.Math;
public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean Hypo = new Pythagorean();
		Double slope = Hypo.calculateHypotenuse(2,2);
		Double slope2 = Math.sqrt(slope);
		System.out.println("slope: "+slope2);
		

    }
}