package triality_code;

import java.util.Scanner;

public class RkelasMain {
	private static Scanner pufft;

	public static void main(String[] auch){
		pufft = new Scanner (System.in);
		MasukanData masukin = new MasukanData();
		masukin.IdentitasRkelas();
		masukin.KondisiRkelas();
		masukin.SaranaRkelas();
		masukin.LingkunganRkelas();
		masukin.KebersiahanRkelas();
		masukin.KenyamananRkelas();
		masukin.KeamananRkelas();
		
		TampilkanData oper = new TampilkanData();
		oper.TampilkanIdentitas();
		oper.TampilkanKondisi();
		oper.TampilkanSarana();
		oper.TampilkanLingkungan();
		oper.TampilkanKebersihan();
		oper.TampilKenyamanan();
		oper.TampilKeamanan();		
		
	}
}
