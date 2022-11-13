package methods2;

public class Main {

	public static void main(String[] args) {

		System.out.println(topla(5, 4));

		System.out.println(topla2(1, 2, 3, 4, 5, 6));

	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static void güncelle() {
		System.out.println("Güncellendi.");
	}

	public static int topla(int i, int j) {
		return i + j;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;

		for (int i : sayilar) {
			toplam += i;
		}
		return toplam;

	}

}