package inventanity;

import java.util.Scanner;

public class ProsesRkelas {
	Scanner sir = new Scanner(System.in);
	RuangKelas baru = new RuangKelas();

	void IdentifiRkelas() {
		System.out.println("Nama Ruang : ");
		baru.setNamaRuang(sir.nextLine());
		System.out.println("Lokasi : ");
		baru.setLokasi(sir.nextLine());
		System.out.println("Fakultas : ");
		baru.setFakultas(sir.nextLine());
		System.out.println("Program Studi : ");
		baru.setProdi(sir.nextLine());
		System.out.println("=============================");
	}

	void KondisiRkelas() {
		System.out.println("Panjang Ruang : ");
		baru.setPanjang(sir.nextDouble());
		System.out.println("Lebar Ruang : ");
		baru.setLebar(sir.nextDouble());
		System.out.println("Jumlah Pintu : ");
		baru.setJumlahPintu(sir.nextDouble());
		System.out.println("Jumlah Jendela : ");
		baru.setJumlahJendela(sir.nextDouble());
		System.out.println("Jumlah Kursi : ");
		baru.setJumlahKursi(sir.nextDouble());
		System.out.println("Jumlah Kabel LCD : ");
		baru.setJmlKabelLCD(sir.nextDouble());
		System.out.println("Jumlah Lampu : ");
		baru.setJumlahLampu(sir.nextDouble());
		System.out.println("Jumlah AC : ");
		baru.setJumlahAC(sir.nextDouble());
		System.out.println("=============================");

	}

	void Output() {
		System.out.println(" Hasil Luas		: " + baru.HitungLuas());
		System.out.println(" Hasil Rasio Luas	: " + baru.HitungRasio());
		System.out.println("=============================");
	}

	void Tampil() {
		System.out.println("Nama Ruang	: " + baru.getNamaRuang());
		System.out.println("Lokasi		: " + baru.getLokasi());
		System.out.println("Fakultas	: " + baru.getFakultas());
		System.out.println("Program Studi	: " + baru.getProdi());
		System.out.println("Panjang Ruang	: " + baru.getPanjang());
		System.out.println("Lebar Ruang	: " + baru.getLebar());
		System.out.println("Jumlah Pintu	: " + baru.getJumlahPintu());
		System.out.println("Jumlah Jendela	: " + baru.getJumlahJendela());
		System.out.println("Jumlah Kursi	: " + baru.getJumlahKursi());
		System.out.println("Jumlah Kabel LCD: " + baru.getJmlKabelLCD());
		System.out.println("Jumlah Lampu	: " + baru.getJumlahLampu());
		System.out.println("Jumlah AC	: " + baru.getJumlahAC());
		System.out.println("=============================");
	}
}
