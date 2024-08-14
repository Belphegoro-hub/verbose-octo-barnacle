package main;
import java.util.Scanner;

public class Task3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double sum = scanner.nextDouble();
		
		double rounded = Math.round(sum);
		
		System.out.print(rounded);
	}
	

}
