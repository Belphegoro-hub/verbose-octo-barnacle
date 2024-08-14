package main2;
import java.util.Scanner;

public class Task1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите число: ");
		
		int x = scanner.nextInt();
		
		if(x < 0) {
			System.out.print("Отрицательное");
		}if(x > 0) {
			System.out.print("Положительное");
		}if(x == 0) {
			System.out.print("Ноль");
		}
		scanner.close();
	}

}
