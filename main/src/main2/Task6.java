package main2;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите первое число: ");
		int sum1 = scanner.nextInt();
		System.out.println("Введите второе число: ");
		int sum2 = scanner.nextInt();
		int resul;
		
		
		System.out.println("Что?(+ - / *) ");
		String operator = scanner.next();
		
		switch(operator) {
		case "+":
			resul = sum1 + sum2;
			System.out.print(resul);
			break;
		case "-":
			resul = sum1 - sum2;
			System.out.print(resul);
			break;
		case "/":
			resul = sum1 / sum2;
			System.out.print(resul);
			break;
		case "*":
			resul = sum1 * sum2;
			System.out.print(resul);
			break;
		default:
		    System.out.print("Ошибка");
		    break;
		}
		scanner.close();
	}

}
