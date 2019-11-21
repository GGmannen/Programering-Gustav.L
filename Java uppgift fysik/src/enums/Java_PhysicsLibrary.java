package enums;
import java.util.Scanner;

public class Java_PhysicsLibrary {

	
	public static void main(String[] args) {
		
		
		System.out.println(fahrenheitToCelsius(50.0));
		System.out.println(kelvinToCelsius(0.0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10.0));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(fallSpeed(2.5));
		
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
	
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = (mass * Math.pow(velocity, 2)) / 2;
		return kineticEnergy;
		
	}
	
	
	public static double potentialEnergy(double mass, double height) {
		
		return mass * 9.82 * height;
		
		
	}
	
	
	public static double fallSpeed(double height) {
		
		return Math.sqrt(2 * 9.82 * height);
				
				
				
				
				
		
		
	}
	
	
}
