package main;

//import the scanner class
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		//choice variable
		int menuSelection = 0;
		
		//setting up scanner
		Scanner uChoice = new Scanner(System.in);
		
		
		showMenu();
		menuSelection = getUserChoice(uChoice);
		
		while(menuSelection !=5) {
			
			while(menuSelection < 1 || menuSelection > 5) {
				System.out.println("Inside of first loop");
				if (menuSelection < 1 || menuSelection > 5) {
					System.out.println("number is not in range");
					menuSelection = getUserChoice(uChoice);
				}
				else
					break;
			}
			
			showMenu();	
			menuSelection = getUserChoice(uChoice);
			if (menuSelection == 5)
				break;
		}
		
		
		System.out.println("End of program");
		uChoice.close();
	}
	
	public static Scanner uChoice = new Scanner(System.in);
	
	public static void showMenu() {
		//display the menu
		System.out.println("Please select an option:");
		System.out.println("1. Temperature");
		System.out.println("2. Distance");
		System.out.println("3. Money");
		System.out.println("4. Volume");
		System.out.println("5. quit");
	}
	
	//get the users choice
	public static int getUserChoice(Scanner uChoice) {
		int menuSelection = uChoice.nextInt();
		System.out.println(menuSelection);
		//uChoice.close();
		return menuSelection;
	}
	//Convert temperature
	public static double farhenheitToCelcius(double temp){
		return temp;
	}
	//Convert Distance
	public static double milesToKilometers(double distance) {
		return distance;
	}
	//Convert Money
	public static double dollersToPounds(double dollers) {
		return dollers;
	}
	//Convert Weight
	
	//Convert Speed
	
	
	
}
