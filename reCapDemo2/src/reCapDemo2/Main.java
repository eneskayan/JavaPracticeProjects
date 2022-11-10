package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 2.3, 6.2 };
		double total = 0;
		double maxNumber = myList[0];
		for (double number : myList) {
			total += number;

			if (number > maxNumber) {
				maxNumber = number;
			}

		}
		System.out.println(total);

		System.out.println("Max number: " + maxNumber);

	}

}
