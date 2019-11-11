import java.util.Scanner;

public class Java_PhysicsLibrary {

	
	public static void main(String[] args) {
		
		
		System.out.println(fahrenheitToCelsius(50.0));
		
		
	}
	//Metod för att konvertera fahrenheit till celsius
	public static double fahrenheitToCelsius (double farenheit) {
		double celcius = ((farenheit-32)*5)/9;
		return celcius;
	
	}
	
}
