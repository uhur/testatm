import java.util.Scanner;

public class ATMolaygönsü {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int bakiye = 1000;
		int islem;
		int miktar;

		System.out.println("1:bakiye görüntüle");
		System.out.println("2:para yatýrma ");
		System.out.println("3:para çekme");
		System.out.println("4:sistemden çýkýþ");

		islem = scan.nextInt();

		switch (islem) {
		case 1:
			System.out.println("bakiyeniz:" + bakiye + " tl dir");
			break;

		case 2:
			System.out.println("ne kadar cekeceksiniz");
			int miktar = scan.nextInt();
			break;

			bakiye += scan.nextInt();
			System.out.println("bakiyeniz" + bakiye + " tl dir ");
		case 3:
			System.out.println("ne kadar yatýracaksýnýz?");
			miktar = scan.nextInt();
			break;

			System.out.println("bakiyeniz" + bakiye + "tl dir");
			break;
		case 4:
			System.out.println("sistemden cýkýlýyor");
			break;
		default:
			System.out.println("gecersiz iþlem");
			break;
		}
	}
}
