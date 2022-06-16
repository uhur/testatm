
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Scanner;

public class Database {
	static Scanner konsol = Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.println("hoþgeldiniz");
		System.out.println("kayýt olmak için1");
		System.out.println("giriþ yapmak için 2");
		System.out.println("cýkýs yapmak 3");
		int secenek = konsol.nextInt();
		switch (secenek) {

		case 1:
			kayýt01();
			break;
		case 2:
			giriþYap();
			break;
		case 3:
			break;
		default:

			System.out.println("yanlýs bir tuþa bastýnýz");
			break;

		}

	}

	private static Scanner Scanner(<System.in) {
		// TODO Auto-generated method stub
		
	}

	public static void kayýt01() throws IOException {
		System.out.println("lütfen kullanýcý adý giriniz");
		String kullanýcýAdý = konsol.next();

		System.out.println("lütfen þifre giriniz giriniz");
		String þifre = konsol.next();

		System.out.println("lütfen adýnýzý  giriniz");
		String isim = konsol.next();

		System.out.println("lütfen soyadýnýzý giriniz");
		String soyad = konsol.next();

		Writer r = new FileWriter("kullanýcýlar.cvs", true);
		r.write(kullanýcýAdý + ";" + þifre + ";" + isim + ";" + soyad);
		r.close();
	}

	public static void giriþYap() {

	}
}
