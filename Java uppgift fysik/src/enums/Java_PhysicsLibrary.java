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
		System.out.println("Totalt tryck" + "\t" + fluidPressure(FluidTable.WATER, 75)  + "N");
		System.out.println("Bollen flyger:" + "\t" + velocityToHeight(16.667));
		
		//Ett värde för lite, har ej tid att lösa nu
		//System.out.println("Effekten är:" + "\t" + power(work(Force(735.0),(100.0/3.6 * 4.8))));
		
		System.out.println(Question7(1,12,0.5));
		
		//Hur mycket är 100 Kelvin i Celsius
		System.out.println("Grader" + "\t" + kelvinToCelsius(100) + "C");
		
		//Hur långt har bilen färdats om den kör i 10 m/s i 50 sekunder
		System.out.println("Bilen färdas:" + "\t" + svtDistance(10,50) + "m");
		
		//Vilken hastigheter hinner en Kissmiss uppnå om den släpps från 50 meter
		System.out.println("Katten uppnår:"+ "\t" + fallSpeed(50) + "m/s");
		
			
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
	 * Metod för att räkna ut trycket i vätska vid ett betämt djup
	 * @param fluid vätskans densitet
	 * @param deep djupet i meter
	 * @return skickar tillbaka det beräknade trycket
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		 double pressure = (fluid.density * g_swe * deep);
	     return pressure;
		
		
	}
	
	/**
	 * Räknar ut trycket under vattnet vid ett bestämt djup
	 * @param deep djupet i vattnet
	 * @return skickar tillbaka de beräknade trycket
	 */
	public static double pressureUnderWater(double deep) {
		
		double pressureUnder = FluidTable.WATER.density * g_swe * deep;
		return pressureUnder;
		
		
	}
	/**
	 * räknar ut kinetisk energi genom massan multiplicerat med hastigheten
	 * @param mass massan för materialet
	 * @param velocity hastigheten hos föremålet
	 * @return skickar tillbaka värdet för den kinetiska energin
	 */
	public static double kineticEnergy(double mass, double velocity) {
		
		double kineticEnergy = (mass * Math.pow(velocity, 2)) / 2;
		return kineticEnergy;
		
	}
	
	/**
	 * A method that calculates potential energy by multiplying mass, height and the gravitational pull in Sweden
	 * @param mass The mass for a certain object
	 * @param height The height the object has
	 * @return sends back the potential energy which the object has
	 */
	public static double potentialEnergy(double mass, double height) {
		
		return mass * g_swe * height;
		
		
	}
	
	/**
	 * This method calculates the fall speed of a object which it can reach when getting dropped from a height
	 * @param height the height the object is dropped from
	 * @return Returns the calculated fall speed
	 */
	public static double fallSpeed(double height) {
		
		return Math.sqrt(2 * g_swe * height);
				
	}
	/**
	 * Calculates the difference between two different values
	 * @param first the predetermined first value
	 * @param last the predetermined seccond value
	 * @return
	 */
	public static double delta(double first, double last) {
		
		return last - first;
		
	}
	/**
	 * A method that changes a volume of a fluid to a different mass
	 * @param fluid the value of the fluid
	 * @param volume the volume used when calculating the final value
	 * @return Returns the mass that has been converted from volume to fluid
	 */ 
	public static double volumeToMass(FluidTable fluid, double volume) {
		
		return 	fluid.density * volume;
		
	}
	/**
	 * This method converts the volume of a gas to a mass
	 * @param gas the value of the gas
	 * @param volume the volume of this gas
	 * @return Returns the converted volume of the gas in a mass
	 */
	public static double volumeToMassGas(GasTable gas, double volume) {
		
		return gas.density * volume;
		
	}
	/**
	 * A method that changes a the volume of a material to a mass
	 * @param solid The value of the material
	 * @param volume The volume of the material
	 * @return Returns the converted volume of the material in a mass
	 */
	public static double volumeToMassSolid(SolidTable solid, double volume) {
		
		return solid.density * volume;
		
	}
	/**
	 * A method that calculates averages speed using distance and time
	 * @param distance the specific distance
	 * @param time the specific time
	 * @return Returns the now calculated velocity
	 */
	public static double svtVelocity(double distance, double time) {
		
		return distance / time;
		
	}
	/**
	 * This method calculates the distance using speed and time
	 * @param velocity the speed the object is traveling in
	 * @param time the time the object takes to travel 
	 * @return the distance it traveled
	 */
	public static double svtDistance(double velocity, double time) {
		
		return velocity * time;
		
	}
	/**
	 * Calculates time with the help of the distance and velocity
	 * @param distance the distance
	 * @param velocity the velocity the object is traveling in
	 * @return the time it took to travel
	 */
	public static double svtTime(double distance, double velocity) {
		
		return distance / velocity;
		
	}
	/**
	 * Calculates the work performed with the help of the force and the distance
	 * @param force the force needed
	 * @param distance the distance traveled
	 * @return the work done
	 */
	public static double work(double force, double distance) {
		
		return force * distance;
		
	
	}
	/**
	 * This method calculates the effect using work and time
	 * @param work the work used
	 * @param time under this time
	 * @return the power used
	 */
	public static double power(double work, double time) {
		
		return work / time;
		
	}
	/**
	 * Energy needed to heat a material up to a certain to a determined amount of degrees
	 * @param solid the material
	 * @param mass the mass of the material
	 * @param deltaT the difference in time
	 * @return the energy needed
	 */
	public static double heatSolid(SolidTable solid, double mass, double deltaT) {
		
		return solid.heatCapacity * mass * deltaT;
		
	}
	/**
	 * Energy needed to heat a certain mass of a fluid to a set amount of degrees
	 * @param fluid the fluid
	 * @param mass the mass of the fluid
	 * @param deltaT the difference in time
	 * @return the energy needed
	 */
	public static double heatFluid(FluidTable fluid, double mass, double deltaT) {
		
		return fluid.heatCapacity * mass * deltaT;
		
	}
	/**
	 * Energy needed to heat a certain mass of a gas to a set amount of degrees
	 * @param gas the gas
	 * @param mass the mass of gas
	 * @param deltaT the differnce in time
	 * @return the energy needed
	 */
	public static double heatGas(GasTable gas, double mass, double deltaT) {
		
		return gas.heatCapacity * mass * deltaT;
		
	}
	/**
	 * Calculates how high an object with a certain velocity can reach
	 * @param velocity the velocity of the object
	 * @return the height of the object
	 */
	public static double velocityToHeight(double velocity) {
		
		return Math.pow(velocity, 2) / (2*g_swe);	
		
	}
	
	/**
	 * Method for question to calculate force
	 * @param mass the mass
	 * @return the force
	 */
	public static double Force (double mass) {
        return mass*g_swe;
    }
	
	/**
	 * Method for question 7
	 * @param mass the mass of the ball
	 * @param h the height of the ball
	 * @param mH minimal height
	 * @return
	 */
	public static int Question7 (double mass, double h,double mH) {
		int studs = 0;



		while ( h > mH) {

		double E = mass* g_swe*h;
		E = E * 0.99;
		h = E/(mass * g_swe);
		studs++;

		}
		return studs;
		}
}
