package triality_code;

import java.util.Scanner;

public class RkelasMain {
	public static void main(String[] auch){
		Scanner pufft = new Scanner (System.in);
		PropertiesRkelas nampil = new PropertiesRkelas(); 
		RuangKelas Oper = new RuangKelas();
		
		System.out.println("Masukan Panjang : ");
		Oper.setPanjang(pufft.nextInt());
		System.out.println("Masukan Lebar : ");
		Oper.setLebar(pufft.nextInt());
		System.out.println("Masukan Jumlah Kursi : ");
		Oper.setJmlKursi(pufft.nextInt());
		
		System.out.println(nampil.HitungLuas(Oper.getPanjang(), Oper.getLebar()));
		System.out.println(nampil.BentukRuang(Oper.getPanjang(), Oper.getLebar()));
		System.out.println(nampil.HitungRasio(Oper.getLuas(), Oper.getJmlKursi(),Oper.getPanjang(), Oper.getLebar()));
		System.out.println(nampil.HitungRasionya(Oper.getLuas(), Oper.getJmlKursi()));
	}
}
