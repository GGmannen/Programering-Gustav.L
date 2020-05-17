import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class HangmanDude {

	static Random random = new Random();
	static int amountWrongs = 0;
	static int maxWrongs = 7;
	static int wordCategory = 0;
	static String playerGuess = "";
	static String gameWord = "";
	static String displayWord = "";
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	static int playAgain;
	static int ErrorChecker;
	static ArrayList<String> guessedLetters = new ArrayList<>();

	
	/**
	 * Main metod som enbart anroppar det f�rsta metoderna vilket �r welcomer och sedan playGame d�r hela
	 * sk�ts
	 * @param args
	 */
	public static void main(String[] args) {
		welcomer();
		playGame();

	}

	
	/**
	 * denna metod anropppar allt annat i spelet och f�r det att flyta p�. Anroppar val av kategori osv
	 */
	private static void playGame() {
		chooseWordCategory();
		initdisplayword();
		gamePlayer();
		gameEnder();
	}

	
	/**
	 * Metod f�r att v�lkommna spelaren, finns enbart syso h�r f�r att f�rklara hur spelet fungerar
	 * och ingen direkt funktionallitet kr�vs i denna metod.
	 */
	public static void welcomer() {
		System.out.println("Welcome to a game about the hanging of a man!");
		System.out.println("You are supposed to guess on letters in different words");
		System.out.println("If your guess is wrong, the man will be hung");
		System.out.println("You guess one letter at a time, if you guess the entire word correct you win");
		System.out.println("GLHF!");

	}

	/**
	 * F�rsta metoden med funktionalitet hittar vi h�r. Denna metoden l�ter spelaren v�lja en kategori
	 * genom en switch och 4 st olika cases. Detta fungerar genom en input fr�n spelaren som dessutom kollas
	 * med en try catch exeption f�r att spelet inte skall crasha om spelaren skriver in en bokstav
	 */
	public static void chooseWordCategory() {

		System.out.println("Choose category: 1, Car brands \n 2, Colors \n 3, Animals  \n 4, Multiplayer");

		while (wordCategory < 1 || wordCategory > 4) {

			wordCategory = ErrorMessage();
			input.nextLine();

			switch (wordCategory) {
			case 1:
				Cars();
				break;
			case 2:
				Colors();
				break;
			case 3:
				Animals();
				break;
			case 4:
				Multiplayer();
				break;

			}
		}
	}

	/**
	 * Denna metod anroppas om spelaren v�ljer bil-m�rken kategorin. I denna metoden finner vi en lista
	 * d�r olika bil-m�rken har sparats. I slutet av denna metod s� randomiserar jag fram ett random ord
	 * med hj�lp av random classen som jag importerade i b�rjan av koden
	 */
	public static void Cars() {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("VOLVO");
		cars.add("PORSCHE");
		cars.add("MAZDA");
		cars.add("CORVETTE");
		cars.add("KOENIGSEGG");
		cars.add("BUGATTI");
		cars.add("MERCEDES");
		cars.add("LAMBORGHINI");
		cars.add("MCLAREN");
		cars.add("HENNESEY");
		cars.add("RIMAC");
		cars.add("MASERATI");
		cars.add("SAAB");

		gameWord = cars.get(random.nextInt(cars.size()));

	}
	/**
	* Samma sorts metoden som den ovan. Skillnaden �r att denna handlar om f�rger ist�llet f�r bilar. 
	* Allt �r samma f�rutom vad sj�lva listan �r fylld med
	*/
	public static void Colors() {

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("YELLOW");
		colors.add("PINK");
		colors.add("BLUE");
		colors.add("PURPLE");
		colors.add("GREEN");
		colors.add("BLACK");
		colors.add("BROWN");
		colors.add("ORANGE");
		colors.add("WHITE");
		colors.add("RED");
		colors.add("TURQUOISE");

		gameWord = (colors.get(random.nextInt(colors.size())));

	}
	/**
	 * Samma g�ller h�r igen. En lista som �r fylld med djur ist�llet och sedan randomiserar fram ett ord
	 * med hj�lp av random klassen
	 */
	public static void Animals() {

		ArrayList<String> animals = new ArrayList<String>();
		animals.add("TIGER");
		animals.add("PANDA");
		animals.add("CAT");
		animals.add("DOG");
		animals.add("PARROT");
		animals.add("RABBIT");
		animals.add("HORSE");
		animals.add("SPIDER");
		animals.add("GORILLA");
		animals.add("HAMSTER");
		animals.add("PIG");
		animals.add("COW");
		animals.add("ELEPAHNT");
		animals.add("GIRAFFE");
		animals.add("MOUSE");
		animals.add("RAT");

		gameWord = animals.get(random.nextInt(animals.size()));

	}
	/**
	 * Denna metod �r f�r flerspelarl�ge d� en spelare anger ett ord och deras kompis f�r sedan gissa p� 
	 * detta ordet. V�ldigt simpel kod, en input fr�n spelaren som sedan konverteras till stora bokst�ver
	 * s� att det inte spelar n�gon roll om spelaren skriver med stora eller sm� bokst�ver
	 */
	public static void Multiplayer() {

		
		System.out.println("Enter a word for your friend to guess: ");
		gameWord = input.nextLine();
		gameWord = gameWord.toUpperCase();
		

	}

	/**
	 * Metod f�r att f� understr�ck mellan bokst�ver och visa f�r anv�ndaren hur m�nga bokst�ver som finns
	 * i ordet
	 */
	private static void initdisplayword() {
		displayWord = "";

		for (int i = 0; i < gameWord.length(); i++) {

			displayWord += "_";

		}
	}
	/**
	 * Metoden d�r sj�lva spelet kommer ta plats. B�rjar med att hoppa in i en for loop som k�rs tills
	 * maxWrongs har n�tts. Detta ger spelaren m�jlighet att ha fel 7 g�nger innan spelet tar slut. Metoden
	 * inneh�ller input, och kollar om bokstaven gissat p� detta innan och alla andra m�jliga saker f�r att 
	 * spelet skall fungera
	 */
	public static void gamePlayer() {

		for (int i = 0; i < maxWrongs; i++) {
			System.out.println("Enter a letter:");
			playerGuess = input.nextLine();
			playerGuess = playerGuess.toUpperCase();

			if (!guessedLetters.contains(playerGuess)) {

				guessedLetters.add(playerGuess);

				updatedisplayWord(playerGuess);
				System.out.println(displayWord);

				if (gameWord.equals(displayWord)) {
					// vinst
					break;
				}

				if (gameWord.contains(playerGuess)) {
					// gissat r�tt
					System.out.println("Correct");
					i--;

				}

				else {
					// felgissning
					System.out.println("Wrong, try again!");
					if (i == 0) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                      |\r\n" + "                      |\r\n"
								+ "                      |\r\n" + "                     _|_''', '''");

					}

					else if (i == 1) {

						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "                      |\r\n"
								+ "                      |\r\n" + "                     _|_''', '''");
					}

					else if (i == 2) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "                |     |\r\n"
								+ "                |     |\r\n" + "                     _|_''', '''");
					}

					else if (i == 3) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "               /|     |\r\n"
								+ "                |     |\r\n" + "                     _|_''', '''");
					}

					else if (i == 4) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "               /|\\    |\r\n"
								+ "                |     |\r\n" + "                     _|_''', ''' ");
					}

					else if (i == 5) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "               /|\\    |\r\n"
								+ "                |     |\r\n" + "               /     _|_''', '''");
					}

					else if (i == 6) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "               /|\\    |\r\n"
								+ "                |     |\r\n" + "               / \\   _|_''','''");
					}

				}

			} else {

				System.out.println("You already guessed this, retard!");
				i--;
			}
		}

	}
	
	/**
	 * Denna metod anv�nds f�r att bokstaven som spelaren gissar p� skall hamna p� r�tt st�lle i ordet
	 * tex om ordet �r hej och spelaren gissar p� ett e s� g�r denna metod s� att programmet vet att
	 * bokstaven e st�r mitt i ordet och sparar detta i displayWord variablen
	 * @param playerGuess2
	 */
	private static void updatedisplayWord(String playerGuess2) {
		char[] displayWordArray = displayWord.toCharArray();
		for (int i = 0; i < gameWord.length(); i++) {
			if (gameWord.charAt(i) == playerGuess.charAt(0)) {

				displayWordArray[i] = playerGuess.charAt(0);

			}

		}
		displayWord = new String(displayWordArray);
	}

	/**
	 * Metoden f�r att avsluta spelet, denna metod visar vilket ord som var r�tt och det som spelaren har 
	 * gissat fram till, sen finns ocks� m�jligheten att starta om spelet eller avsluta det
	 */
	public static void gameEnder() {

		System.out.println("The word was:" + "\t" + gameWord);
		System.out.println("You guessed:" + "\t" + displayWord);

		System.out.println("Type: 1, To play again \n 2, To quit the game");
		while (playAgain < 1 || playAgain > 2) {

			playAgain = ErrorMessage();
			input.nextLine();

			if (playAgain == 1) {
				amountWrongs = 0;
				wordCategory = 0;
				gameWord = "";
				playAgain = 0;
				guessedLetters.clear();
				playGame();
			} else if (playAgain == 2) {
				System.exit(0);

			}

		}

	}

	/**
	 * metod f�r att kolla s� att en siffra skrivs in d�r det skall vara en siffra s� om spelaren f�rs�ker
	 * skriva in en bokstav s� kommer spelet inte att crasha
	 * @return
	 */
	public static int ErrorMessage() {
		while (true) {
			try {
				ErrorChecker = input.nextInt();
				break;

			} catch (Exception InputMismatchException) {

				System.out.println("Nope, won't crash because of a stupid letter today m8");
				input.next();
			}
		}
		return ErrorChecker;
	}
	
	
}
