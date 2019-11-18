package enums;
import java.util.Scanner;

public class Java_PhysicsLibrary {

	
	public static void main(String[] args) {
		
		
		System.out.println(fahrenheitToCelsius(50.0));
		System.out.println(kelvinToCelsius(0.0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10.0));
		
	}
	//Metod för att konvertera fahrenheit till celsius
	public static double fahrenheitToCelsius (double farenheit) {
		double celcius = ((farenheit-32)*5)/9;
		return celcius;
	
	}
	
	
	//Metod för att konvertera kelvin till celsius
	public static double kelvinToCelsius(double kelvin) {
		double celcius = (kelvin-273.15);
		return celcius;
		
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		 double pressure = (fluid.density * 9.82 * deep);
	     return pressure;
		
		
	}
	
	
	public static double pressureUnderWater(double deep) {
		
		double pressureUnder = FluidTable.WATER.density * 9.82 * deep;
		return pressureUnder;
		
		
	}
	
	
	
	
}
