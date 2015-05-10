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
	
	void KondisiRkelas(){
		System.out.println("Panjang Ruang : ");
		baru.setPanjang(sir.nextInt());
		System.out.println("Lebar Ruang : ");
		baru.setLebar(sir.nextInt());
		System.out.println("Jumlah Kursi : ");
		baru.setJmlKursi(sir.nextInt());
		System.out.println("Jumlah Pintu : ");
		baru.setJmlPintu(sir.nextInt());
		System.out.println("Jumlah Jendela : ");
		baru.setJmlJendela(sir.nextInt());
		
	}
	
	void SaranaRkelas(){
		System.out.println("Jumlah Stop Kontak : ");
		baru.setJmlSteker(sir.nextInt());
		System.out.println("Kondisi Stop Kontak : ");
		baru.setKondisiSteker(sir.next());
		System.out.println("Posisi Stop Kontak : ");
		baru.setPosisiSteker(sir.next());
		
		System.out.println("Jumlah Kabel LCD : ");
		baru.setJmlKabelLCD(sir.nextInt());
		System.out.println("Kondisi Kabel LCD : ");
		baru.setKondisiKblLCD(sir.next());
		System.out.println("Posisi Kabel LCD : ");
		baru.setPosisiKblLCD(sir.next());
		
		System.out.println("Jumlah Lampu : ");
		baru.setJmlLampu(sir.nextInt());
		System.out.println("Kondisi Lampu : ");
		baru.setKondisiLampu(sir.next());
		System.out.println("Posisi Lampu : ");
		baru.setPosisiLampu(sir.next());
		
		System.out.println("Jumlah Kipas Angin : ");
		baru.setJmlKipas(sir.nextInt());
		System.out.println("Kondisi Kipas Angin : ");
		baru.setKondisiKipas(sir.next());
		System.out.println("Posisi Kipas Angin : ");
		baru.setPosisiKipas(sir.next());
		
		System.out.println("Jumlah AC : ");
		baru.setJmlAC(sir.nextInt());
		System.out.println("Kondisi AC : ");
		baru.setKondisiAC(sir.next());
		System.out.println("Posisi AC : ");
		baru.setPosisiAC(sir.next());
		
		System.out.println("Jumlah CCTV : ");
		baru.setJmlCCTV(sir.nextInt());
		System.out.println("Kondisi CCTV : ");
		baru.setKondisiCCTV(sir.next());
		System.out.println("Posisi CCTV : ");
		baru.setPosisiCCTV(sir.next());
		
		System.out.println("Pilih SSID : ");
		baru.setSSID(sir.next());
		System.out.println("Kondisi CCTV : ");
		baru.setBandwith(sir.nextInt());
		
		
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
		baru.setKunciPintu(sir.nextInt());
		System.out.println("Input Kunci Jendela : ");
		baru.setKunciJendela(sir.nextInt());
		System.out.println("Input Intensitas Bahaya : ");
		baru.setBahaya(sir.nextLine());
	}
}
