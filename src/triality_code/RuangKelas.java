package triality_code;

public class RuangKelas {
	private String NamaRuang, Lokasi, Fakultas, Prodi;
	private String KondisiSteker, KondisiKblLCD, KondisiLamp, KondisiAC, KondisiKipas, KondisiCCTV;
	private String KondisiLante, KondisiDinding, KondisiAtap, KondisiPintu, KondisiJendela;
	private String SirkulaUdara, BisaLogin,SSID_UMM;
	private String PosisiSteker, PosisiKblLCD, PosisiLamp, PosisiAC, PosisiKipas,PosisiCCTV;
	private String KeBisingan, Bau, Bocor, KeRusakan, KeAusan;
	private String KeKokohan, PintuBkunci, JendelaBkunci, Bahaya;
	private int JumlahPintu, JumlahJendela, JumlahKursi, JumlahSteker;
	private int JmlKabelLCD, JumlahLampu, JumlahAC, JumlahKipas,JmlCCTV;
	private int NilaiCahaya, KeLembapan, Suhu;
	private double Panjang, Lebar, Luas, Bandwith;
	
	
	public String getNamaRuang() {
		return NamaRuang;
	}
	public void setNamaRuang(String namaRuang) {
		NamaRuang = namaRuang;
	}
	public String getLokasi() {
		return Lokasi;
	}
	public void setLokasi(String lokasi) {
		Lokasi = lokasi;
	}
	public String getFakultas() {
		return Fakultas;
	}
	public void setFakultas(String fakultas) {
		Fakultas = fakultas;
	}
	public String getProdi() {
		return Prodi;
	}
	public void setProdi(String prodi) {
		Prodi = prodi;
	}
	public String getKondisiSteker() {
		return KondisiSteker;
	}
	public void setKondisiSteker(String kondisiSteker) {
		KondisiSteker = kondisiSteker;
	}
	public String getKondisiKblLCD() {
		return KondisiKblLCD;
	}
	public void setKondisiKblLCD(String kondisiKblLCD) {
		KondisiKblLCD = kondisiKblLCD;
	}
	public String getKondisiLamp() {
		return KondisiLamp;
	}
	public void setKondisiLamp(String kondisiLamp) {
		KondisiLamp = kondisiLamp;
	}
	public String getKondisiAC() {
		return KondisiAC;
	}
	public void setKondisiAC(String kondisiAC) {
		KondisiAC = kondisiAC;
	}
	public String getKondisiKipas() {
		return KondisiKipas;
	}
	public void setKondisiKipas(String kondisiKipas) {
		KondisiKipas = kondisiKipas;
	}
	public String getKondisiLante() {
		return KondisiLante;
	}
	public void setKondisiLante(String kondisiLante) {
		KondisiLante = kondisiLante;
	}
	public String getKondisiDinding() {
		return KondisiDinding;
	}
	public void setKondisiDinding(String kondisiDinding) {
		KondisiDinding = kondisiDinding;
	}
	public String getKondisiAtap() {
		return KondisiAtap;
	}
	public void setKondisiAtap(String kondisiAtap) {
		KondisiAtap = kondisiAtap;
	}
	public String getKondisiPintu() {
		return KondisiPintu;
	}
	public void setKondisiPintu(String kondisiPintu) {
		KondisiPintu = kondisiPintu;
	}
	public String getKondisiJendela() {
		return KondisiJendela;
	}
	public void setKondisiJendela(String kondisiJendela) {
		KondisiJendela = kondisiJendela;
	}
	public String getSirkulaUdara() {
		return SirkulaUdara;
	}
	public void setSirkulaUdara(String sirkulaUdara) {
		SirkulaUdara = sirkulaUdara;
	}
	public String getPosisiSteker() {
		return PosisiSteker;
	}
	public void setPosisiSteker(String posisiSteker) {
		PosisiSteker = posisiSteker;
	}
	public String getPosisiKblLCD() {
		return PosisiKblLCD;
	}
	public void setPosisiKblLCD(String posisiKblLCD) {
		PosisiKblLCD = posisiKblLCD;
	}
	public String getPosisiLamp() {
		return PosisiLamp;
	}
	public void setPosisiLamp(String posisiLamp) {
		PosisiLamp = posisiLamp;
	}
	public String getPosisiAC() {
		return PosisiAC;
	}
	public void setPosisiAC(String posisiAC) {
		PosisiAC = posisiAC;
	}
	public String getPosisiKipas() {
		return PosisiKipas;
	}
	public void setPosisiKipas(String posisiKipas) {
		PosisiKipas = posisiKipas;
	}
	public String getKeBisingan() {
		return KeBisingan;
	}
	public void setKeBisingan(String keBisingan) {
		KeBisingan = keBisingan;
	}
	public String getBau() {
		return Bau;
	}
	public void setBau(String bau) {
		Bau = bau;
	}
	public String getBocor() {
		return Bocor;
	}
	public void setBocor(String bocor) {
		Bocor = bocor;
	}
	public String getKeRusakan() {
		return KeRusakan;
	}
	public void setKeRusakan(String keRusakan) {
		KeRusakan = keRusakan;
	}
	public String getKeAusan() {
		return KeAusan;
	}
	public void setKeAusan(String keAusan) {
		KeAusan = keAusan;
	}
	public String getKeKokohan() {
		return KeKokohan;
	}
	public void setKeKokohan(String keKokohan) {
		KeKokohan = keKokohan;
	}
	public String getPintuBkunci() {
		return PintuBkunci;
	}
	public void setPintuBkunci(String pintuBkunci) {
		PintuBkunci = pintuBkunci;
	}
	public String getJendelaBkunci() {
		return JendelaBkunci;
	}
	public void setJendelaBkunci(String jendelaBkunci) {
		JendelaBkunci = jendelaBkunci;
	}
	public String getBahaya() {
		return Bahaya;
	}
	public void setBahaya(String bahaya) {
		Bahaya = bahaya;
	}
	public int getJumlahPintu() {
		return JumlahPintu;
	}
	public void setJumlahPintu(int jumlahPintu) {
		JumlahPintu = jumlahPintu;
	}
	public int getJumlahJendela() {
		return JumlahJendela;
	}
	public void setJumlahJendela(int jumlahJendela) {
		JumlahJendela = jumlahJendela;
	}
	public int getJumlahKursi() {
		return JumlahKursi;
	}
	public void setJumlahKursi(int jumlahKursi) {
		JumlahKursi = jumlahKursi;
	}
	public int getJumlahSteker() {
		return JumlahSteker;
	}
	public void setJumlahSteker(int jumlahSteker) {
		JumlahSteker = jumlahSteker;
	}
	public int getJmlKabelLCD() {
		return JmlKabelLCD;
	}
	public void setJmlKabelLCD(int jmlKabelLCD) {
		JmlKabelLCD = jmlKabelLCD;
	}
	public int getJumlahLampu() {
		return JumlahLampu;
	}
	public void setJumlahLampu(int jumlahLampu) {
		JumlahLampu = jumlahLampu;
	}
	public int getJumlahAC() {
		return JumlahAC;
	}
	public void setJumlahAC(int jumlahAC) {
		JumlahAC = jumlahAC;
	}
	public int getJumlahKipas() {
		return JumlahKipas;
	}
	public void setJumlahKipas(int jumlahKipas) {
		JumlahKipas = jumlahKipas;
	}
	public int getNilaiCahaya() {
		return NilaiCahaya;
	}
	public void setNilaiCahaya(int nilaiCahaya) {
		NilaiCahaya = nilaiCahaya;
	}
	public int getKeLembapan() {
		return KeLembapan;
	}
	public void setKeLembapan(int keLembapan) {
		KeLembapan = keLembapan;
	}
	public int getSuhu() {
		return Suhu;
	}
	public void setSuhu(int suhu) {
		Suhu = suhu;
	}
	public double getPanjang() {
		return Panjang;
	}
	public void setPanjang(double panjang) {
		Panjang = panjang;
	}
	public double getLebar() {
		return Lebar;
	}
	public void setLebar(double lebar) {
		Lebar = lebar;
	}
	public double getLuas() {
		return Luas;
	}
	public void setLuas(double luas) {
		Luas = luas;
	}
	public String getBisaLogin() {
		return BisaLogin;
	}
	public void setBisaLogin(String bisaLogin) {
		BisaLogin = bisaLogin;
	}
	public String getSSID_UMM() {
		return SSID_UMM;
	}
	public void setSSID_UMM(String sSID_UMM) {
		SSID_UMM = sSID_UMM;
	}
	public double getBandwith() {
		return Bandwith;
	}
	public void setBandwith(double bandwith) {
		Bandwith = bandwith;
	}
	public String getKondisiCCTV() {
		return KondisiCCTV;
	}
	public void setKondisiCCTV(String kondisiCCTV) {
		KondisiCCTV = kondisiCCTV;
	}
	public String getPosisiCCTV() {
		return PosisiCCTV;
	}
	public void setPosisiCCTV(String posisiCCTV) {
		PosisiCCTV = posisiCCTV;
	}
	public int getJmlCCTV() {
		return JmlCCTV;
	}
	public void setJmlCCTV(int jmlCCTV) {
		JmlCCTV = jmlCCTV;
	}
	
	
}
