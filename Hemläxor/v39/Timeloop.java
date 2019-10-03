import java.util.Scanner;

public class Timeloop {

	public static void main(String[]args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange Värde");
		int x = input.nextInt();
		
		
		for (int i = 1; i <= x; i++) {
			System.out.println(i +" \t " + "Abracadabra");
		}
		
		}
	}
	
