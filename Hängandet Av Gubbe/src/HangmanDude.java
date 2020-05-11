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
	System.out.println("Välkommen till ett spel som handlar om hängandet av en gubbe!");
	System.out.println("Du kommer att få gissa på bokstäver i ord");
	System.out.println("Gissar du fel så kommer gubben gradvis att hängas");
	System.out.println("Du gissar på en bokstav i taget, gissar du rätt på ordet så vinner du spelet");
	System.out.println("GLHF!");
	
	
}

public static void chooseWordCategory() {
	
	System.out.println("Välj Kategori: 1, Bilmärken \n 2, Färger \n 3, ");
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







