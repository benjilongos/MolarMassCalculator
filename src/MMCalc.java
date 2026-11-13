import java.util.Scanner;
import java.util.HashMap;
public class MMCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
// Use a HashMap to sort out the elements on the given table in the google doc with their corresponding molar masses (according to my given periodic table from my chem class, NOT the molar masses shown in the google doc)
HashMap<String, Double> molarMass = new HashMap<>();
molarMass.put("H", 1.01);
molarMass.put("Si", 28.09);
molarMass.put("Al", 26.98);
molarMass.put("Ca", 40.08);
molarMass.put("O", 16.00);
molarMass.put("Mo", 95.96);
molarMass.put("Fe", 55.85);
molarMass.put("Cr", 52.00);
molarMass.put("Mg", 24.31);
molarMass.put("S", 32.07);
molarMass.put("Ni", 58.69);
molarMass.put("C", 12.01);
molarMass.put("Ar", 39.95);
// Greet the user to show you're kind and don't bite
System.out.println("Hello user! Please enter your desired elements with their molar masses! And do not fear for I do not bite!");
	}

}
