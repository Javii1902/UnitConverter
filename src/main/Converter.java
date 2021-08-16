package main;

//import the scanner class
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		//choice variable
		int menuSelection = 0;
		
		//setting up scanner
		Scanner uChoice = new Scanner(System.in);
        do {
            //show menu first time and get first choice
		    showMenu();
		    menuSelection = getUserChoice(uChoice);
            switch (menuSelection) {
			//case 1 temperature
			case 1:
				tempMenu();
				int tempSelection = uChoice.nextInt();	
				switch (tempSelection) {
				case 1:
					System.out.println("Enter temperature in fahrenheit");
					System.out.println(fahrenheitToCelsius(uChoice.nextDouble()) + " degrees celsius");
					break;
				case 2:
					System.out.println("Enter temperature in celsius");
					System.out.println(celsiusToFahrenheit(uChoice.nextDouble()) + " degrees fahrenheit");
					break;
				default:
					System.out.println("number not in range");
				}			
				break;
				
			//case 2 distance
			case 2:
				distanceMenu();
				int distanceSelection = uChoice.nextInt();
				switch (distanceSelection) {
				case 1:
					System.out.println("Enter distance in miles");
					System.out.println(milesToKilometers(uChoice.nextDouble()) + " kilometers");
					break;
				case 2:
					System.out.println("Enter distance in Kilometers");
					System.out.println(kilometersToMiles(uChoice.nextDouble()) + " miles");
					break;
				default:
					System.out.println("number not in range");
				}
				break;
			//case 3 money
			case 3:
				moneyMenu();
				int moneySelection = uChoice.nextInt();
				switch (moneySelection) {
				case 1:
					System.out.println("Enter dollar amount");
					System.out.println(dollarsToPounds(uChoice.nextDouble()) + " pounds");
					break;
				case 2:
					System.out.println("Enter pounds amount");
					System.out.println(poundsToDollars(uChoice.nextDouble()) + " dollars");
					break;
				default:
					System.out.println("number not in range");
				}
				break;
			//case 4 volume
			case 4:
				volumeMenu();
				int volumeSelection = uChoice.nextInt();
				switch (volumeSelection) {
				case 1:
					System.out.println("Enter amount in milliliters");
					System.out.println(mlToOz(uChoice.nextDouble()) + " ounces");
					break;
				case 2:
					System.out.println("Enter amount in ounces");
					System.out.println(ozToMl(uChoice.nextDouble()) + " milliliters");
					break;
				default:
					System.out.println("number not in range");
				}
				
				break;
			//case 5 weight
			case 5:
				weightMenu();
				int weightSelection = uChoice.nextInt();
				switch (weightSelection) {
				case 1:
					System.out.println("Enter weight in kilograms");
					System.out.println(kilogramsToPounds(uChoice.nextDouble()) + " pounds");
					break;
				case 2:
					System.out.println("Enter weight in pounds");
					System.out.println(poundsToKilograms(uChoice.nextDouble()) + " kilograms");
					break;
				default:
					System.out.println("number not in range");
				}
				break;
			//case 6 quits
			case 6:
				break;
			//defaults if number is out of range
			default:
				System.out.println("number is not in range");
			}

        }while(menuSelection != 6);

        System.out.println("Thank you for using this unit converter!");
        uChoice.close();
	}
	
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
	
	//Temperature conversion
	public static void tempMenu() {
		System.out.println("You chose temperature conversion");
		System.out.println("Select which conversion you would like");
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Celsius to Fahrenheit");
	}
	//convert celsius to fahrenheit
	public static double celsiusToFahrenheit(double celsius) {
		celsius = ((celsius * 9)/5)+32;
		return celsius;
	}
	//convert fahrenheit to celsius
	public static double fahrenheitToCelsius(double fahrenheit){
		fahrenheit = ((fahrenheit - 32)*5)/9;
		return fahrenheit;
	}
	//Convert Distance
	//distance menu
	public static void distanceMenu() {
		System.out.println("You chose distance conversion");
		System.out.println("Select which conversion you would like");
		System.out.println("1. Miles to Kilometers");
		System.out.println("2. Kilometers to Miles");
	}
	//convert miles to kilometers 
	public static double milesToKilometers(double miles) {
		miles = miles * 1.609344;
		return miles;
	}
	//convert kilometers to miles
	public static double kilometersToMiles(double kilometers) {
		kilometers = kilometers / 1.609;
		return kilometers;
	}
	//Convert Money
	//money menu
	public static void moneyMenu() {
		System.out.println("You chose money conversion");
		System.out.println("Select which conversion you would like");
		System.out.println("1. Dollars to Pounds");
		System.out.println("2. Pounds to Dollars");
	}
	//convert dollars to pounds
	public static double dollarsToPounds(double dollars) {
		dollars = dollars * .72;
		return dollars;
	}
	//convert pounds to dollars
	public static double poundsToDollars(double pounds) {
		pounds= pounds * 1.39;
		return pounds;
	}
	//Convert Weight
	//weight menu
	public static void weightMenu() {
		System.out.println("You chose weight conversion");
		System.out.println("Select which conversion you would like");
		System.out.println("1. Kilograms to Pounds");
		System.out.println("2. Pounds to Kilograms");
	}
	//convert kilograms to pounds
	public static double kilogramsToPounds(double kilograms) {
		kilograms = kilograms * 2.205;
		return kilograms;
	}
	//convert pounds to kilograms
	public static double poundsToKilograms(double pounds) {
		pounds = pounds / 2.205;
		return pounds;
	}
	//Convert volume
	//volume menu
	public static void volumeMenu() {
		System.out.println("You chose volume conversion");
		System.out.println("Select which conversion you would like");
		System.out.println("1. Milliliters to Ounces");
		System.out.println("2. Ounces to Milliliters");
	}
	public static double mlToOz(double ml) {
		ml = ml / 29.574;
		return ml;
	}
	public static double ozToMl(double oz) {
		oz = oz * 29.574;
		return oz;
	}
}
