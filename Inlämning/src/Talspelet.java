import java.util.Random;
import java.util.Scanner;


public class Talspelet {
	
	static Random rand = new Random();
	static int Guesses = 0;
	
	
	public static void main(String[]args) {
		Difficulty();
		
		
	}
	
	public static void Difficulty() {
		System.out.println("V�lj en sv�rhetsgrad: \n 1, Easy \n 2, Medium \n 3, Sv�r \n 4, Om�jlig");
		System.out.println("Skriv en siffra fr�n 1-4");
		
		
	}
	
	
	
	
	
	public static int Easy() {
		int EasyAnswear = rand.nextInt(20) + 1;
		System.out.println(EasyAnswear);
		
		while (Guesses != EasyAnswear) {
			System.out.println("Skriv in en siffra: ");
			Guesses++;
			
		}
		
		
		return EasyAnswear;
	}	
	}
	
