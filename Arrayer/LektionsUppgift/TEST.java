import java.util.Random;
import java.util.Scanner;


public class TEST {
	
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
		Easy();
		
	}
	
	public static void Difficulty() {
		System.out.println("V�lj en sv�rhetsgrad: \n 1, Easy \n 2, Medium \n 3, Sv�r \n 4, Om�jlig");
		
		while (ChooseDifficulty < 1 || ChooseDifficulty > 4) {
			  ChooseDifficulty = input.nextInt();
			}
			switch (ChooseDifficulty) {
			  case 1: Easy();
			  case 2: Medium();
			  
			}
		
		
	}
	
	
	
	
	
	public static void Easy() {
		
		if (ChooseDifficulty == 1) {
			
			int EasyAnswear = rand.nextInt(20) + 1;
			while(UserAnswear != EasyAnswear) {
				
			
				int UserAnswear = input.nextInt();
			
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
					Endgame();
				}
			
			}
	
			}
		}	
		
	public static void Medium() {
		
		if(ChooseDifficulty == 2) {
			
			int MediumAnswear = rand.nextInt(100) + 1;
			
			if (UserAnswear > MediumAnswear) {
				System.out.println("Gissa l�gre!");
				System.out.println("Du har gissat:" + Guesses + "g�nger");
			}
			
			else if (UserAnswear < MediumAnswear) {
				System.out.println("Gissa h�gre!");
				System.out.println("Du har gissat:" + Guesses + "g�nger");
			}
			else if (UserAnswear == MediumAnswear) {
				System.out.println("Du gissade r�tt!");
				Endgame();
			}
			
		}
		
	}
	
	
	public static void Endgame() {
		
		
	}
	
	
	}
	
