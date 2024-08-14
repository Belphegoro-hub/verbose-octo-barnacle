package main;
import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double sum = scanner.nextDouble();
		String resul = (sum % 1 == 0)? "Не имеет":"Имеет вещественную часть";
		System.out.print(resul);
		
	}

}
