import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class HangmanDude {

	static Random random = new Random();
	static int amountWrongs = 0;
	static int maxWrongs = 8;
	static int wordCategory = 0;
	static String playerGuess = "";
	static String gameWord = "hejsan";
	static String displayWord = "";
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	static int playAgain;
	static ArrayList<String> guessedLetters = new ArrayList<>();

	public static void main(String[] args) {
		welcomer();
		playGame();
		

	}

	private static void playGame() {
		chooseWordCategory();
		initdisplayword();
		gamePlayer();
		gameEnder();
	}

	public static void welcomer() {
		System.out.println("Welcome to a game about the hanging of a man!");
		System.out.println("You are supposed to guess on letters in different words");
		System.out.println("If your guess is wrong, the man will be hung");
		System.out.println("You guess one letter at a time, if you guess the entire word correct you win");
		System.out.println("GLHF!");

	}

	public static void chooseWordCategory() {

		System.out.println("Choose category: 1, Car brands \n 2, Colors \n 3, Animals  ");

		while (wordCategory < 1 || wordCategory > 4) {

			wordCategory = input.nextInt();
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

			}
		}
	}

	public static void Cars() {

		if (wordCategory == 1) {

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

	}

	public static void Colors() {

		if (wordCategory == 2) {

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
	}

	public static void Animals() {

		if (wordCategory == 3) {

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
	}

	private static void initdisplayword() {
		displayWord = "";

		for (int i = 0; i < gameWord.length(); i++) {

			displayWord += "_";

		}
	}

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
					//vinst
					break;
				}

				if (gameWord.contains(playerGuess)) {
					//gissat rätt
					System.out.println("Correct");
					i--;
					
				}

				else {
				//felgissning	
					System.out.println("Wrong, try again!");
				}

			}
			else {
				
				System.out.println("You already guessed this, retard!");
				i--;
			}
		}

	}

	private static void updatedisplayWord(String playerGuess2) {
		char[] displayWordArray = displayWord.toCharArray();
		for (int i = 0; i < gameWord.length(); i++) {
			if (gameWord.charAt(i) == playerGuess.charAt(0)) {

				displayWordArray[i] = playerGuess.charAt(0);

			}
			

		}
		displayWord = new String(displayWordArray);
	}

	public static void gameEnder() {

		System.out.println("Type: 1, To play again \n 2, To quit the game");
		while (playAgain < 1 || playAgain > 2) {

			playAgain = input.nextInt();
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

}
