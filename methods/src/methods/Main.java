package methods;

public class Main {
	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {

		int[] sayi = new int[] { 1, 2, 5, 7, 9, 0 };
		int arananSayi = 3;
		boolean isOK = false;

		for (int i : sayi) {
			if (arananSayi == i) {
				isOK = true;
			}
		}
		String mesaj = "";
		if (isOK) {
			mesaj = ("Sayı arrayin içerisindedir.");
			mesajVer(mesaj);
		} else {
			mesaj = ("Sayı arrayin içerisinde değildir.");
			mesajVer(mesaj);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}