package inventanity;


public class RuangKelas {
	private String NamaRuang, Lokasi, Fakultas, Prodi;
	private double Panjang, Lebar, Luas;
	private double JumlahPintu, JumlahJendela, JumlahKursi, JumlahSteker;
	private double JmlKabelLCD, JumlahLampu, JumlahAC;

	double HitungLuas() {
		return Panjang * Lebar;
	}

	double HitungRasio() {
		return HitungLuas() / JumlahKursi;
	}

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

	public double getPanjang() {
		return Panjang;
	}

	public double setPanjang(double panjang) {
		return Panjang = panjang;
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

	public double getJumlahPintu() {
		return JumlahPintu;
	}

	public void setJumlahPintu(double jumlahPintu) {
		JumlahPintu = jumlahPintu;
	}

	public double getJumlahJendela() {
		return JumlahJendela;
	}

	public void setJumlahJendela(double jumlahJendela) {
		JumlahJendela = jumlahJendela;
	}

	public double getJumlahKursi() {
		return JumlahKursi;
	}

	public void setJumlahKursi(double jumlahKursi) {
		JumlahKursi = jumlahKursi;
	}

	public double getJumlahSteker() {
		return JumlahSteker;
	}

	public void setJumlahSteker(double jumlahSteker) {
		JumlahSteker = jumlahSteker;
	}

	public double getJmlKabelLCD() {
		return JmlKabelLCD;
	}

	public void setJmlKabelLCD(double jmlKabelLCD) {
		JmlKabelLCD = jmlKabelLCD;
	}

	public double getJumlahLampu() {
		return JumlahLampu;
	}

	public void setJumlahLampu(double jumlahLampu) {
		JumlahLampu = jumlahLampu;
	}

	public double getJumlahAC() {
		return JumlahAC;
	}

	public void setJumlahAC(double jumlahAC) {
		JumlahAC = jumlahAC;
	}

}
