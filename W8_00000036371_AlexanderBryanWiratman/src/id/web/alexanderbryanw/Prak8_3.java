package id.web.alexanderbryanw;

public class Prak8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mahasiswa[] mhs = new mahasiswa[3];
		mhs[0] = new mahasiswa();
		mhs[1] = new mahasiswa();
		mhs[2] = new mahasiswa();
		
		mhs[0].nama = "Rino Yaohari"; mhs[0].jurusan = "SI";
		mhs[1].nama = "Kevin Anggara"; mhs[1].jurusan = "DKV";
		mhs[2].nama = "Olivia Leanartha"; mhs[2].jurusan = "ILKOM";
		
		System.out.println("Data 3 orang mahasiswa UMN\n");
		System.out.println("Nama							Jurusan");
		for(int i = 0; i < 3; i++) {
			System.out.printf("%-20s %-10s\n", mhs[i].nama, mhs[i].jurusan);
		}
	}
}
