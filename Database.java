
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Scanner;

public class Database {
	static Scanner konsol = Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("ho�geldiniz");
		System.out.println("kay�t olmak i�in1");
		System.out.println("giri� yapmak i�in 2");
		System.out.println("c�k�s yapmak 3");
		int secenek = konsol.nextInt();
		switch (secenek) {

		case 1:
			kay�t01();
			break;
		case 2:
			giri�Yap();
			break;
		case 3:
			break;
		default:

			System.out.println("yanl�s bir tu�a bast�n�z");
			break;

		}

	}

	private static Scanner Scanner(<System.in) {
		// TODO Auto-generated method stub
		
	}

	public static void kay�t01() throws IOException {
		System.out.println("l�tfen kullan�c� ad� giriniz");
		String kullan�c�Ad� = konsol.next();

		System.out.println("l�tfen �ifre giriniz giriniz");
		String �ifre = konsol.next();

		System.out.println("l�tfen ad�n�z�  giriniz");
		String isim = konsol.next();

		System.out.println("l�tfen soyad�n�z� giriniz");
		String soyad = konsol.next();

		Writer r = new FileWriter("kullan�c�lar.cvs", true);
		r.write(kullan�c�Ad� + ";" + �ifre + ";" + isim + ";" + soyad);
		r.close();
	}

	public static void giri�Yap() {

	}
}
