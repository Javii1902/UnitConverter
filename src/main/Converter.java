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
		while(menuSelection != 6) {
			
			
			switch (menuSelection) {
			//case 1 temperature
			case 1:
				System.out.println("You chose temperature conversion");
				System.out.println("Please enter temperature in Farenheit");
				System.out.println(farenheitToCelcius(uChoice.nextDouble()) + " degrees celcius");
				break;
				
			//case 2 distance
			case 2:
				System.out.println("You chose distance conversion");
				System.out.println("Please enter distance in miles");
				System.out.println(milesToKilometers(uChoice.nextDouble()) + " kilometers");
				break;
			//case 3 money
			case 3:
				System.out.println("You chose money conversion");
				System.out.println("Please enter dollar amount");
				System.out.println(dollarsToPounds(uChoice.nextDouble()) + " pounds");
				break;
			//case 4 volume
			case 4:
				System.out.println("You chose Volume conversion");
				System.out.println("Please enter milliliter amount");
				System.out.println(mlToOz(uChoice.nextDouble()) + " ounces");
				break;
			//case 5 exit loop
			case 5:
				System.out.println("You chose weight conversion");
				System.out.println("Please enter mass");
				System.out.println(kilogramsToPounds(uChoice.nextDouble()) + " pounds");
				break;
			case 6:
				break;
			//defaults if number is out of range
			default:
				System.out.println("number is not in range");
			}
			//System.out.println("Outside of nested loop");
			showMenu();	
			menuSelection = getUserChoice(uChoice);
		}
		System.out.println("Thank you for using this unit converter!");
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
		System.out.println("5. Weight");
		System.out.println("6. quit");
	}

	
	//get the users choice
	public static int getUserChoice(Scanner uChoice) {
		int menuSelection = uChoice.nextInt();
		System.out.println(menuSelection);
		//uChoice.close();
		return menuSelection;
	}
	//Convert temperature
	public static double farenheitToCelcius(double farenheit){
		farenheit = (((farenheit - 32)*5)/9);
		return farenheit;
	}
	//Convert Distance
	public static double milesToKilometers(double distance) {
		distance = distance * 1.609344;
		return distance;
	}
	//Convert Money
	public static double dollarsToPounds(double dollars) {
		dollars = dollars * .72;
		return dollars;
	}
	//Convert Weight
	public static double kilogramsToPounds(double kilograms) {
		kilograms = kilograms * 2.205;
		return kilograms;
	}
	//Convert volume
	public static double mlToOz(double ml) {
		ml = ml / 29.574;
		return ml;
	}
	
}
