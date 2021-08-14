package main;

//import the scanner class
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		//choice variable
		int menuSelection = 0;
		
		//setting up scanner
		Scanner uChoice = new Scanner(System.in);
		
		//show menu first time and get first choice
		showMenu();
		menuSelection = getUserChoice(uChoice);
		
		//first while loop. keeps going until choice = 5
		while(menuSelection !=5) {
			
			//while loop to make sure choice is in right range 
			/*
			 * while(menuSelection < 1 || menuSelection > 5) {
			 * //System.out.println("inside nested loop6"); if (menuSelection < 1 ||
			 * menuSelection > 5) { System.out.println("number is not in range");
			 * menuSelection = getUserChoice(uChoice); } else break; }
			 */
			
			switch (menuSelection) {
			case 1:
				System.out.println("You chose temperature conversion");
				break;
			case 2:
				System.out.println("You chose distance conversion");
				break;
			case 3:
				System.out.println("You chose money conversion");
				break;
			case 4:
				System.out.println("You chose Volume conversion");
				break;
			case 5:
				break;
			default:
				System.out.println("number is not in range");
			}
			
			System.out.println("Outside of nested loop");
			showMenu();	
			menuSelection = getUserChoice(uChoice);
//			if (menuSelection == 5)
//				break;
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
	public static double farenheitToCelcius(double temp){
		temp = ((temp - 32)*(5/9));
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
