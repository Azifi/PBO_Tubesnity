package triality_code;

public interface InterfaceTampilan {

	void TampilkanIdentitas(String NamaRuang, String Lokasi, String Fakultas,
							String Prodi);//titik,koma
	void TampilkanKondisi(int Panjang, int Lebar, int JmlKursi, int JmlPintu,
						  int JmlJendela);//titik,koma
	void TampilkanSarana(int JmlSteker, String KondisiSteker,
						 String PosisiSteker, int JmlKabelLCD, String KondisiKabelLCD,
						 String PosisiKabelLCD, int JmlLampu, String KondisiLampu,
						 String PosisiLampu, int JmlKipas, String KondisiKipas,
						 String PosisiKipas, int JmlAC, String KondisiAC, String PosisiAC,
						 int JmlCCTV, String KondisiCCTV, String PosisiCCTV, String SSID,
						 double Bandwith);//titik,koma
	void TampilkanLingkungan(String KondisiLante, String KondisiDinding,
							 String KondisiAtap, String KondisiPintu, String KondisiJendela);//titik,koma
	void TampilkanKebersihan(String SirkulaUdara, int NilaiCahaya,
							 int KeLembapan, int Suhu);//titik,koma
	void TampilKenyamanan(String keBisingan, String Bau, String Bocor,
						  String KeRusakan, String KeAusan);//titik,koma
	void TampilKeamanan(String KeKokohan, String Bahaya, int KunciPintu,
			int KunciJendela);//titik,koma
	
	
}
