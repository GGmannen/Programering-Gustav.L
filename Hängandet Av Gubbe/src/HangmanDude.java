import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class HangmanDude {

static int amountWrongs = 0;
static int wordCategory = 0;
static String playerGuess = "" ;
static String gameWord = "" ;
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
	
	
}

public static void chooseWordCategory() {
	
	System.out.println("V�lj Kategori: 1, Bilm�rken \n 2, F�rger \n 3, ");
	while (wordCategory < 1 || wordCategory > 4) {
	}
	switch (wordCategory) {
	case 1:
		Cars();
	case 2:
		
	case 3:
		
	case 4:
		
	}

}






}







