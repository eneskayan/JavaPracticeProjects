package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 25;
		int remainder=0;
		//System.out.println(remainder);
		//asal sayı 1 ve kendisi hariç böleni olmayan sayıdır.

		for (int i = 2; i < number; i++) {

			remainder = number%i;

			if (remainder==0) {
				break;
			}
			
			else{
				remainder=1;
			}
			
		}
		
		if(remainder==1) {
			System.out.println("Bu sayı bir asal sayı: " + number);}
		
		else {
			System.out.println("Bu sayı asal sayı değil: " + number);
		}
	}
}