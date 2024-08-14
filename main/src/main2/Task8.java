package main2;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int  x = scanner.nextInt();
		
		String resul = (x % 5 == 0)? "Кратно" : "Не кратно";
		System.out.print(resul);
		
		scanner.close();
	}

}
