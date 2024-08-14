package main2;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		if(x >= 0 && x <= 120) {
			System.out.print("Вам " + x + " лет");
		}else {
			System.out.print("Ошибка");
		}
		scanner.close();
	}

}
