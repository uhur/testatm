import java.util.Scanner;

public class ATMolayg�ns� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int bakiye = 1000;
		int islem;
		int miktar;

		System.out.println("1:bakiye g�r�nt�le");
		System.out.println("2:para yat�rma ");
		System.out.println("3:para �ekme");
		System.out.println("4:sistemden ��k��");

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
			System.out.println("ne kadar yat�racaks�n�z?");
			miktar = scan.nextInt();
			break;

			System.out.println("bakiyeniz" + bakiye + "tl dir");
			break;
		case 4:
			System.out.println("sistemden c�k�l�yor");
			break;
		default:
			System.out.println("gecersiz i�lem");
			break;
		}
	}
}
