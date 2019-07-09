package progAssign;

import java.util.Scanner;

public class Driver {
	
	public static void printMenu() {
		
		System.out.println("Please enter in a command (Deposit, Withdraw, Balance, Exit):");
	}
	
	public static void main (String[]  args) {
		
		String s;

		Scanner scnr = new Scanner (System.in);
		
		TestProg persAcct = new TestProg();
		
		printMenu();
		
		s= scnr.next();
		
		s= s.toLowerCase();
		
		while (s!=null) {
		
			switch (s) {
			
				case "deposit":

					String inputD = "";
					System.out.println("Please enter an amount to deposit:");
					
					inputD = scnr.next();
					

					if (persAcct.setDeposit(inputD) == true) {

						printMenu();
						s= scnr.next();
						s= s.toLowerCase();
					}
					
					else if (persAcct.setDeposit(inputD) == false) {
						
							if (inputD.equalsIgnoreCase("exit")) {
								s="exit";
							}
					
					}
					
					break;
				
				case "withdraw":
				
					String inputW = "";
					System.out.println("Please enter an amount to withdraw:");
					
					inputW = scnr.next();
					
					
					if (persAcct.setWithdraw(inputW) == true) {

						printMenu();
						s= scnr.next();
						s= s.toLowerCase();
					}
					
					else if (persAcct.setDeposit(inputW) == false) {
						
						if (inputW.equalsIgnoreCase("exit")) {
							s="exit";
						}
				
				}
					
					break;
				
				case "balance":
				
					System.out.printf("The current balance is: $%1.2f\n", persAcct.getBalance());
					printMenu();
					s= scnr.next();
					s= s.toLowerCase();
					break;
				
				case "exit":
				
					return;
					
				default:
					printMenu();
					s= scnr.next();
					s= s.toLowerCase();
					break;

			}
		}
		
		scnr.close();
		
	}
	
}
