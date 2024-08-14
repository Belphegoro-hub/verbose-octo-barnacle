package main2;
import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Твой родной мир? ");
		System.out.print(scanner.next().equalsIgnoreCase("Земля")? "Привет Землянин!" : "Привет Инопланетянин!");
		
	}

}
