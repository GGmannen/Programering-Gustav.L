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
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	static int playAgain;
	static ArrayList<String> guessedLetters = new ArrayList<>();

	public static void main(String[] args) {
		gamePlayer();

	}

	public static void welcomer() {
		System.out.println("Welcome to a game about the hanging of a man!");
		System.out.println("You are supposed to guess on letters in different words");
		System.out.println("If your guess is wrong, the man will be hung");
		System.out.println("You guess one letter at a time, if you guess the entire word correct you win");
		System.out.println("GLHF!");
		chooseWordCategory();

	}

	public static void chooseWordCategory() {

		System.out.println("Choose category: 1, Car brands \n 2, Colors \n 3, Animals  ");

		while (wordCategory < 1 || wordCategory > 4) {

			wordCategory = input.nextInt();

			switch (wordCategory) {
			case 1:
				Cars();
			case 2:
				Colors();
			case 3:
				Animals();
			case 4:

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

			for (int i = 0; i < 1; i++) {
				gameWord = (cars.get(random.nextInt(cars.size())));
			}
			gamePlayer();
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

			for (int i = 0; i < 1; i++) {
				gameWord = (colors.get(random.nextInt(colors.size())));
			}
			System.out.println(gameWord);
			gamePlayer();
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

			for (int i = 0; i < 1; i++) {
				gameWord = (animals.get(random.nextInt(animals.size())));
			}
			System.out.println(gameWord);
			gamePlayer();
		}
	}

	public static void gamePlayer() {

		for (int i = 0; i < gameWord.length(); i++) {
			System.out.print("_ ");
		}

		playerGuess = input.nextLine();
		playerGuess = playerGuess.toUpperCase();

		if (!guessedLetters.contains(playerGuess)) {

			guessedLetters.add(playerGuess);

			if (gameWord.contains(playerGuess)) {

			}
			
			else {
				amountWrongs ++;
				
			}

		}

	}

	public static void gameEnder() {

		System.out.println("Type: 1, To play again \n 2, To quit the game");
		while (playAgain < 1 || playAgain > 2) {

			playAgain = input.nextInt();

			if (playAgain == 1) {
				amountWrongs = 0;
				wordCategory = 0;
				gameWord = "";
				playAgain = 0;
				chooseWordCategory();
			} else if (playAgain == 2) {
				System.exit(0);

			}

		}

	}

}
