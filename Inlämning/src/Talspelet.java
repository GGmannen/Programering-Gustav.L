import java.util.Random;
import java.util.Scanner;


public class Talspelet {
	
	static Random rand = new Random();
	static int Guesses = 0;
	static Scanner input = new Scanner (System.in);
	static String UserName;
	static int ChooseDifficulty;
	static int UserAnswear;
	static int CorrectAnswear;
	static int ErrorChecker;
	
	public static void main(String[]args) {
		System.out.println("Välkommen till talspelet!");
		System.out.println("Detta är ett spel som går ut på att gissa ett tal");
		System.out.println("Du kommer få ledtrådar om du svarar fel");
		System.out.println("Vänligen fyll i ditt namn nedan: ");
		String UserName = input.nextLine();
		Difficulty();
		
	}
	
	public static void Difficulty() {
		System.out.println("Välj en svårhetsgrad: \n 1, Easy \n 2, Medium \n 3, Svår \n 4, Svårare");
		
		while (ChooseDifficulty < 1 || ChooseDifficulty > 4) {
			  ChooseDifficulty = ErrorMessage();
			}
			switch (ChooseDifficulty) {
			  case 1: Easy();
			  case 2: Medium();
			  case 3: Hard();
			  case 4: Harder();
			}
		
		
	}
	
	
	
	
	
	public static void Easy() {
		
		if (ChooseDifficulty == 1) {
			
			int CorrectAnswear = rand.nextInt(20) + 1;
			while(UserAnswear != CorrectAnswear) {
				Guesses++;
				
				System.out.println("Skriv in en siffra: ");
				int UserAnswear = ErrorMessage();
			
				if (UserAnswear > CorrectAnswear) {
					System.out.println("Gissa lägre!");
					System.out.println("Du har gissat:" + Guesses + "gånger");
				}
		
				else if (UserAnswear < CorrectAnswear) {
					System.out.println("Gissa högre!");
					System.out.println("Du har gissat:" + Guesses + "gånger");
				
				}
			
				else if (UserAnswear == CorrectAnswear) {
					System.out.println("Du gissade rätt din galning!");
					break;
				}
			
			}
			Endgame();
			}
		}	
		
	public static void Medium() {
		
		if(ChooseDifficulty == 2) {
			
			System.out.println("Du har valt Medium, gissa mellan tal från 1-100");
			System.out.println("När du når 15 gissningar förlorar du!");
			
			int CorrectAnswear = rand.nextInt(100) + 1;
			
			while (UserAnswear != CorrectAnswear) {
				if(Guesses == 15) {
					break;
				}
				Guesses++;
				System.out.println("Skriv in en siffra: ");
				int UserAnswear = ErrorMessage();
			
				if (UserAnswear > CorrectAnswear+10) {
					System.out.println("Du är inte nära!");
					System.out.println("Du har gissat:" + Guesses + "gånger");
				}
		
				else if (UserAnswear < CorrectAnswear-10) {
					System.out.println("Du är inte nära!");
					System.out.println("Du har gissat:" + Guesses + "gånger");
				
				}
				
				else if (UserAnswear > CorrectAnswear || UserAnswear < CorrectAnswear) {
					System.out.println("Du är nära!");
					
				}
				else {
					break;
					
				}
			}
			Endgame();
			}
			
			
		}
		
	public static void Hard() {
		
		System.out.println("Du har valt Svår, gissa mellan tal från 1-100");
		System.out.println("När du når 15 gissningar förlorar du!");
		
		int CorrectAnswear = rand.nextInt(100) + 1;
		
		while (UserAnswear != CorrectAnswear) {
			if(Guesses == 15) {
				break;
			}
			Guesses++;
			System.out.println("Skriv in en siffra: ");
			int UserAnswear = ErrorMessage();
		
			if (UserAnswear != CorrectAnswear) {
				System.out.println("Du gissade fel.");
				System.out.println("Du har gissat:" + Guesses + "gånger");
			
				
			}
			else {
				break;
				
			}
		}
		Endgame();
		}
		
		
		public static void Harder() {
			System.out.println("Du har valt Svårare, gissa mellan tal från 1-1000");
			System.out.println("När du når 10 gissningar förlorar du!");
			
			int CorrectAnswear = rand.nextInt(1000) + 1;
			
			while (UserAnswear != CorrectAnswear) {
				if(Guesses == 10) {
					break;
				}
				Guesses++;
				System.out.println("Skriv in en siffra: ");
				int UserAnswear = ErrorMessage();
			
				if (CorrectAnswear % UserAnswear == 0) {
					System.out.println("Rätt svar är jämnt delbart med din gissning");
					System.out.println("Du har gissat:" + Guesses + "gånger");
				
					
				}
				
				else if(CorrectAnswear % UserAnswear != 0) {
				System.out.println("Rätt svar är inte jämnt delbart med din gissning");
				System.out.println("Du har gissat:" + Guesses + "gånger");
				}
				
				
				else {
					break;
					
				}
			}
			Endgame();
			}
			
		
		
		
	
	
	
	public static void Endgame() {
		if (UserAnswear == CorrectAnswear) {
			System.out.println("Grattis");
			
		}
		
		else {
			System.out.println("Du suger");
			
			
		}
	}
	
	public static int ErrorMessage () {
		while(true) {
			try {
				ErrorChecker = input.nextInt();
				break;
				
			}
			catch(Exception InputMismatchException) {
				
				System.out.println("Skriv in en siffra istället din nöt");
				input.next();
			}
		}
		return ErrorChecker;
	}
	
	}
	
