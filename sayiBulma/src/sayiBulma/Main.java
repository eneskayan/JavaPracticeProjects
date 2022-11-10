package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] sayi = new int[]{1,2,5,7,9,0};
		int arananSayi=0;
		boolean isOK= false;
		
		for (int i:sayi) {
			if (arananSayi==i) {
				isOK=true;
			}
		}
		
		if(isOK) {
			System.out.println("Sayı arrayin içerisindedir.");
		}
		else {
			System.out.println("Sayı arrayin içerisinde değildir.");
		}
		
		
	}

}
