package enums;
import java.util.Scanner;

public class Java_PhysicsLibrary {

	static double g_swe = 9.82;
	static double G = 6.67408*Math.pow(10, -11);
	static double R = 8.3144621;
	static double p_0 = 1000;
	static double c = 299792458;
	
	public static void main(String[] args) {
		
		
		System.out.println("Järn väger:" + "\t" + volumeToMassSolid(SolidTable.IRON, 0.06) + "kg");
		System.out.println("Thomas hinner:" + "\t" + svtDistance(2.7, 3000) + "m");
		System.out.println("Energi till vatten:" + "\t" + heatFluid(FluidTable.WATER, 4, FluidTable.WATER.boilPoint) + "J");
		System.out.println("Totalt tryck" + "\t" + fluidPressure(FluidTable.WATER, 75 + "N"));
		System.out.println("Bollen flyger:" + "\t" + );
		
		
		System.out.println(fahrenheitToCelsius(50.0));
		System.out.println(kelvinToCelsius(0.0));
		System.out.println(fluidPressure(FluidTable.WATER, 10));
		System.out.println(pressureUnderWater(10.0));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(fallSpeed(2.5));
		System.out.println(delta(5,1));
		System.out.println(volumeToMass(FluidTable.WATER,1));
		System.out.println(volumeToMassGas(GasTable.AIR,1));
		System.out.println(volumeToMassSolid(SolidTable.IRON,1));
		System.out.println(svtVelocity(10,5));
		System.out.println(svtDistance(10,5));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		System.out.println(power(1000,2));
		System.out.println(heatSolid(SolidTable.IRON,1,2));
		System.out.println(heatFluid(FluidTable.WATER,1,10));
		System.out.println(heatGas(GasTable.AIR,1,1));
		System.out.println(velocityToHeight(9.82));
		
		
			
	}
	/**
	 * Metod för att konvertera fahrenheit till celsius
	 * @param farenheit grader i farenheit
	 * @return skickar tillbaka celcius
	 */
	public static double fahrenheitToCelsius (double farenheit) {
		double celcius = ((farenheit-32)*5)/9;
		return celcius;
	
	}
	
	
	/**
	 * Metod för att konvertera kelvin till celsius
	 * @param kelvin grader i kelvin
	 * @return skickar tillbaka i celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celcius = (kelvin-273.15);
		return celcius;
		
	}
	/**
	 * Metod för att räkna ut trycket i vattnet vid ett betämt djup
	 * @param fluid vätskans densitet
	 * @param deep djupet i meter
	 * @return skickar tillbaka det beräknade trycket
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		 double pressure = (fluid.density * g_swe * deep);
	     return pressure;
		
		
	}
	
	
	public static double pressureUnderWater(double deep) {
		
		double pressureUnder = FluidTable.WATER.density * g_swe * deep;
		return pressureUnder;
		
		
	}
	
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = (mass * Math.pow(velocity, 2)) / 2;
		return kineticEnergy;
		
	}
	
	
	public static double potentialEnergy(double mass, double height) {
		
		return mass * g_swe * height;
		
		
	}
	
	
	public static double fallSpeed(double height) {
		
		return Math.sqrt(2 * g_swe * height);
				
	}
	
	public static double delta(double first, double last) {
		
		return last - first;
		
	}
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		
		return 	fluid.density * volume;
		
	}
	
	public static double volumeToMassGas(GasTable gas, double volume) {
		
		return gas.density * volume;
		
	}
	
	public static double volumeToMassSolid(SolidTable solid, double volume) {
		
		return solid.density * volume;
		
	}
	
	public static double svtVelocity(double distance, double time) {
		
		return distance / time;
		
	}
	
	public static double svtDistance(double velocity, double time) {
		
		return velocity * time;
		
	}
	
	public static double svtTime(double distance, double velocity) {
		
		return distance / velocity;
		
	}
	
	public static double work(double force, double distance) {
		
		return force * distance;
		
	
	}
	
	public static double power(double work, double time) {
		
		return work / time;
		
	}
	
	public static double heatSolid(SolidTable solid, double mass, double deltaT) {
		
		return solid.heatCapacity * mass * deltaT;
		
	}
	
	public static double heatFluid(FluidTable fluid, double mass, double deltaT) {
		
		return fluid.heatCapacity * mass * deltaT;
		
	}
	
	public static double heatGas(GasTable gas, double mass, double deltaT) {
		
		return gas.heatCapacity * mass * deltaT;
		
	}
	
	public static double velocityToHeight(double velocity) {
		
		return Math.pow(velocity, 2) / (2*g_swe);	
		
	}
}
