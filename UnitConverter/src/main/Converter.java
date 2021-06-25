package main;

import java.util.Scanner;

public class Converter {
	
	/*private static double collectQuantity(String unit1, String unit2) {
		double result;
		Scanner scanner = new Scanner(System.in);
		result = scanner.nextDouble();
		scanner.close();
		return result;
	}*/
	
	
	public static void main(String[] args) {
		int menuSelection = 0;
		
		ConverterStorage cs = new ConverterStorage();
		
		while(menuSelection != 4) {
			System.out.println("Please select an option:");
			System.out.println("1. Temperature Conversions");
			System.out.println("2. Volume Conversions");
			System.out.println("3. Distance Conversions");
			System.out.println("4. Quit");
			
			Scanner scanner = new Scanner(System.in);
			menuSelection = scanner.nextInt();
	
			switch(menuSelection) {
				case 1:{
					int tMenu = 0;
					while(tMenu != 7) {
						System.out.println("Please select an option:");
						System.out.println("1. Celsius to Farenheight");
						System.out.println("2. Farenheight to Celsius");
						System.out.println("3. Celsius to Kelvin");
						System.out.println("4. Farenheight to Kelvin");
						System.out.println("5. Kelvin to Celsius");
						System.out.println("6. Kelvin to Farenheight");
						System.out.println("7. Quit");
						tMenu = scanner.nextInt();
						switch(tMenu) {
							case 1: 
								System.out.println("Enter your measurement");
								int num1 = scanner.nextInt();
								System.out.println(cs.convertCelsiusToFarenheit(num1));
								break;
							case 2: 
								System.out.println("Enter your measurement");
								int num2 = scanner.nextInt();
								System.out.println(cs.convertFarenheitToCelsius(num2));
								break;
							case 3: 
								System.out.println("Enter your measurement");
								int num3 = scanner.nextInt();
								System.out.println(cs.convertCelsiusToKelvin(num3));
								break;
							case 4: 
								System.out.println("Enter your measurement");
								int num4 = scanner.nextInt();
								System.out.println(cs.convertFarenheitToKelvin(num4));
								break;
							case 5: 
								System.out.println("Enter your measurement");
								int num5 = scanner.nextInt();
								System.out.println(cs.convertKelvinToCelsius(num5));
								break;
							case 6: 
								System.out.println("Enter your measurement");
								int num6 = scanner.nextInt();
								System.out.println(cs.convertKelvinToFarenheit(num6));
								break;
							case 7:
								break;
							default:
								System.out.println("Please enter a number from the menu");
								break;
						}
					}
					break;
				}
				case 2:{
					int vMenu = 0;
					while(vMenu != 7) {
						System.out.println("Please select an option:");
						System.out.println("1. Teaspoons to Tablespoons");
						System.out.println("2. Tablespoons to Teaspoons");
						System.out.println("3. Tablespoons to Cups");
						System.out.println("4. Cups to Tablespoons");
						System.out.println("5. US Gallons to Imperial Gallons");
						System.out.println("6. Imperial Gallons to US Gallons");
						System.out.println("7. Quit");
						vMenu = scanner.nextInt();
						switch(vMenu) {
							case 1: 
								System.out.println("Enter your measurement");
								int num1 = scanner.nextInt();
								System.out.println(cs.convertTeaspoonsToTablespoons(num1));
								break;
							case 2: 
								System.out.println("Enter your measurement");
								int num2 = scanner.nextInt();
								System.out.println(cs.convertTablespoonsToTablespoons(num2));
								break;
							case 3: 
								System.out.println("Enter your measurement");
								int num3 = scanner.nextInt();
								System.out.println(cs.convertTablespoonsToCups(num3));
								break;
							case 4: 
								System.out.println("Enter your measurement");
								int num4 = scanner.nextInt();
								System.out.println(cs.convertCupsToTablespoons(num4));
								break;
							case 5: 
								System.out.println("Enter your measurement");
								int num5 = scanner.nextInt();
								System.out.println(cs.convertUSGallonsToImperialGallons(num5));
								break;
							case 6: 
								System.out.println("Enter your measurement");
								int num6 = scanner.nextInt();
								System.out.println(cs.convertImperialGallonsToUSGallons(num6));
								break;
							case 7:
								break;
							default:
								System.out.println("Please enter a number from the menu");
								break;
						}
					}
					break;
				}
				case 3:{
					int lMenu = 0;
					while (lMenu != 7) {
						System.out.println("Please select an option:");
						System.out.println("1. Miles to Kilometers");
						System.out.println("2. Kilometers to Miles");
						System.out.println("3. Feet to Meters");
						System.out.println("4. Meters to Feet");
						System.out.println("5. Feet to Miles");
						System.out.println("6. Miles to Feet");
						System.out.println("7. Quit");
						lMenu = scanner.nextInt();
						switch(lMenu) {
							case 1: 
								System.out.println("Enter your measurement");
								int num1 = scanner.nextInt();
								System.out.println(cs.convertMilesToKilometers(num1));
								break;
							case 2: 
								System.out.println("Enter your measurement");
								int num2 = scanner.nextInt();
								System.out.println(cs.convertKilometersToMiles(num2));
								break;
							case 3: 
								System.out.println("Enter your measurement");
								int num3 = scanner.nextInt();
								System.out.println(cs.convertFeetToMeters(num3));
								break;
							case 4: 
								System.out.println("Enter your measurement");
								int num4 = scanner.nextInt();
								System.out.println(cs.convertMetersToFeet(num4));
								break;
							case 5: 
								System.out.println("Enter your measurement");
								int num5 = scanner.nextInt();
								System.out.println(cs.convertFeetToMiles(num5));
								break;
							case 6: 
								System.out.println("Enter your measurement");
								int num6 = scanner.nextInt();
								System.out.println(cs.convertMilesToFeet(num6));
								break;
							case 7:
								break;
							default:
								System.out.println("Please enter a number from the menu");
								break;
						}
					}
					break;
				}
				case 4:{
					System.out.println("Thank You for using my program");
					break;
				}
				default:{
					System.out.println("Please enter a number from the menu");
				}
				
				scanner.close();
			}
			
		}
		
	}
}
