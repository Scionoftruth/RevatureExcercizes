package main;

public class ConverterStorage {
	
	public double convertCelsiusToFarenheit(double qty) {
		return ((qty *(9/5))+32);
	}
	
	public double convertFarenheitToCelsius(double qty) {
		return ((qty - 32)*(5/9));
	}
	public double convertCelsiusToKelvin(double qty) {
		return (qty - 273.15);
	}
	
	public double convertFarenheitToKelvin(double qty) {
		return (convertFarenheitToCelsius(qty) - 273.15);
	}
	public double convertKelvinToCelsius(double qty) {
		return (qty + 273.15);
	}
	
	public double convertKelvinToFarenheit(double qty) {
		return (convertCelsiusToFarenheit(qty + 273.15));
	}
	
	public double convertTeaspoonsToTablespoons(double qty) {
		return qty*3;
	}
	
	public double convertTablespoonsToTablespoons(double qty) {
		return qty/3;
	}
	
	public double convertTablespoonsToCups(double qty) {
		return qty/16.2307;
	}
	
	public double convertCupsToTablespoons(double qty) {
		return qty*16.2307;
	}
	
	public double convertUSGallonsToImperialGallons(double qty) {
		return qty*0.832674;
	}
	
	public double convertImperialGallonsToUSGallons(double qty) {
		return qty*1.20095;
	}
	
	public double convertMilesToKilometers(double qty) {
		return qty*1.60934;
	}
	
	public double convertKilometersToMiles(double qty) {
		return qty*0.621371;
	}
	
	public double convertFeetToMeters(double qty) {
		return qty*0.3048;
	}
	
	public double convertMetersToFeet(double qty) {
		return qty*3.28084;
	}
	
	public double convertFeetToMiles(double qty) {
		return qty*0.000189394;
	}
	
	public double convertMilesToFeet(double qty) {
		return qty*5280;
	}

}
