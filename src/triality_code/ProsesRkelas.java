package triality_code;

import java.util.Scanner;

public class ProsesRkelas extends RuangKelas {
	Scanner sir = new Scanner(System.in);
	
	String IdentifiRkelas(){
		System.out.print("Nama Ruang 	: ");
		setNamaRuang(sir.nextLine());
		System.out.print("Lokasi 		: ");
		setLokasi(sir.nextLine());
		System.out.print("Fakultas 		: ");
		setFakultas(sir.nextLine());
		System.out.print("Program Studi 	: ");
		setProdi(sir.nextLine());
		return null;
	}
	String KondisiRkelas(){
		System.out.print("Panjang Ruang : ");
		setPanjang(sir.nextDouble());
		System.out.print("Lebar Ruang : ");
		setLebar(sir.nextDouble());
		//System.out.print("Jumlah Pintu : ");
		//setJumlahPintu(sir.nextDouble());
		//System.out.print("Jumlah Jendela : ");
		//setJumlahJendela(sir.nextDouble());
		System.out.print("Jumlah Kursi : ");
		setJumlahKursi(sir.nextInt());
		//System.out.print("Jumlah Kabel LCD : ");
		//setJmlKabelLCD(sir.nextDouble());
		//System.out.print("Jumlah Lampu : ");
		//setJumlahLampu(sir.nextDouble());
		System.out.print("Jumlah AC : ");
		setJumlahAC(sir.nextInt());
		return null;
		
	}
	double HitungLuas(){
		return getPanjang()*getLebar(); 
	}
	double HitungRasio() {
		return HitungLuas() / getJumlahKursi();
	} 
	
	String analisis_pintu_dan_jendela(){
		System.out.println("\n\nAnalisis Pintu dan Jendela");
		System.out.print("-----------------------------------");
		System.out.print("\nMasukkan Jumlah Pintu : ");
		setJumlahPintu(sir.nextInt());
		System.out.print("\nMasukkan Jumlah Jendela : ");
		setJumlahJendela(sir.nextInt());
		if(getJumlahPintu() >=2 && getJumlahJendela() >=1){
			System.out.print("-----------------------------------------");
			System.out.print("\nJumlah Pintu = "+getJumlahPintu());
			System.out.print("\nJumlah Jendela = "+getJumlahJendela());
			System.out.print("\nKriteria Sesuai");
			System.out.print("\n-----------------------------------------");
		} else {
			System.out.print("\n-----------------------------------------");
			System.out.print("\nKriteria Tidak Sesuai");
			System.out.print("\n-----------------------------------------");
		}
		return null;
	}
	
	String analisis_kelistrikan(){
		System.out.print("\n\nAnalisis Kelistrikan");
		System.out.print("\n-----------------------------------------------");
		System.out.print("\nMasukkan Jumlah stop kontak : ");
		setJumlahSteker(sir.nextInt());
		System.out.print("Masukkan Kondisi stop kontak : ");
		setKondisiSteker(sir.next());
		System.out.print("Masukkan Posisi stop kontak : \n");
		setPosisiSteker(sir.next());
		
		if((getJumlahSteker()>=4) && (getPosisiSteker().equals("pojok")) || (getPosisiSteker().equals("samping")) && getKondisiKblLCD().equals("berfungsi")){
			System.out.print("-----------------------------------------------------");
			System.out.println("\nJumlah stop kontak : "+getJumlahSteker());
			System.out.println("\nKondisi stop kontak : "+getKondisiSteker());
			System.out.println("\nPosisi stop kontak : "+getPosisiSteker());
			System.out.println("\nKriteria Sesuai");
			System.out.println("\n-----------------------------------------------------");
		} else{
			System.out.println("\n-----------------------------------------------------");
			System.out.println("\nKriteria Tidak Sesuai");
			System.out.println("\n-----------------------------------------------------");
		}
		return null;
	}
	
	String analisis_lcd(){
		System.out.print("\nAnalisis LCD");
		System.out.print("\n------------------------------------------------------");
		System.out.print("\nMasukkan Jumlah Kabel LCD : ");
		setJmlKabelLCD(sir.nextInt());
		System.out.print("Masukkan Kondisi Kabel LCD : ");
		setKondisiKblLCD(sir.next());
		System.out.print("Masukkan Posisi : ");
		setPosisiKblLCD(sir.next());
		
		if (getJmlKabelLCD()>=1 && getKondisiKblLCD().equals("berfungsi") && getPosisiKblLCD().equals("depan")){
			System.out.print("------------------------------------------------");
			System.out.print("\nJumlah Kabel LCD : "+getJmlKabelLCD());
			System.out.print("\nKondisi Kabel LCD : "+getKondisiKblLCD());
			System.out.print("\nPosisi Kabel LCD : "+getPosisiKblLCD());
			System.out.print("\nKriteria Sesuai");
			System.out.print("\n------------------------------------------------");
		} else {
			System.out.print("\n------------------------------------------------");
			System.out.print("\nKriteria Tidak Sesuai");
			System.out.print("\n------------------------------------------------");
		}
		return null;
	}
	
	String analisis_lampu(){
		System.out.print("\nAnalisis Lampu");
		System.out.print("\n---------------------------------------------------------");
		System.out.print("\nMasukkan Jumlah Lampu : ");
		setJumlahLampu(sir.nextInt());
		System.out.print("Masukkan Kondisi Lampu : ");
		setKondisiLamp(sir.next());
		System.out.print("Masukkan Posisi Lampu : ");
		setPosisiLamp(sir.next());
		
		if (getJumlahLampu()>=18 && getKondisiLamp().equalsIgnoreCase("baik") && getPosisiLamp().equals("atap")){
			System.out.print("--------------------------------------------------");
			System.out.print("\nJumlah Lampu : "+getJumlahLampu());
			System.out.print("\nKondisi Lampu : "+getKondisiLamp());
			System.out.print("\nPosisi Lampu : "+getPosisiLamp());
			System.out.print("\nKriteria Sesuai");
			System.out.print("\n-----------------------------------------------------");
		} else {
			System.out.println("\n---------------------------------------------------");
			System.out.println("\nKriteria Tidak Sesuai");
			System.out.println("\n-------------------------------------------------------");
		}
		return null;
	}
	String AnalisisKipasAngin(){
		int nilai = 3;
		System.out.println("Jumlah Kipas Angin : ");
		setJumlahKipas(sir.nextInt());
		if(getJumlahKipas()>=2){
			nilai--;
		}
		System.out.println("Kondisi Kipas Angin : ");
		setKondisiKipas(sir.next());
		if(getKondisiKipas().equalsIgnoreCase("baik")||getJumlahKipas()>=2){
			nilai--;
		}
		System.out.println("Posisi Kipas Angin (ya jika di atap) : ");
		setPosisiKipas(sir.next());
		if(getPosisiKipas().equalsIgnoreCase("ya")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
		return null;
	}
	String AnalisisAC(){
		int nilai = 3;
		System.out.println("Jumlah AC : ");
		setJumlahAC(sir.nextInt());
		if(getJumlahAC()>=2){
			nilai--;
		}
		System.out.println("Kondisi AC : ");
		setKondisiAC(sir.next());
		if(getKondisiAC().equalsIgnoreCase("baik")||getJumlahKipas()>=2){
			nilai--;
		}
		System.out.println("Posisi AC : ");
		setPosisiAC(sir.next());
		if(getPosisiAC().equalsIgnoreCase("belakang")||getPosisiAC().equalsIgnoreCase("samping")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
		return null;
	} 
	String AnalisisInternet(){
		int nilai = 2;
		System.out.println("SSID UMM Hotspot  : ");
		setSSID_UMM(sir.next());
		if(getSSID_UMM().equalsIgnoreCase("ada")){
			nilai--;
		}
		System.out.println("Terkoneksi : ");
		setBisaLogin(sir.next());
		if(getBisaLogin().equalsIgnoreCase("ada")){
			nilai--;
		}
		System.out.println("Masukan Bandwith : ");
		setBandwith(sir.nextInt());
		///////Tampilin Hasilnya////////
		if(nilai==0){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
		System.out.print(getBandwith()+"\n");
		return null;
	}
	String AnalisiCCTV(){
		int nilai = 3;
		System.out.println("Jumlah CCTV : ");
		setJmlCCTV(sir.nextInt());
		if(getJmlCCTV()>=2){
			nilai--;
		}
		System.out.println("Kondisi CCTV : ");
		setKondisiCCTV(sir.next());
		if(getKondisiCCTV().equalsIgnoreCase("baik")||getJmlCCTV()>=2){
			nilai--;
		}
		System.out.println("Posisi CCTV : ");
		setPosisiCCTV(sir.next());
		if(getPosisiCCTV().equalsIgnoreCase("depan")||getPosisiCCTV().equalsIgnoreCase("belakang")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
		return null;
	}
	String AnalisisKebersihan(){
		int nilai = 5;
		System.out.println("Kondisi Lantai : ");
		setKondisiLante(sir.next());
		if(getKondisiLante().equals("bersih")){
			nilai--;
		}
		System.out.println("Kondisi Dinding : ");
		setKondisiDinding(sir.next());
		if(getKondisiDinding().equals("bersih")){
			nilai--;
		}
		System.out.println("Kondisi Atap : ");
		setKondisiAtap(sir.next());
		if(getKondisiAtap().equals("bersih")){
			nilai--;
		}
		System.out.println("Kondisi Pintu : ");
		setKondisiPintu(sir.next());
		if(getKondisiPintu().equals("bersih")){
			nilai--;
		}
		System.out.println("Kondisi Atap : ");
		setKondisiJendela(sir.next());
		if(getKondisiJendela().equals("bersih")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
		return null;
	}
	String AnalisisSirkulasi(){
		System.out.println("Sirkulasi Udara : ");
		setSirkulaUdara(sir.next());
		if(getSirkulaUdara().equals("lancar")){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
		return null;
	}
	String NilaiPencahayaAn(){
		System.out.println("Pencahayaan : ");
		setNilaiCahaya(sir.nextInt());
		if(getNilaiCahaya()>=250&&getNilaiCahaya()<=350){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
		return null;
	}
	String Kelembapan(){
		System.out.println("Kelembapan (%) : ");
		setKeLembapan(sir.nextInt());
		if(getKeLembapan()>=70&&getKeLembapan()<=80){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
		return null;
	}
	String Sifu(){
		System.out.println("Suhu udara : ");
		setSuhu(sir.nextInt());
		if(getSuhu()>=25&&getSuhu()<=35){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
		return null;
	}
	
}
