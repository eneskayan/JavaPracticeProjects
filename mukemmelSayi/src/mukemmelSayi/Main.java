package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number=28;
		int total=0;
		
		for (int i = 1; i < number; i++) {
			if(number %i==0) {
				total+=i;
			}
			else {
				continue;
			}
		}
		
		if (total==number) {
			System.out.println("Sayı mükemmel bir sayıdır.");
		}
		else {
			System.out.println("Sayı la mükemmel bir sayıdır.");

		}
		
		
	}

}
