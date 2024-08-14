package main;

import java.util.Scanner;

public class Task2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int sum = 0;
		 sum += n % 10;
		 sum += (n / 10) % 10;
		 sum += (n / 100) % 10;
		
		System.out.print(sum);
	}

}
