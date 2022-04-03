package id.web.alexanderbryanw;

import java.util.Scanner;

public class Prak8_2 {
	enum Status {
		jomblo(1), pacaran(2), menikah(3);

		public int kodeStatus;

		Status(int x) {
			kodeStatus = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Selamat datang di program penembak status UMN!");
		System.out.println("Apa yang sedang anda rasakan saat ini?");
		System.out.println("1. Bosan\n2. Sedih\n3. Lelah");
		System.out.print("Pilihan anda: ");
		int pilihan = scan.nextInt();
		Status x;
		if (pilihan == 1) {
			x = Status.jomblo;
			System.out.printf("Status anda adalah %s", x);
		} else if (pilihan == 2) {
			x = Status.pacaran;
			System.out.printf("Status anda adalah %s", x);
		} else if (pilihan == 3) {
			x = Status.menikah;
			System.out.printf("Status anda adalah %s", x);
		} else {
			System.out.println("Status anda ... nampaknya tidak jelas ...");
		}
	}
}
