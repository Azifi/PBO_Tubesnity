package triality_code;

public class PropertiesRkelas extends RuangKelas {
	
	public PropertiesRkelas(String NamaRuang, String Lokasi, String Fakultas,
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
						   	int KunciJendela, int Panjang, int Lebar, double Luas,
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

	double HitungLuas(int panjang, int lebar) {
		return panjang * lebar;
	}

	String BentukRuang(int Panjang, int Lebar) {
		if (Panjang != Lebar) {
			System.out.println("Persegi Panjang");
			return "Sesuai";
		} else {
			System.out.println("Persegi");
			return "Tidak Sesuai";

		}
	}

	double HitungRasio(double Luas, int JmlKursi, int Panjang, int Lebar) {
		return HitungLuas(Panjang, Lebar) / JmlKursi;
	}

	String HitungRasionya(double Luas, int JmlKursi, int Panjang, int Lebar) {
		if ((HitungRasio(Luas, JmlKursi, Panjang, Lebar)) >= 0.5) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String AnalisPintuNjendela(int JmlPintu, int JmlJendela) {
		if (JmlPintu >= 2 && JmlJendela >= 1) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisKelistrikan(int JmlSteker, String KondisiSteker,
			String PosisiSteker) {
		int nilai = 3;
		if (JmlSteker >= 4) {
			nilai--;
		}
		if (KondisiSteker.equalsIgnoreCase("baik") || JmlSteker >= 4) {
			nilai--;
		}
		if (PosisiSteker.equalsIgnoreCase("Dipojok")) {
			nilai--;
		}
		// /////Tampilin Hasilnya////////
		if (nilai == 0) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisLCD(int JmlKabelLCD, String KondisiKblLCD, String PosisiKblLCD) {
		int nilai = 3;
		if (JmlKabelLCD >= 1) {
			nilai--;
		}
		if (KondisiKblLCD.equalsIgnoreCase("berfungsi")) {
			nilai--;
		}
		if (PosisiKblLCD.equalsIgnoreCase("Dekat Dosen")) {
			nilai--;
		}
		// /////Tampilin Hasilnya////////
		if (nilai == 0) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisLampu(int JmlLampu, String KondisiLampu, String PosisiLampu) {
		int nilai = 3;
		if (JmlLampu >= 18) {
			nilai--;
		}
		if (KondisiLampu.equalsIgnoreCase("baik") || JmlLampu >= 18) {
			nilai--;
		}
		if (PosisiLampu.equalsIgnoreCase("Diatap")) {
			nilai--;
		}
		// /////Tampilin Hasilnya////////
		if (nilai == 0) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisKipas(int JmlKipas, String KondisiKipas, String PosisiKipas) {
		int nilai = 3;
		if (JmlKipas >= 2) {
			nilai--;
		}
		if (KondisiKipas.equalsIgnoreCase("baik") || JmlKipas >= 2) {
			nilai--;
		}
		if (PosisiKipas.equalsIgnoreCase("Diatap")) {
			nilai--;
		}
		// /////Tampilin Hasilnya////////
		if (nilai == 0) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisAC(int JmlAC, String KondisiAC, String PosisiAC) {
		int nilai = 3;
		if (JmlAC >= 2) {
			nilai--;
		}
		if (KondisiAC.equalsIgnoreCase("baik") || JmlAC >= 2) {
			nilai--;
		}
		if (PosisiAC.equalsIgnoreCase("Dibelakang")
				|| PosisiAC.equalsIgnoreCase("Disamping")) {
			nilai--;
		}
		// /////Tampilin Hasilnya////////
		if (nilai == 0) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisInternet(String SSID, String Login) {
		int nilai = 2;
		if (SSID.equalsIgnoreCase("UMM Hotspot")) {
			nilai--;
		}
		if (Login.equalsIgnoreCase("Bisa")) {
			nilai--;
		}
		// /////Tampilin Hasilnya////////
		if (nilai == 0) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisCCTV(int JmlCCTV, String KondisiCCTV, String PosisiCCTV) {
		int nilai = 3;
		if (JmlCCTV >= 2) {
			nilai--;
		}
		if (KondisiCCTV.equalsIgnoreCase("baik") || JmlCCTV >= 2) {
			nilai--;
		}
		if (PosisiCCTV.equalsIgnoreCase("Depan")
				|| PosisiCCTV.equalsIgnoreCase("Belakang")) {
			nilai--;
		}
		// /////Tampilin Hasilnya////////
		if (nilai == 0) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisisKebersihan(String KondisiLante, String KondisiDinding,
			String KondisiAtap, String KondisiPintu, String KondisiJendela) {
		if (KondisiLante.equalsIgnoreCase("bersih")
				&& KondisiDinding.equalsIgnoreCase("bersih")
				&& KondisiAtap.equalsIgnoreCase("bersih")
				&& KondisiPintu.equalsIgnoreCase("bersih")
				&& KondisiJendela.equalsIgnoreCase("bersih")) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisisSirkulasiUdara(String SirkulaUdara) {
		if (SirkulaUdara.equalsIgnoreCase("lancar")) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisisPencahayaan(int NilaiCahaya) {
		if (NilaiCahaya >= 250 && NilaiCahaya <= 350) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisisKelembapan(int KeLembapan) {
		if (KeLembapan >= 70 && KeLembapan <= 80) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisisSuhu(int Suhu) {
		if (Suhu >= 25 && Suhu <= 35) {
			return "Sesuai";
		} else {
			return "Tidak Sesuai";
		}
	}

	String AnalisisKenyamanan(String KeBisingan, String Bau, String Bocor,
			String KeRusakan, String KeAusan) {
		int nilai = 5;

		if (KeBisingan.equalsIgnoreCase("tidak bising")) {
			nilai--;
		}

		if (Bau.equalsIgnoreCase("tidak bau")) {
			nilai--;
		}

		if (Bocor.equalsIgnoreCase("tidak bocor")) {
			nilai--;
		}

		if (KeRusakan.equalsIgnoreCase("tidak rusak")) {
			nilai--;
		}

		if (KeAusan.equalsIgnoreCase("tidak aus")) {
			nilai--;
		}

		if (nilai == 0) {
			return "sesuai";
		} else {
			return "tidak sesuai";
		}
	}

	String AnalisisKeamanan(String KekoKohan, String PintuBkunci,
			String JendelaBkunci, String Bahaya) {
		int nilai = 4;

		if (KekoKohan.equalsIgnoreCase("kokoh")) {
			nilai--;
		}

		if (PintuBkunci.equalsIgnoreCase("ada")) {
			nilai--;
		}

		if (JendelaBkunci.equalsIgnoreCase("ada")) {
			nilai--;
		}

		if (Bahaya.equalsIgnoreCase("aman")) {
			nilai--;
		}

		if (nilai == 0) {
			return "sesuai";
		} else {
			return "tidak sesuai";
		}
	}
}
