import java.util.Random;
import java.util.Scanner;


public class Talspelet {
	
	static Random rand = new Random();
	static int Guesses = 0;
	static Scanner input = new Scanner (System.in);
	static String UserName;
	static int ChooseDifficulty;
	static int UserAnswear;
	
	public static void main(String[]args) {
		System.out.println("V�lkommen till talspelet!");
		System.out.println("Detta �r ett spel som g�r ut p� att gissa ett tal");
		System.out.println("Du kommer f� ledtr�dar om du svarar fel");
		System.out.println("V�nligen fyll i ditt namn nedan: ");
		String UserName = input.nextLine();
		Difficulty();
		
		
	}
	
	public static void Difficulty() {
		System.out.println("V�lj en sv�rhetsgrad: \n 1, Easy \n 2, Medium \n 3, Sv�r \n 4, Om�jlig");
		System.out.println("Skriv en siffra fr�n 1-4");
		while (true) {
			if (ChooseDifficulty == 1 || ChooseDifficulty == 2 || ChooseDifficulty == 3 || ChooseDifficulty == 4) {
				
				break;
			}
			
			
		}
		
		
	}
	
	
	
	
	
	public static int Easy() {
		
		if (ChooseDifficulty == 1) {
			
			int EasyAnswear = rand.nextInt(20) + 1;
			
			if (UserAnswear > EasyAnswear) {
				System.out.println("Gissa l�gre!");
				System.out.println("Du har gissat:" + Guesses + "g�nger");
			}
		
			else if (UserAnswear < EasyAnswear) {
			System.out.println("Gissa h�gre!");
			System.out.println("Du har gissat:" + Guesses + "g�nger");
				
			}
			
			else if (UserAnswear == EasyAnswear) {
				System.out.println("Du gissade r�tt din galning!");
				
			}
			
			
			while (Guesses != EasyAnswear) {
				System.out.println("Skriv in en siffra: ");
				Guesses++;
			
			}
		
		
		return EasyAnswear;
	
			}
		}	
		
	}
	
