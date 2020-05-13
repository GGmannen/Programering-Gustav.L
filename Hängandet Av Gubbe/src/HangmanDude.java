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

	public static void main(String[] args) {
		welcomer();

	}

	public static void welcomer() {
		System.out.println("V�lkommen till ett spel som handlar om h�ngandet av en gubbe!");
		System.out.println("Du kommer att f� gissa p� bokst�ver i ord");
		System.out.println("Gissar du fel s� kommer gubben gradvis att h�ngas");
		System.out.println("Du gissar p� en bokstav i taget, gissar du r�tt p� ordet s� vinner du spelet");
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

			ArrayList<String> colors = new ArrayList<String>();
			colors.add("Tiger");
			colors.add("Panda");
			colors.add("Cat");
			colors.add("Dog");
			colors.add("Parrot");
			colors.add("Rabbit");
			colors.add("Horse");
			colors.add("Spider");
			colors.add("Gorilla");
			colors.add("Hamster");
			colors.add("Pig");
			colors.add("Cow");
			colors.add("Elephant");
			colors.add("Giraffe");
			colors.add("Mouse");
			colors.add("Rat");

			for (int i = 0; i < 1; i++) {
				gameWord = (colors.get(random.nextInt(colors.size())));
			}
			System.out.println(gameWord);
			gamePlayer();
		}
	}
	
	public static void gamePlayer() {

		
		
	}

}
