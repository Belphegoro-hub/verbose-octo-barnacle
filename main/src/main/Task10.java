package main;

public class Task10 {
	public static void main(String[] args) {
		
		final double weight = 70;
		final double height = 170;
		
		double idealweight = height - 110;
		double difference = idealweight - weight;
		
		System.out.print("Идеальный вес " + idealweight + " кг " );
		System.out.print(difference > 0?   "Нужно набрать" + difference + "кг" : difference < 0? "Нужно сбросить" + Math.abs(difference) + "кг" : "Твой вес идеальный" );
			}

}
