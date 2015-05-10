package triality_code;

import java.util.Scanner;

public class MasukanData {
	Scanner sir = new Scanner(System.in);
	RuangKelas baru = new RuangKelas();
	
	void IdentitasRkelas(){
		System.out.println("Nama Ruang : ");
		baru.setNamaRuang(sir.nextLine());
		System.out.println("Lokasi : ");
		baru.setLokasi(sir.nextLine());
		System.out.println("Fakultas : ");
		baru.setFakultas(sir.nextLine());
		System.out.println("Program Studi : ");
		baru.setProdi(sir.nextLine());
	}
	
	void KenyamananKelas(){
		System.out.println("Input Kebisingan : ");
		baru.setKeBisingan(sir.nextLine());
		System.out.println("Input Intensitas Bau : ");
		baru.setBau(sir.nextLine());
		System.out.println("Input Kondisi Kebocoran : ");
		baru.setBocor(sir.nextLine());
		System.out.println("Input Kerusakan : ");
		baru.setKeRusakan(sir.nextLine());
		System.out.println("Input Intensitas AUS : ");
		baru.setKeAusan(sir.nextLine());
	}
	
	void KeamananKelas(){
		System.out.println("Input Kekokohan : ");
		baru.setKeKokohan(sir.nextLine());
		System.out.println("Input Kunci Pintu : ");
		baru.setPintuBkunci(sir.nextLine());
		System.out.println("Input Kunci Jendela : ");
		baru.setJendelaBkunci(sir.nextLine());
		System.out.println("Input Intensitas Bahaya : ");
		baru.setBahaya(sir.nextLine());
	}
}
