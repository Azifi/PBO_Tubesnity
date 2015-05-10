package triality_code;

import java.util.Scanner;

public class TampilkanData extends PropertiesRkelas {
RuangKelas baru = new RuangKelas();
Scanner scan = new Scanner(System.in);
	
	void TampilkanIdentitas(){
		System.out.println("=================Identitas Kelas=================");
		System.out.println("Nama Ruang	: " + baru.getNamaRuang());
		System.out.println("Lokasi		: " + baru.getLokasi());
		System.out.println("Fakultas	: " + baru.getFakultas());
		System.out.println("Program Studi	: " + baru.getProdi());
		System.out.println("=================================================");
	}
	void TampilkanKondisi(){
		System.out.println("==================Kondisi Kelas==================");
		System.out.println("Panjang	: " + baru.getPanjang());
		System.out.println("Lebar		: " + baru.getLebar());
		System.out.println("Luas		: " + HitungLuas(baru.getPanjang(), baru.getLebar()));
		System.out.println("Rasio		: " + HitungRasio(baru.getLuas(), baru.getJmlKursi(),baru.getPanjang(), baru.getLebar()));
		System.out.println("Jumlah Kursi	: " + baru.getJmlKursi());
		System.out.println("Jumlah Pintu	: " + baru.getJmlPintu());
		System.out.println("Jumlah Jendela	: " + baru.getJmlJendela());
		System.out.println("=================================================");
	}
	
	void TampilKenyamanan(){
		System.out.println("==================Kenyamanan Kelas===============");
		System.out.println("Kebisingan : "+baru.getKeBisingan());
		System.out.println("Kondisi Bau Ruangan : "+baru.getBau());
		System.out.println("Kebocoran : "+baru.getBocor());
		System.out.println("Kerusakan Ruangan : "+baru.getKeRusakan());
		System.out.println("Kondisi AUS Ruangan : "+baru.getKeAusan());
		System.out.println("=================================================");
	}
	
	void TampilKeamanan(){
		boolean ulang=false;
		while(ulang==false){
			
		System.out.println("==================Kondisi Kelas==================");
		System.out.println("Kekokohan Ruangan : "+baru.getKeKokohan());
		System.out.println("Kunci Pintu Ruangan  : "+baru.getPintuBkunci());
		System.out.println("Kunci Jendela Ruangan : "+baru.getJendelaBkunci());
		System.out.println("Intensitas Bahaya Ruangan : "+baru.getBahaya());
		System.out.println("=================================================");
		System.out.println("\nIngin Edit ? (y/n)");
		if(scan.next().equalsIgnoreCase("y")){
			ulang=false;
		}else{
			ulang=true;
			break;
		}
	}
		System.out.println("########");
	}
}
