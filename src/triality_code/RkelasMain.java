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
		masukin.KenyamananKelas();
		masukin.KeamananKelas();
		
		TampilkanData oper = new TampilkanData();
		oper.TampilkanIdentitas();
		oper.TampilkanKondisi();
		oper.TampilkanSarana();
		oper.TampilKenyamanan();
		oper.TampilKeamanan();		
		
	}
}
