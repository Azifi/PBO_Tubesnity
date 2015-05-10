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
}
