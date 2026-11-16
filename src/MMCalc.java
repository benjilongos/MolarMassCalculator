import java.util.Scanner;

public class MMCalc {
	// Method to display the reference table using parallel arrays
	public static void printTable(String[] el, double[] ma) {
		System.out.println("\n--------------------------------");
		System.out.println("Element\t\tMolar Mass (g/mol)");
		System.out.println("--------------------------------");
		for (int i = 0; i < el.length; i++) {
			System.out.println(el[i] + "\t\t" + ma[i]);
		}
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//Parallel arrays containing my custom periodic table data (molar mass values taken from the periodic table my chemistry teacher gave me)
		String[] elements = { "Ca", "O", "Mo", "Mg", "Si", "Al", "S", "Cr", "Ar", "Fe", "C", "H", "Ni" };
		double[] masses = { 40.08, 16.00, 95.96, 24.31, 28.09, 26.98, 32.07, 52.00, 39.95, 55.85, 12.01, 1.01, 58.69 };
//Friendly greeting
		System.out.println("Welcome to the Molar Mass Calculator! And don't worry, I don't bite!:)");
//Call the method to display the table
		printTable(elements, masses);
//Loop to let the user search multiple times
		boolean keepGoing = true;
		while (keepGoing) {
System.out.println("Enter an element symbol(or type 'exit' to quit): ");
String choice = in.nextLine();
		}
	}

}
