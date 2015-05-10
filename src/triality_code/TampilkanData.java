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
	System.out.println(BentukRuang(baru.getPanjang(), baru.getLebar()));
	System.out.println("Rasio		: " + HitungRasio(baru.getLuas(), baru.getJmlKursi(),baru.getPanjang(), baru.getLebar()));
	System.out.println(HitungRasionya(baru.getLuas(), baru.getJmlKursi()));
	System.out.println("Jumlah Kursi	: " + baru.getJmlKursi());
	System.out.println("Jumlah Pintu	: " + baru.getJmlPintu());
	System.out.println("Jumlah Kunci Pintu	: " + baru.getKunciPintu());
	System.out.println("Jumlah Jendela	: " + baru.getJmlJendela());
	System.out.println("Jumlah Kunci Jendela: " + baru.getKunciJendela());
	System.out.println(AnalisPintuNjendela(baru.getJmlPintu(), baru.getJmlJendela()));
	System.out.println("=================================================");
}

void TampilkanSarana(){
	System.out.println("===================Sarana Kelas==================");
	System.out.println("Jumlah Stop Kontak : "+baru.getJmlSteker());
	System.out.println("Kondisi Stop Kontak : "+baru.getKondisiSteker());
	System.out.println("Posisi Stop Kontak : "+baru.getPosisiSteker());
	System.out.println(AnalisKelistrikan(baru.getJmlSteker(), baru.getKondisiSteker(), baru.getPosisiSteker()));
	
	System.out.println("Jumlah Kabel LCD : "+baru.getJmlKabelLCD());
	System.out.println("Kondisi Kabel LCD : "+baru.getKondisiKblLCD());
	System.out.println("Posisi Kabel LCD : "+baru.getPosisiKblLCD());
	System.out.println(AnalisLCD(baru.getJmlKabelLCD(), baru.getKondisiKblLCD(), baru.getPosisiKblLCD()));
	
	System.out.println("Jumlah Lampu : "+baru.getJmlLampu());
	System.out.println("Kondisi Lampu : "+baru.getKondisiLampu());
	System.out.println("Posisi Lampu : "+baru.getPosisiLampu());
	System.out.println(AnalisLampu(baru.getJmlLampu(), baru.getKondisiLampu(), baru.getPosisiLampu()));
	
	System.out.println("Jumlah Kipas Angin : "+baru.getJmlKipas());
	System.out.println("Kondisi Kipas Angin : "+baru.getKondisiKipas());
	System.out.println("Posisi Kipas Angin : "+baru.getPosisiKipas());
	System.out.println(AnalisKipas(baru.getJmlKipas(), baru.getKondisiKipas(), baru.getPosisiKipas()));

	System.out.println("Jumlah AC : "+baru.getJmlAC());
	System.out.println("Kondisi AC : "+baru.getKondisiAC());
	System.out.println("Posisi AC : "+baru.getPosisiAC());
	System.out.println(AnalisAC(baru.getJmlAC(), baru.getKondisiAC(), baru.getPosisiAC()));
	
	System.out.println("Pilih SSID : "+baru.getSSID());
	System.out.println("Masuk Bandwith : "+baru.getBandwith());
	System.out.println(AnalisInternet(baru.getSSID(), baru.getLogin()));
	
	System.out.println("Jumlah CCTV : "+baru.getJmlCCTV());
	System.out.println("Kondisi CCTV : "+baru.getKondisiCCTV());
	System.out.println("Posisi CCTV : "+baru.getPosisiCCTV());
	System.out.println(AnalisCCTV(baru.getJmlCCTV(), baru.getKondisiCCTV(), baru.getPosisiCCTV()));
	

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
		System.out.println("Kunci Pintu Ruangan  : "+baru.getKunciPintu());
		System.out.println("Kunci Jendela Ruangan : "+baru.getKunciJendela());
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
