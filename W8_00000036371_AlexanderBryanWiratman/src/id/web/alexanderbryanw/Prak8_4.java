package id.web.alexanderbryanw;
import java.util.Scanner;

public class Prak8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Input banyak data: ");
		int length = scan.nextInt();
		mahasiswa[] maha = new mahasiswa[length];
		for(int i = 0; i < maha.length; i++) {
			maha[i] = new mahasiswa();
		}
		for(int i = 0; i < maha.length; i++) {
			System.out.printf("Data ke-%d\n", i+1);
			System.out.print("Nama: ");
			maha[i].nama = scan.next();
			System.out.print("Jurusan: ");
			maha[i].jurusan = scan.next();
			System.out.print("Nilai: ");
			maha[i].nilai = scan.nextInt();
			if(maha[i].nilai > 100) maha[i].nilai = 0;
			System.out.println();
		}
		System.out.println("Data Mahasiswa UMN");
		System.out.println("===========================================================");
		System.out.println("No		Nama		Jurusan		NilaiPraktikum");
		for(int i = 0; i < maha.length; i++) {
			System.out.printf("%-15d %-20s %-20s %-10d\n", i+1, maha[i].nama, maha[i].jurusan, maha[i].nilai);
		}
		
		
	}

}
