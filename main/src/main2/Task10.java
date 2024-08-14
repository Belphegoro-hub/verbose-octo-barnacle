package main2;
import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите координату x: ");
        int x = scanner.nextInt();

        System.out.print("Введите координату y: ");
        int y = scanner.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Точка находится в начале координат");
        } else if (x == 0) {
            System.out.println("Точка находится на оси x");
        } else if (y == 0) {
            System.out.println("Точка находится на оси y");
        } else if (x > 0 && y > 0) {
            System.out.println("Точка находится в первой четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится во второй четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в третьей четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в четвертой четверти");
        }
        scanner.close();
	}

}
