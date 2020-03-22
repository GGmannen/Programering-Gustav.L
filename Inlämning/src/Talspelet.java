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
	static int PlayAgain;
	
	
	public static void main(String[]args) {
		GameStarter();
		
	}
	
	public static void GameStarter() {
		System.out.println("V�lkommen till talspelet!");
		System.out.println("Detta �r ett spel som g�r ut p� att gissa ett tal");
		System.out.println("Du kommer f� ledtr�dar om du svarar fel");
		System.out.println("V�nligen fyll i ditt namn nedan: ");
		String UserName = input.nextLine();
		Difficulty();
		
		
	}
	
	
	public static void Difficulty() {
		System.out.println("V�lj en sv�rhetsgrad: \n 1, Easy \n 2, Medium \n 3, Sv�r \n 4, Sv�rare");
		
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
			
			System.out.println("Du har valt Easy, gissa mellan 1-20");
			System.out.println("Du har o�ndligt med gissningar p� dig!");
			
			int CorrectAnswear = rand.nextInt(20) + 1;
			while(UserAnswear != CorrectAnswear) {
				Guesses++;
				
				System.out.println("Skriv in en siffra: ");
				int UserAnswear = ErrorMessage();
			
				if (UserAnswear > CorrectAnswear) {
					System.out.println("Gissa l�gre!");
					System.out.println("Du har gissat:" + Guesses + "g�nger");
				}
		
				else if (UserAnswear < CorrectAnswear) {
					System.out.println("Gissa h�gre!");
					System.out.println("Du har gissat:" + Guesses + "g�nger");
				
				}
			
				else if (UserAnswear == CorrectAnswear) {
					System.out.println("Du gissade r�tt din galning!");
					break;
				}
			
			}
			Endgame();
			}
		}	
		
	public static void Medium() {
		
		if(ChooseDifficulty == 2) {
			
			System.out.println("Du har valt Medium, gissa mellan tal fr�n 1-100");
			System.out.println("N�r du n�r 15 gissningar f�rlorar du!");
			
			int CorrectAnswear = rand.nextInt(100) + 1;
			
			while (UserAnswear != CorrectAnswear) {
				if(Guesses == 15) {
					break;
				}
				Guesses++;
				System.out.println("Skriv in en siffra: ");
				int UserAnswear = ErrorMessage();
			
				if (UserAnswear > CorrectAnswear+10) {
					System.out.println("Du �r inte n�ra!");
					System.out.println("Du har gissat:" + Guesses + "g�nger");
				}
		
				else if (UserAnswear < CorrectAnswear-10) {
					System.out.println("Du �r inte n�ra!");
					System.out.println("Du har gissat:" + Guesses + "g�nger");
				
				}
				
				else if (UserAnswear > CorrectAnswear || UserAnswear < CorrectAnswear) {
					System.out.println("Du �r n�ra!");
					System.out.println("Du har gissat:" + Guesses + "g�nger");
				}
				else {
					break;
					
				}
			}
			Endgame();
			}
			
			
		}
		
	public static void Hard() {
		
		System.out.println("Du har valt Sv�r, gissa mellan tal fr�n 1-100");
		System.out.println("N�r du n�r 15 gissningar f�rlorar du!");
		
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
				System.out.println("Du har gissat:" + Guesses + "g�nger");
			
				
			}
			else {
				break;
				
			}
		}
		Endgame();
		}
		
		
		public static void Harder() {
			System.out.println("Du har valt Sv�rare, gissa mellan tal fr�n 1-1000");
			System.out.println("N�r du n�r 10 gissningar f�rlorar du!");
			
			int CorrectAnswear = rand.nextInt(1000) + 1;
			
			while (UserAnswear != CorrectAnswear) {
				if(Guesses == 10) {
					break;
				}
				Guesses++;
				System.out.println("Skriv in en siffra: ");
				int UserAnswear = ErrorMessage();
			
				if (CorrectAnswear % UserAnswear == 0) {
					System.out.println("R�tt svar �r j�mnt delbart med din gissning");
					System.out.println("Du har gissat:" + Guesses + "g�nger");
				
					
				}
				
				else if(CorrectAnswear % UserAnswear != 0) {
				System.out.println("R�tt svar �r inte j�mnt delbart med din gissning");
				System.out.println("Du har gissat:" + Guesses + "g�nger");
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
			Restart();
		}
		
		else {
			System.out.println("Du suger");
			Restart();
			
		}
	}
	
	public static void Restart() {
		System.out.println("Skriv 1 f�r att spela igen \n Skriv 2 f�r att avsluta" );
		while(PlayAgain < 1 || PlayAgain > 2) {
			
		
		int PlayAgain = ErrorMessage();
		if (PlayAgain == 1) {
			Guesses = 0;
			ChooseDifficulty= 0;
			CorrectAnswear = 0;
			GameStarter();
			
		}
		else if (PlayAgain == 2) {
			System.exit(0);
			
		}
		
		}
		
	}
	
	
	public static int ErrorMessage () {
		while(true) {
			try {
				ErrorChecker = input.nextInt();
				break;
				
			}
			catch(Exception InputMismatchException) {
				
				System.out.println("Skriv in en siffra ist�llet din n�t");
				input.next();
			}
		}
		return ErrorChecker;
	}
	
	}
	
