package triality_code;

class RuangKelas {
	private String NamaRuang, Lokasi, Fakultas, Prodi;
	private String KondisiSteker, KondisiKblLCD, KondisiLampu, KondisiAC, KondisiKipas, KondisiCCTV;
	private String KondisiLante, KondisiDinding, KondisiAtap, KondisiPintu, KondisiJendela;
	private String SirkulaUdara, Login, SSID;
	private String PosisiSteker, PosisiKblLCD, PosisiLampu, PosisiAC, PosisiKipas,PosisiCCTV;
	private String KeBisingan, Bau, Bocor, KeRusakan, KeAusan;
	private String KeKokohan, Bahaya;
	private int JmlPintu, JmlJendela, JmlKursi, JmlSteker;
	private int JmlKabelLCD, JmlLampu, JmlAC, JmlKipas,JmlCCTV;
	private int NilaiCahaya, KeLembapan, Suhu, KunciPintu, KunciJendela;
	private double Panjang, Lebar, Luas, Bandwith;
	
	public RuangKelas(String NamaRuang, String Lokasi, String Fakultas,
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
		super();
		this.NamaRuang = NamaRuang;
		this.Lokasi = Lokasi;
		this.Fakultas = Fakultas;
		this.Prodi = Prodi;
		this.KondisiSteker = KondisiSteker;
		this.KondisiKblLCD = KondisiKblLCD;
		this.KondisiLampu = KondisiLampu;
		this.KondisiAC = KondisiAC;
		this.KondisiKipas = KondisiKipas;
		this.KondisiCCTV = KondisiCCTV;
		this.KondisiLante = KondisiLante;
		this.KondisiDinding = KondisiDinding;
		this.KondisiAtap = KondisiAtap;
		this.KondisiPintu = KondisiPintu;
		this.KondisiJendela = KondisiJendela;
		this.SirkulaUdara = SirkulaUdara;
		this.Login = Login;
		this.SSID = SSID;
		this.PosisiSteker = PosisiSteker;
		this.PosisiKblLCD = PosisiKblLCD;
		this.PosisiLampu = PosisiLampu;
		this.PosisiAC = PosisiAC;
		this.PosisiKipas = PosisiKipas;
		this.PosisiCCTV = PosisiCCTV;
		this.KeBisingan = KeBisingan;
		this.Bau = Bau;
		this.Bocor = Bocor;
		this.KeRusakan = KeRusakan;
		this.KeAusan = KeAusan;
		this.KeKokohan = KeKokohan;
		this.Bahaya = Bahaya;
		this.JmlPintu = JmlPintu;
		this.JmlJendela = JmlJendela;
		this.JmlKursi = JmlKursi;
		this.JmlSteker = JmlSteker;
		this.JmlKabelLCD = JmlKabelLCD;
		this.JmlLampu = JmlLampu;
		this.JmlAC = JmlAC;
		this.JmlKipas = JmlKipas;
		this.JmlCCTV = JmlCCTV;
		this.NilaiCahaya = NilaiCahaya;
		this.KeLembapan = KeLembapan;
		this.Suhu = Suhu;
		this.KunciPintu = KunciPintu;
		this.KunciJendela = KunciJendela;
		this.Panjang = Panjang;
		this.Lebar = Lebar;
		this.Luas = Luas;
		this.Bandwith = Bandwith;
	}

	void IdentitasRkelas(String NamaRuang, String Lokasi, String Fakultas, String Prodi){
		this.NamaRuang = NamaRuang;
		this.Lokasi = Lokasi;
		this.Fakultas = Fakultas;
		this.Prodi = Prodi;
	}
	
	void KondisiRkelas(int Panjang, int Lebar, int JmlKursi, int JmlPintu, int JmlJendela){
		this.Panjang = Panjang;
		this.Lebar = Lebar;
		this.JmlKursi = JmlKursi;
		this.JmlPintu = JmlPintu;
		this.JmlJendela = JmlJendela;
	}
	
	void SaranaRkelas(int JmlSteker, String KondisiSteker, String PosisiSteker, int JmlKabelLCD, String KondisiKabelLCD, String PosisiKabelLCD,
			int JmlLampu, String KondisiLampu, String PosisiLampu, int JmlKipas, String KondisiKipas, String PosisiKipas, int JmlAC, String KondisiAC,
			String PosisiAC, int JmlCCTV, String KondisiCCTV, String PosisiCCTV, String SSID, int Bandwith){
		this.JmlSteker = JmlSteker;
		this.KondisiSteker = KondisiSteker;
		this.PosisiSteker = PosisiSteker;
		this.JmlKabelLCD = JmlKabelLCD;
		this.KondisiKblLCD = KondisiKabelLCD;
		this.PosisiKblLCD = PosisiKabelLCD;
		this.JmlLampu = JmlLampu;
		this.KondisiLampu = KondisiLampu;
		this.PosisiLampu = PosisiLampu;
		this.JmlKipas = JmlKipas;
		this.KondisiKipas = KondisiKipas;
		this.PosisiKipas = PosisiKipas;
		this.JmlAC = JmlAC;
		this.KondisiAC = KondisiAC;
		this.PosisiAC = PosisiAC;
		this.JmlCCTV = JmlCCTV;
		this.KondisiCCTV = KondisiCCTV;
		this.PosisiCCTV = PosisiCCTV;
		this.SSID = SSID;
		this.Bandwith = Bandwith;
		
	}
	
	String getNamaRuang() {
		return NamaRuang;
	}
	
	String getLokasi() {
		return Lokasi;
	}
	
	String getFakultas() {
		return Fakultas;
	}
	
	String getProdi() {
		return Prodi;
	}
	
	String getKondisiSteker() {
		return KondisiSteker;
	}
	
	String getKondisiKblLCD() {
		return KondisiKblLCD;
	}
	
	String getKondisiLampu() {
		return KondisiLampu;
	}
	
	String getKondisiAC() {
		return KondisiAC;
	}
	
	String getKondisiKipas() {
		return KondisiKipas;
	}
	
	String getKondisiCCTV() {
		return KondisiCCTV;
	}
	
	String getKondisiLante() {
		return KondisiLante;
	}
	
	String getKondisiDinding() {
		return KondisiDinding;
	}
	
	String getKondisiAtap() {
		return KondisiAtap;
	}
	
	String getKondisiPintu() {
		return KondisiPintu;
	}
	
	String getKondisiJendela() {
		return KondisiJendela;
	}
	
	String getSirkulaUdara() {
		return SirkulaUdara;
	}
	
	String getLogin() {
		return Login;
	}
	
	String getSSID() {
		return SSID;
	}
	
	String getPosisiSteker() {
		return PosisiSteker;
	}
	
	String getPosisiKblLCD() {
		return PosisiKblLCD;
	}
	
	String getPosisiLampu() {
		return PosisiLampu;
	}
	
	String getPosisiAC() {
		return PosisiAC;
	}
	
	String getPosisiKipas() {
		return PosisiKipas;
	}
	
	String getPosisiCCTV() {
		return PosisiCCTV;
	}
	
	String getKeBisingan() {
		return KeBisingan;
	}
	
	String getBau() {
		return Bau;
	}
	
	String getBocor() {
		return Bocor;
	}
	
	String getKeRusakan() {
		return KeRusakan;
	}
	
	String getKeAusan() {
		return KeAusan;
	}
	
	String getKeKokohan() {
		return KeKokohan;
	}
	
	int getKunciPintu() {
		return KunciPintu;
	}
	
	int getKunciJendela() {
		return KunciJendela;
	}
	
	String getBahaya() {
		return Bahaya;
	}
	
	int getJmlPintu() {
		return JmlPintu;
	}
	int getJmlJendela() {
		return JmlJendela;
	}
	
	int getJmlKursi() {
		return JmlKursi;
	}
	
	int getJmlSteker() {
		return JmlSteker;
	}
	
	int getJmlKabelLCD() {
		return JmlKabelLCD;
	}
	
	int getJmlLampu() {
		return JmlLampu;
	}
	
	int getJmlAC() {
		return JmlAC;
	}
	
	int getJmlKipas() {
		return JmlKipas;
	}
	
	int getJmlCCTV() {
		return JmlCCTV;
	}
	
	int getNilaiCahaya() {
		return NilaiCahaya;
	}
	
	int getKeLembapan() {
		return KeLembapan;
	}
	
	int getSuhu() {
		return Suhu;
	}
	
	double getPanjang() {
		return Panjang;
	}
	
	double getLebar() {
		return Lebar;
	}
	
	double getLuas() {
		return Luas;
	}
	
	double getBandwith() {
		return Bandwith;
	}

	void setNamaRuang(String namaRuang) {
		this.NamaRuang = namaRuang;
	}

	void setLokasi(String lokasi) {
		this.Lokasi = lokasi;
	}

	void setFakultas(String fakultas) {
		this.Fakultas = fakultas;
	}

	void setProdi(String prodi) {
		this.Prodi = prodi;
	}

	void setKondisiSteker(String KondisiSteker) {
		this.KondisiSteker = KondisiSteker;
	}

	void setKondisiKblLCD(String KondisiKblLCD) {
		this.KondisiKblLCD = KondisiKblLCD;
	}

	void setKondisiLampu(String KondisiLampu) {
		this.KondisiLampu = KondisiLampu;
	}

	void setKondisiAC(String KondisiAC) {
		this.KondisiAC = KondisiAC;
	}

	void setKondisiKipas(String KondisiKipas) {
		this.KondisiKipas = KondisiKipas;
	}

	void setKondisiCCTV(String KondisiCCTV) {
		this.KondisiCCTV = KondisiCCTV;
	}

	void setKondisiLante(String KondisiLante) {
		this.KondisiLante = KondisiLante;
	}

	void setKondisiDinding(String KondisiDinding) {
		this.KondisiDinding = KondisiDinding;
	}

	void setKondisiAtap(String KondisiAtap) {
		this.KondisiAtap = KondisiAtap;
	}

	void setKondisiPintu(String KondisiPintu) {
		this.KondisiPintu = KondisiPintu;
	}

	void setKondisiJendela(String KondisiJendela) {
		this.KondisiJendela = KondisiJendela;
	}

	void setSirkulaUdara(String sirkulaUdara) {
		this.SirkulaUdara = sirkulaUdara;
	}

	void setLogin(String login) {
		this.Login = login;
	}

	void setSSID(String sSID) {
		this.SSID = sSID;
	}

	void setPosisiSteker(String PosisiSteker) {
		this.PosisiSteker = PosisiSteker;
	}

	void setPosisiKblLCD(String PosisiKblLCD) {
		this.PosisiKblLCD = PosisiKblLCD;
	}

	void setPosisiLampu(String PosisiLampu) {
		this.PosisiLampu = PosisiLampu;
	}

	void setPosisiAC(String PosisiAC) {
		this.PosisiAC = PosisiAC;
	}

	void setPosisiKipas(String PosisiKipas) {
		this.PosisiKipas = PosisiKipas;
	}

	void setPosisiCCTV(String PosisiCCTV) {
		this.PosisiCCTV = PosisiCCTV;
	}

	void setKeBisingan(String keBisingan) {
		this.KeBisingan = keBisingan;
	}

	void setBau(String bau) {
		this.Bau = bau;
	}

	void setBocor(String bocor) {
		this.Bocor = bocor;
	}

	void setKeRusakan(String keRusakan) {
		this.KeRusakan = keRusakan;
	}

	void setKeAusan(String keAusan) {
		this.KeAusan = keAusan;
	}

	void setKeKokohan(String keKokohan) {
		this.KeKokohan = keKokohan;
	}

	void setKunciPintu(int KunciPintu) {
		this.KunciPintu = KunciPintu;
	}

	void setKunciJendela(int KunciJendela) {
		this.KunciJendela = KunciJendela;
	}

	void setBahaya(String bahaya) {
		this.Bahaya = bahaya;
	}

	void setJmlPintu(int JmlPintu) {
		this.JmlPintu = JmlPintu;
	}

	void setJmlJendela(int JmlJendela) {
		this.JmlJendela = JmlJendela;
	}

	void setJmlKursi(int JmlKursi) {
		this.JmlKursi = JmlKursi;
	}

	void setJmlSteker(int JmlSteker) {
		this.JmlSteker = JmlSteker;
	}

	void setJmlKabelLCD(int JmlKabelLCD) {
		this.JmlKabelLCD = JmlKabelLCD;
	}

	void setJmlLampu(int JmlLampu) {
		this.JmlLampu = JmlLampu;
	}

	void setJmlAC(int JmlAC) {
		this.JmlAC = JmlAC;
	}

	void setJmlKipas(int JmlKipas) {
		this.JmlKipas = JmlKipas;
	}

	void setJmlCCTV(int JmlCCTV) {
		this.JmlCCTV = JmlCCTV;
	}

	void setNilaiCahaya(int nilaiCahaya) {
		this.NilaiCahaya = nilaiCahaya;
	}

	void setKeLembapan(int keLembapan) {
		this.KeLembapan = keLembapan;
	}

	void setSuhu(int suhu) {
		this.Suhu = suhu;
	}

	void setPanjang(double panjang) {
		this.Panjang = panjang;
	}

	void setLebar(double lebar) {
		this.Lebar = lebar;
	}

	void setLuas(double luas) {
		this.Luas = luas;
	}

	void setBandwith(double bandwith) {
		this.Bandwith = bandwith;
	}
	
}
