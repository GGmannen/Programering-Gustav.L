import java.util.Scanner;
public class v37{
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Vad heter du?");
		
		String Namn = input.nextLine();
		
		/*
		System.out.println(Namn);
		 
		 */
		
		System.out.println("Hur gammal är du?");
		String Ålder = input.nextLine();
		
		System.out.println("Vilken adress bor du på?");
		String Adress = input.nextLine();
		
		System.out.println("Vad är din postkod?");
		String Postkod = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String Stad = input.nextLine();
		
		System.out.println("Ange ditt telefonnummer");
		String Nummer = input.nextLine();
		
		System.out.println("Ditt namn: " + " \t " + Namn);
		System.out.println("Din ålder: "  + " \t " + Ålder);
		System.out.println("Din adress: " + " \t "  + Adress);
		System.out.println("Din postkod: " + " \t "  + Postkod);
		System.out.println("Din hemstad: " + " \t "  + Stad);
		System.out.println("Ditt nummer: " + " \t "  + Nummer);
		
	
	}
	
}
