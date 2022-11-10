package sesliHarfler;

public class Main {
//1.Kalın ünlüler: a, ı, o, u. 2.İnce ünlüler: e, i, ö, ü
	public static void main(String[] args) {
		char harf = 'O';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Harf kalın seslidir.");
			break;
		default:
			System.out.println("Harf ince seslidir.");
		}
	}
}