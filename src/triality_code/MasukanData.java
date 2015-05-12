package triality_code;

import java.util.Scanner;

public class MasukanData extends RuangKelas{
	Scanner Pufft = new Scanner(System.in);
	
	public MasukanData(String NamaRuang, String Lokasi, String Fakultas,
			String Prodi, String KondisiSteker, String KondisiKblLCD,
			String KondisiLampu, String KondisiAC, String KondisiKipas,
			String KondisiCCTV, String KondisiLante, String KondisiDinding,
			String KondisiAtap, String KondisiPintu, String KondisiJendela,
			String SirkulaUdara, String Login, String SSID,
			String PosisiSteker, String PosisiKblLCD, String PosisiLampu,
			String PosisiAC, String PosisiKipas, String PosisiCCTV,
			String KeBisingan, String Bau, String Bocor, String KeRusakan,
			String KeAusan, String KeKokohan, String Bahaya, int JmlPintu,
			int JmlJendela, int JmlKursi, int JmlSteker, int JmlKabelLCD,
			int JmlLampu, int JmlAC, int JmlKipas, int JmlCCTV,
			int NilaiCahaya, int KeLembapan, int Suhu, int KunciPintu,
			int KunciJendela, double Panjang, double Lebar, double Luas,
			double Bandwith) {
		super(NamaRuang, Lokasi, Fakultas, Prodi, KondisiSteker, KondisiKblLCD,
				KondisiLampu, KondisiAC, KondisiKipas, KondisiCCTV,
				KondisiLante, KondisiDinding, KondisiAtap, KondisiPintu,
				KondisiJendela, SirkulaUdara, Login, SSID, PosisiSteker,
				PosisiKblLCD, PosisiLampu, PosisiAC, PosisiKipas, PosisiCCTV,
				KeBisingan, Bau, Bocor, KeRusakan, KeAusan, KeKokohan, Bahaya,
				JmlPintu, JmlJendela, JmlKursi, JmlSteker, JmlKabelLCD,
				JmlLampu, JmlAC, JmlKipas, JmlCCTV, NilaiCahaya, KeLembapan,
				Suhu, KunciPintu, KunciJendela, Panjang, Lebar, Luas, Bandwith);
	}
	
	@Override
	void IdentitasRkelas(String NamaRuang, String Lokasi, String Fakultas, String Prodi){
		System.out.println("Nama Ruang : ");
		super.setNamaRuang(Pufft.nextLine());
		System.out.println("Lokasi : ");
		super.setLokasi(Pufft.nextLine());
		System.out.println("Fakultas : ");
		super.setFakultas(Pufft.nextLine());
		System.out.println("Program Studi : ");
		super.setProdi(Pufft.nextLine());
	}
	
	@Override
	void KondisiRkelas(int Panjang, int Lebar, int JmlKursi, int JmlPintu, int JmlJendela){
		System.out.println("Panjang Ruang : ");
		super.setPanjang(Pufft.nextInt());
		System.out.println("Lebar Ruang : ");
		super.setLebar(Pufft.nextInt());
		System.out.println("Jumlah Kursi : ");
		super.setJmlKursi(Pufft.nextInt());
		System.out.println("Jumlah Pintu : ");
		super.setJmlPintu(Pufft.nextInt());
		System.out.println("Jumlah Jendela : ");
		super.setJmlJendela(Pufft.nextInt());
		
	}
	
	void SaranaRkelas(int JmlSteker, String KondisiSteker, String PosisiSteker, int JmlKabelLCD, 
			String KondisiKabelLCD, String PosisiKabelLCD, int JmlLampu, String KondisiLampu, 
			String PosisiLampu, int JmlKipas, String KondisiKipas, String PosisiKipas, int JmlAC, 
			String KondisiAC, String PosisiAC, int JmlCCTV, String KondisiCCTV, String PosisiCCTV, String SSID, int Bandwith){
		System.out.println("Jumlah Stop Kontak : ");
		super.setJmlSteker(Pufft.nextInt());
		System.out.println("Kondisi Stop Kontak : ");
		super.setKondisiSteker(Pufft.next());
		System.out.println("Posisi Stop Kontak : ");
		super.setPosisiSteker(Pufft.next());
		
		System.out.println("Jumlah Kabel LCD : ");
		super.setJmlKabelLCD(Pufft.nextInt());
		System.out.println("Kondisi Kabel LCD : ");
		super.setKondisiKblLCD(Pufft.next());
		System.out.println("Posisi Kabel LCD : ");
		super.setPosisiKblLCD(Pufft.next());
		
		System.out.println("Jumlah Lampu : ");
		super.setJmlLampu(Pufft.nextInt());
		System.out.println("Kondisi Lampu : ");
		super.setKondisiLampu(Pufft.next());
		System.out.println("Posisi Lampu : ");
		super.setPosisiLampu(Pufft.next());
		
		System.out.println("Jumlah Kipas Angin : ");
		super.setJmlKipas(Pufft.nextInt());
		System.out.println("Kondisi Kipas Angin : ");
		super.setKondisiKipas(Pufft.next());
		System.out.println("Posisi Kipas Angin : ");
		super.setPosisiKipas(Pufft.next());
		
		System.out.println("Jumlah AC : ");
		super.setJmlAC(Pufft.nextInt());
		System.out.println("Kondisi AC : ");
		super.setKondisiAC(Pufft.next());
		System.out.println("Posisi AC : ");
		super.setPosisiAC(Pufft.next());
		
		System.out.println("Jumlah CCTV : ");
		super.setJmlCCTV(Pufft.nextInt());
		System.out.println("Kondisi CCTV : ");
		super.setKondisiCCTV(Pufft.next());
		System.out.println("Posisi CCTV : ");
		super.setPosisiCCTV(Pufft.next());
		
		System.out.println("Pilih SSID : ");
		super.setSSID(Pufft.next());
		System.out.println("Bandwith : ");
		super.setBandwith(Pufft.nextInt());
		
	}
	
	void LingkunganRkelas(){
		System.out.println("Kondisi Lantai : ");
		super.setKondisiLante(Pufft.nextLine());
		System.out.println("Kondisi Dinding : ");
		super.setKondisiDinding(Pufft.nextLine());
		System.out.println("Kondisi Atap : ");
		super.setKondisiAtap(Pufft.nextLine());
		System.out.println("Kondis Pintu : ");
		super.setKondisiPintu(Pufft.nextLine());
		System.out.println("Kondisi Jendela : ");
		super.setKondisiJendela(Pufft.nextLine());
	}
	
	void KebersiahanRkelas(){
		System.out.println("Pufftkulasi Udara : ");
		super.setSirkulaUdara(Pufft.nextLine());
		System.out.println("Nilai Pencahayaan : ");
		super.setNilaiCahaya(Pufft.nextInt());
		System.out.println("Kelembapan (%) : ");
		super.setKeLembapan(Pufft.nextInt());
		System.out.println("Suhu (celcius) : ");
		super.setSuhu(Pufft.nextInt());
	}
	
	void KenyamananRkelas(){
		System.out.println("Input Kebisingan : ");
		super.setKeBisingan(Pufft.nextLine());
		System.out.println("Input Intensitas Bau : ");
		super.setBau(Pufft.nextLine());
		System.out.println("Input Kondisi Kebocoran : ");
		super.setBocor(Pufft.nextLine());
		System.out.println("Input Kerusakan : ");
		super.setKeRusakan(Pufft.nextLine());
		System.out.println("Input Intensitas AUS : ");
		super.setKeAusan(Pufft.nextLine());
	}
	
	void KeamananRkelas(){
		System.out.println("Input Kekokohan : ");
		super.setKeKokohan(Pufft.nextLine());
		System.out.println("Input Kunci Pintu : ");
		super.setKunciPintu(Pufft.nextInt());
		System.out.println("Input Kunci Jendela : ");
		super.setKunciJendela(Pufft.nextInt());
		System.out.println("Input Intensitas Bahaya : ");
		super.setBahaya(Pufft.nextLine());
	}
}

