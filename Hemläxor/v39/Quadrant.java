import java.util.Scanner;

public class Quadrant {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("skriv ett X v�rde");
		int x = input.nextInt();
		
		System.out.println("skriv ett Y v�rde");
		int y = input.nextInt();
		
		if((x > 0) && (y > 0)) {
			System.out.println("Quadrant 1");
		}
		if((x < 0)&&(y > 0)) {
		System.out.println("Quadrant 2");
	}
		if((x > 0)&&(y < 0)) {
			System.out.println("Quadrant 3");
		}
		if((x < 0)&&(y < 0)) {
			System.out.println("Quadrant 4");
		}
		
		
	}

}
