package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1=20;
		int sayi2=25;
		int sayi3=222;
		int maxSayi=0;
		
		for (int i = 0; i <3; i++) {
			
			if(sayi1>maxSayi) {
				maxSayi=sayi1;
			}
			
			else if(sayi2>maxSayi) {
				maxSayi=sayi2;
			}
			
			else if (sayi3>maxSayi){
				maxSayi=sayi3;
			}
		}
		System.out.println("Max sayı: " + maxSayi);
		
		///////////////////
		
		int enBuyukSayi=sayi1;
		
		if (sayi2>enBuyukSayi) {
			enBuyukSayi=sayi2;
		}
		
		if (sayi3>enBuyukSayi) {
			enBuyukSayi=sayi3;
		}
		System.out.println("En Buyuk Sayi sayı: " + enBuyukSayi);

	}

}
