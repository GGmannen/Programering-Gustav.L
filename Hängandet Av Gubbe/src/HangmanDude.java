import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class HangmanDude {

	static Random random = new Random();
	static int amountWrongs = 0;
	static int maxWrongs = 8;
	static int wordCategory = 0;
	static String playerGuess = "";
	static String gameWord;
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);
	static int playAgain;
	
	
	public static void main(String[] args) {
		welcomer();

	}

	public static void welcomer() {
		System.out.println("Välkommen till ett spel som handlar om hängandet av en gubbe!");
		System.out.println("Du kommer att få gissa på bokstäver i ord");
		System.out.println("Gissar du fel så kommer gubben gradvis att hängas");
		System.out.println("Du gissar på en bokstav i taget, gissar du rätt på ordet så vinner du spelet");
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
			cars.add("Volvo");
			cars.add("Porsche");
			cars.add("Mazda");
			cars.add("Corvette");
			cars.add("Koenigsegg");
			cars.add("Bugatti");
			cars.add("Mercedes");
			cars.add("Lamborghini");
			cars.add("Mclaren");
			cars.add("Hennesey");
			cars.add("Rimac");
			cars.add("Maserati");
			cars.add("Saab");
			

			for (int i = 0; i < 1; i++) {
				gameWord = (cars.get(random.nextInt(cars.size())));
			}
			gamePlayer();
		}

	}

	public static void Colors() {

		if (wordCategory == 2) {

			ArrayList<String> colors = new ArrayList<String>();
			colors.add("Yellow");
			colors.add("Pink");
			colors.add("Blue");
			colors.add("Purple");
			colors.add("Green");
			colors.add("Black");
			colors.add("Brown");
			colors.add("Orange");
			colors.add("White");
			colors.add("Red");
			colors.add("Turquoise");

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
			animals.add("Tiger");
			animals.add("Panda");
			animals.add("Cat");
			animals.add("Dog");
			animals.add("Parrot");
			animals.add("Rabbit");
			animals.add("Horse");
			animals.add("Spider");
			animals.add("Gorilla");
			animals.add("Hamster");
			animals.add("Pig");
			animals.add("Cow");
			animals.add("Elephant");
			animals.add("Giraffe");
			animals.add("Mouse");
			animals.add("Rat");

			for (int i = 0; i < 1; i++) {
				gameWord = (animals.get(random.nextInt(animals.size())));
			}
			System.out.println(gameWord);
			gamePlayer();
		}
	}
	
	public static void gamePlayer() {
																																																			
		
		
	}

	
	public static void gameEnder() {
		
		System.out.println("Type: 1, To play again \n 2, to quit the game");
		while(playAgain < 1 || playAgain > 2 ) {
			
			playAgain = input.nextInt();
			
			if(playAgain == 1) {
				amountWrongs = 0;
				wordCategory = 0;
				gameWord = "";
				playAgain = 0;
				chooseWordCategory();
			}
			else if(playAgain == 2) {
				System.exit(0);
				
			}
			
		}
		
	}
	
	
	
	
}
