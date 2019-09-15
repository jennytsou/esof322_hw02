\\John Singleton and Yuehchen Tsou
package hw02;

import java.util.Scanner;

public class ClientDemo {
		

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String dbChoice = "";
		
		while (!dbChoice.equals("Q")) {
			System.out.println();
			System.out.print("(R)elational db tool uses table store, (N)oSQL uses document store, (G)raph uses node store, or (Q)uit > ");
			dbChoice = input.next().toUpperCase();
			if ( dbChoice == "R" || dbChoice =="N" || dbChoice =="G") {
				Store store = new Store();
				store.setStoreStrategy(dbChoice);
			}
		}
	}

}
