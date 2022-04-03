package id.web.alexanderbryanw;

public class Prak8_1 {
	enum Status {
		kosong(0), jomblo(1), pacaran(2), menikah(3);

		public int kodeStatus;

		Status(int x) {
			kodeStatus = x;
		}
	}

	public static void main(String[] args) {
		Status x = Status.kosong;
		// dengan menggunakan Status,kosong maka enum akan ditampilkan dengan hasil default pada switch case

		switch (x.kodeStatus) {
		case 1:
			System.out.printf("Status anda adalah %s", x);
			break;
		case 2:
			System.out.printf("Status anda adalah %s", x);
			break;
		case 3:
			System.out.printf("Status anda adalah %s", x);
			break;
		default:
			System.out.printf("Status anda ... nampaknya tidak jelas ...");
			break;

		}
	}

}
