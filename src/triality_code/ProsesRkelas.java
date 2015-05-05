package triality_code;

import java.util.Scanner;

public class ProsesRkelas extends RuangKelas {
	Scanner sir = new Scanner(System.in);
	
	double HitungLuas(){
		return getPanjang()*getLebar(); 
	}
	double HitungRasio() {
		return HitungLuas() / getJumlahKursi();
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
