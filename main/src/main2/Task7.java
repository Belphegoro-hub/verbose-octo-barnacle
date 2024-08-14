package main2;
import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum1 = scanner.nextInt();
		int sum2 = scanner.nextInt();
		
		int resul = (sum1 > sum2)? sum1 : sum2;
		
		System.out.print(resul);
		
		scanner.close();
	}

}
