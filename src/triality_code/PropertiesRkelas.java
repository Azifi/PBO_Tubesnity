package triality_code;

public class PropertiesRkelas {
	
	double HitungLuas(double panjang, double lebar){
		return panjang * lebar;
	}
	
	String BentukRuang(double Panjang, double Lebar){
		if(Panjang!=Lebar){
			System.out.println("Persegi Panjang");
			return "Sesuai";
		}else{
			System.out.println("Persegi");
			return "Tidak Sesuai";
			
		}
	}
	double HitungRasio(double Luas, int JmlKursi, double panjang, double lebar){
		return HitungLuas(panjang, lebar) / JmlKursi;
	}
	
	String HitungRasionya(double Luas, int JmlKursi){
		if((HitungRasio(Luas, JmlKursi, Luas, Luas))>=0.5){
			return "Sesuai";
		}else{
			return "Tidak sesuai";
		}
	}
	
	String AnalisPintuNjendela(int JmlPintu, int JmlJendela){
		if(JmlPintu>=2&&JmlJendela>=1){
			return "Sesuai";
		}else{
			return "Tidak Sesuai";
		}
	}
	
	String AnalisKelistrikan(int JmlSteker, String KondisiSteker, String PosisiSteker){
		int nilai = 3;
		if(JmlSteker>=4){
			nilai--;
		}
		if(KondisiSteker.equalsIgnoreCase("baik")||JmlSteker>=4){
			nilai--;
		}
		if(PosisiSteker.equalsIgnoreCase("Dipojok")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			return "Sesuai";
		}else{
			return "Tidak Sesuai";
		}
	}
	
	String AnalisLCD(int JmlKabelLCD, String KondisiKblLCD, String PosisiKblLCD){
		int nilai = 3;
		if(JmlKabelLCD>=1){
			nilai--;
		}
		if(KondisiKblLCD.equalsIgnoreCase("berfungsi")){
			nilai--;
		}
		if(PosisiKblLCD.equalsIgnoreCase("Dekat Dosen")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			return "Sesuai";
		}else{
			return "Tidak Sesuai";
		}
	}
	
	String AnalisLampu(int JmlLampu, String KondisiLampu, String PosisiLampu){
		int nilai = 3;
		if(JmlLampu>=18){
			nilai--;
		}
		if(KondisiLampu.equalsIgnoreCase("baik")||JmlLampu>=18){
			nilai--;
		}
		if(PosisiLampu.equalsIgnoreCase("Diatap")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			return "Sesuai";
		}else{
			return "Tidak Sesuai";
		}
	}
	
	String AnalisKipas(int JmlKipas, String KondisiKipas, String PosisiKipas){
		int nilai = 3;
		if(JmlKipas>=2){
			nilai--;
		}
		if(KondisiKipas.equalsIgnoreCase("baik")||JmlKipas>=2){
			nilai--;
		}
		if(PosisiKipas.equalsIgnoreCase("Diatap")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			return "Sesuai";
		}else{
			return "Tidak Sesuai";
		}
	}
	
	String AC(int JmlAC, String KondisiAC, String PosisiAC){
		int nilai = 3;
		if(JmlAC>=2){
			nilai--;
		}
		if(KondisiAC.equalsIgnoreCase("baik")||JmlAC>=2){
			nilai--;
		}
		if(PosisiAC.equalsIgnoreCase("Dibelakang")||PosisiAC.equalsIgnoreCase("Disamping")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			return "Sesuai";
		}else{
			return "Tidak Sesuai";
		}
	}
	
	String AnalisInternet(String SSID, String Login){
		int nilai = 2;
		if(SSID.equalsIgnoreCase("UMM Hotspot")){
			nilai--;
		}
		if(Login.equalsIgnoreCase("Bisa")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			return "Sesuai";
		}else{
			return "Tidak Sesuai";
		}
	}
	
	String AnalisCCTV(int JmlCCTV, String KondisiCCTV, String PosisiCCTV){
		int nilai = 3;
		if(JmlCCTV>=2){
			nilai--;
		}
		if(KondisiCCTV.equalsIgnoreCase("baik")||JmlCCTV>=2){
			nilai--;
		}
		if(PosisiCCTV.equalsIgnoreCase("Depan")||PosisiCCTV.equalsIgnoreCase("Belakang")){
			nilai--;
		}
		///////Tampilin Hasilnya////////
		if(nilai==0){
			return "Sesuai";
		}else{
			return "Tidak Sesuai";
		}
	}
}
