package main2;
import java.util.Scanner;

public class Task3 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int x = scanner.nextInt();
		
		if(x < 0) {
			System.out.print("|" + x + "| = " +(-x) );
		}else {
			System.out.print("|" + x + "| = " + x);
		}
		scanner.close();
	}

}
