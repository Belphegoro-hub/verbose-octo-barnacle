package main;
import java.util.Scanner;


public class Task {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int division = x / y;
		int remains = x % y;
		double root = Math.sqrt(x);
		System.out.println(division + "\n" +  remains + "\n"  + root);
		//System.out.println(remains);
		//System.out.println(root);
		
	}

}
