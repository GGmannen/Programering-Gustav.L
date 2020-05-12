import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class HangmanDude {

	
	static Random random = new Random();
	static int amountWrongs = 0;
	static int wordCategory = 0;
	static String playerGuess = "";
	static String gameWord;
	static Random rand = new Random();
	static Scanner input = new Scanner(System.in);

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

		System.out.println("Välj Kategori: 1, Bilmärken \n 2, Färger \n 3,  ");
		
		while (wordCategory < 1 || wordCategory > 4) {
		}
		
		wordCategory = input.nextInt();
		
		switch (wordCategory) {
		case 1:
			Cars();
		case 2:
			Colors();
		case 3:

		case 4:

		}

	}

	public static void Cars() {

			
		if(wordCategory == 1) {
			
		
		
			ArrayList<String> cars = new ArrayList<String>();
			cars.add("Volvo");
			cars.add("Porsche");
			cars.add("Mazda");
			cars.add("Corvette");
			cars.add("Koenigsegg");
			cars.add("Bugatti");

			for (int i = 0; i < 1; i++) {
				gameWord = (cars.get(random.nextInt(cars.size())));
			}
			System.out.println(gameWord);
		}

	}

	
	public static void Colors() {
		
		
			
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
			
			for (int i = 0; i < 1; i++) {
				gameWord = (colors.get(random.nextInt(colors.size())));
			}
			System.out.println(gameWord);
			
		
		
		
	}
	
	
	
	
}
