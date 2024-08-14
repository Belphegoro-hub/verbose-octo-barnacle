package main2;
import java.util.Scanner;

public class Task4 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Секунды: ");
	        int sum = scanner.nextInt();
	        System.out.print("Минуты: ");
	        int sum2 = scanner.nextInt();
	        System.out.print("Часы: ");
	        int sum3 = scanner.nextInt();

	        int secundesMax = 59;
	        int minutesMax = 59;
	        int hourMax = 23;

	        if (sum >= 0 && sum <= secundesMax) {
	            System.out.println(sum);
	        } else {
	            System.out.print("Ошибка секунд ");
	        }

	        if (sum2 >= 0 && sum2 <= minutesMax) {
	            System.out.println(sum2);
	        } else {
	            System.out.print("Ошибка минут ");
	        }

	        if (sum3 >= 0 && sum3 <= hourMax) {
	            System.out.println(sum3);
	        } else {
	            System.out.print("Ошибка Часов ");
	        }

	        scanner.close();
	    }
}
