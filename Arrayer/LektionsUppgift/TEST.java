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
		System.out.println("Välkommen till talspelet!");
		System.out.println("Detta är ett spel som går ut på att gissa ett tal");
		System.out.println("Du kommer få ledtrådar om du svarar fel");
		System.out.println("Vänligen fyll i ditt namn nedan: ");
		String UserName = input.nextLine();
		Difficulty();
		Easy();
		
	}
	
	public static void Difficulty() {
		System.out.println("Välj en svårhetsgrad: \n 1, Easy \n 2, Medium \n 3, Svår \n 4, Omöjlig");
		
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
					System.out.println("Gissa lägre!");
					System.out.println("Du har gissat:" + Guesses + "gånger");
				}
		
				else if (UserAnswear < EasyAnswear) {
					System.out.println("Gissa högre!");
					System.out.println("Du har gissat:" + Guesses + "gånger");
				
				}
			
				else if (UserAnswear == EasyAnswear) {
					System.out.println("Du gissade rätt din galning!");
					Endgame();
				}
			
			}
	
			}
		}	
		
	public static void Medium() {
		
		if(ChooseDifficulty == 2) {
			
			int MediumAnswear = rand.nextInt(100) + 1;
			
			if (UserAnswear > MediumAnswear) {
				System.out.println("Gissa lägre!");
				System.out.println("Du har gissat:" + Guesses + "gånger");
			}
			
			else if (UserAnswear < MediumAnswear) {
				System.out.println("Gissa högre!");
				System.out.println("Du har gissat:" + Guesses + "gånger");
			}
			else if (UserAnswear == MediumAnswear) {
				System.out.println("Du gissade rätt!");
				Endgame();
			}
			
		}
		
	}
	
	
	public static void Endgame() {
		
		
	}
	
	
	}
	
