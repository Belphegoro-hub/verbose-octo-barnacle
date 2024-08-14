package main;
import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int seconds = scanner.nextInt();
		int days = seconds / (60 * 60 *24);
		int hours = (seconds % (60 * 60  * 24)) / (60 * 60);
		int minutes = (seconds % (60 * 60)) / 60;
		int secs = seconds % 60;
		
		System.out.print("\nДней:" + days + " \nЧасов:" + hours + " \nМинут:" + minutes + " \nСекунд:" + secs );
		
		
	}

}
