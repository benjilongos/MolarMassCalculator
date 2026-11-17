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
		String[] elements = { "Ca", "O", "Mo", "Mg", "Si", "Al", "S", "Cr", "Ar", "Fe", "C", "H", "Ni", "N", "F", "Be", "B", "Li", "Na", "K", "Zn", "Cu", "Ne", "He", "P", "Sc", "Ti", "V", "Mn", "Co", "Ga", "Cl", "Br"};
		double[] masses = { 40.08, 16.00, 95.96, 24.31, 28.09, 26.98, 32.07, 52.00, 39.95, 55.85, 12.01, 1.01, 58.69, 14.01, 19.00, 9.01, 10.81, 6.94, 22.99, 39.10, 65.38, 63.55, 20.18, 4.00, 30.97, 44.96, 47.87, 50.94, 54.94, 58.93, 69.72, 35.45, 79.90};
//Friendly greeting
		System.out.println("Welcome to the Molar Mass Calculator/Lookup Tool! And don't worry, I don't bite!:)");
//Call the method to display the table
		printTable(elements, masses);
//Loop to let the user search multiple times
		boolean keepGoing = true;
		boolean found = true;
		while (keepGoing) {
			System.out.println("Enter an element symbol(or type 'exit' to quit): ");
			String choice = in.nextLine();
			if (choice.equalsIgnoreCase("exit")) {
				keepGoing = false;
			} else {
				found = false;
			}
// Search through the array using a for loop
			for (int i = 0; i < elements.length; i++) {
				if (elements[i].equalsIgnoreCase(choice)) {
					found = true;
// if-statement to check if the the mass is valid
				if (masses[i] >= 0) {
					System.out.println("The molar mass of " +elements[i]+ " is: " +masses[i]+ " g/mol");
					} else {
						System.out.println("Error. Molar mass cannot be negative!");
					}
							
				}
				}
			if (!found) {
				System.out.println("Invalid element! Make sure it matches the table!");
			}
			}
		// Bid farewell to the user
		System.out.println("\nThis isn't a tragic goodbye....we shall meet again in the distant future. FAREWELL!");
		in.close();
	}}
