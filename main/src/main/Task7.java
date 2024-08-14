package main;
import java.util.Scanner;


public class Task7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double sum = scanner.nextDouble();
		double percent = scanner.nextDouble();
		
		double finalsum = sum + (sum * percent /100 * 2);
		
		System.out.print(finalsum);
	}

}
