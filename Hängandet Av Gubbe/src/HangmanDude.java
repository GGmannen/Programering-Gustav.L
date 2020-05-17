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
	 * Main metod som enbart anroppar det första metoderna vilket är welcomer och sedan playGame där hela
	 * sköts
	 * @param args
	 */
	public static void main(String[] args) {
		welcomer();
		playGame();

	}

	
	/**
	 * denna metod anropppar allt annat i spelet och får det att flyta på. Anroppar val av kategori osv
	 */
	private static void playGame() {
		chooseWordCategory();
		initdisplayword();
		gamePlayer();
		gameEnder();
	}

	
	/**
	 * Metod för att välkommna spelaren, finns enbart syso här för att förklara hur spelet fungerar
	 * och ingen direkt funktionallitet krävs i denna metod.
	 */
	public static void welcomer() {
		System.out.println("Welcome to a game about the hanging of a man!");
		System.out.println("You are supposed to guess on letters in different words");
		System.out.println("If your guess is wrong, the man will be hung");
		System.out.println("You guess one letter at a time, if you guess the entire word correct you win");
		System.out.println("GLHF!");

	}

	/**
	 * Första metoden med funktionalitet hittar vi här. Denna metoden låter spelaren välja en kategori
	 * genom en switch och 4 st olika cases. Detta fungerar genom en input från spelaren som dessutom kollas
	 * med en try catch exeption för att spelet inte skall crasha om spelaren skriver in en bokstav
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
	 * Denna metod anroppas om spelaren väljer bil-märken kategorin. I denna metoden finner vi en lista
	 * där olika bil-märken har sparats. I slutet av denna metod så randomiserar jag fram ett random ord
	 * med hjälp av random classen som jag importerade i början av koden
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
	* Samma sorts metoden som den ovan. Skillnaden är att denna handlar om färger istället för bilar. 
	* Allt är samma förutom vad själva listan är fylld med
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
	 * Samma gäller här igen. En lista som är fylld med djur istället och sedan randomiserar fram ett ord
	 * med hjälp av random klassen
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
	 * Denna metod är för flerspelarläge då en spelare anger ett ord och deras kompis får sedan gissa på 
	 * detta ordet. Väldigt simpel kod, en input från spelaren som sedan konverteras till stora bokstäver
	 * så att det inte spelar någon roll om spelaren skriver med stora eller små bokstäver
	 */
	public static void Multiplayer() {

		
		System.out.println("Enter a word for your friend to guess: ");
		gameWord = input.nextLine();
		gameWord = gameWord.toUpperCase();
		

	}

	/**
	 * Metod för att få understräck mellan bokstäver och visa för användaren hur många bokstäver som finns
	 * i ordet
	 */
	private static void initdisplayword() {
		displayWord = "";

		for (int i = 0; i < gameWord.length(); i++) {

			displayWord += "_";

		}
	}
	/**
	 * Metoden där själva spelet kommer ta plats. Börjar med att hoppa in i en for loop som körs tills
	 * maxWrongs har nåtts. Detta ger spelaren möjlighet att ha fel 7 gånger innan spelet tar slut. Metoden
	 * innehåller input, och kollar om bokstaven gissat på detta innan och alla andra möjliga saker för att 
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
					// gissat rätt
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
	 * Denna metod används för att bokstaven som spelaren gissar på skall hamna på rätt ställe i ordet
	 * tex om ordet är hej och spelaren gissar på ett e så gör denna metod så att programmet vet att
	 * bokstaven e står mitt i ordet och sparar detta i displayWord variablen
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
	 * Metoden för att avsluta spelet, denna metod visar vilket ord som var rätt och det som spelaren har 
	 * gissat fram till, sen finns också möjligheten att starta om spelet eller avsluta det
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
	 * metod för att kolla så att en siffra skrivs in där det skall vara en siffra så om spelaren försöker
	 * skriva in en bokstav så kommer spelet inte att crasha
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
