package triality_code;

import java.util.Scanner;

public class TampilkanData extends PropertiesRkelas implements InterfaceTampilan{
	Scanner scan = new Scanner(System.in);

	public TampilkanData(String NamaRuang, String Lokasi, String Fakultas,
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
	
	@Override
	public void TampilkanIdentitas(String NamaRuang, String Lokasi, String Fakultas,
								   String Prodi) {
		System.out.println("=================Identitas Kelas=================");
		System.out.println("Nama Ruang	: " + super.getNamaRuang());
		System.out.println("Lokasi		: " + super.getLokasi());
		System.out.println("Fakultas	: " + super.getFakultas());
		System.out.println("Program Studi	: " + super.getProdi());
		System.out.println("=================================================");
	}
	
	@Override
	public void TampilkanKondisi(int Panjang, int Lebar, int JmlKursi, int JmlPintu,
								 int JmlJendela) {
		System.out.println("==================Kondisi Kelas==================");
		System.out.println("Panjang	: " + super.getPanjang());
		System.out.println("Lebar		: " + super.getLebar());
		System.out.println("Luas		: "
				+ HitungLuas(super.getPanjang(), super.getLebar()));
		System.out.println(BentukRuang(super.getPanjang(), super.getLebar()));
		System.out.println("Rasio		: "
				+ HitungRasio(super.getLuas(), super.getJmlKursi(),
						super.getPanjang(), super.getLebar()));
		System.out.println(HitungRasionya(super.getLuas(), super.getJmlKursi(),
				super.getPanjang(), super.getLebar()));
		System.out.println("Jumlah Kursi	: " + super.getJmlKursi());
		System.out.println("Jumlah Pintu	: " + super.getJmlPintu());
		System.out.println("Jumlah Jendela	: " + super.getJmlJendela());
		System.out.println(AnalisPintuNjendela(super.getJmlPintu(),
				super.getJmlJendela()));
		System.out.println("=================================================");
	}

	@Override
	public void TampilkanSarana(int JmlSteker, String KondisiSteker,
								String PosisiSteker, int JmlKabelLCD, String KondisiKabelLCD,
								String PosisiKabelLCD, int JmlLampu, String KondisiLampu,
								String PosisiLampu, int JmlKipas, String KondisiKipas,
								String PosisiKipas, int JmlAC, String KondisiAC, String PosisiAC,
								int JmlCCTV, String KondisiCCTV, String PosisiCCTV, String SSID,
								double Bandwith) {
		System.out.println("===================Sarana Kelas==================");
		System.out.println("Jumlah Stop Kontak : " + super.getJmlSteker());
		System.out.println("Kondisi Stop Kontak : " + super.getKondisiSteker());
		System.out.println("Posisi Stop Kontak : " + super.getPosisiSteker());
		System.out.println(AnalisKelistrikan(super.getJmlSteker(),
				super.getKondisiSteker(), super.getPosisiSteker()));

		System.out.println("Jumlah Kabel LCD : " + super.getJmlKabelLCD());
		System.out.println("Kondisi Kabel LCD : " + super.getKondisiKblLCD());
		System.out.println("Posisi Kabel LCD : " + super.getPosisiKblLCD());
		System.out.println(AnalisLCD(super.getJmlKabelLCD(),
				super.getKondisiKblLCD(), super.getPosisiKblLCD()));

		System.out.println("Jumlah Lampu : " + super.getJmlLampu());
		System.out.println("Kondisi Lampu : " + super.getKondisiLampu());
		System.out.println("Posisi Lampu : " + super.getPosisiLampu());
		System.out.println(AnalisLampu(super.getJmlLampu(),
				super.getKondisiLampu(), super.getPosisiLampu()));

		System.out.println("Jumlah Kipas Angin : " + super.getJmlKipas());
		System.out.println("Kondisi Kipas Angin : " + super.getKondisiKipas());
		System.out.println("Posisi Kipas Angin : " + super.getPosisiKipas());
		System.out.println(AnalisKipas(super.getJmlKipas(),
				super.getKondisiKipas(), super.getPosisiKipas()));

		System.out.println("Jumlah AC : " + super.getJmlAC());
		System.out.println("Kondisi AC : " + super.getKondisiAC());
		System.out.println("Posisi AC : " + super.getPosisiAC());
		System.out.println(AnalisAC(super.getJmlAC(), super.getKondisiAC(),
				super.getPosisiAC()));

		System.out.println("Pilih SSID : " + super.getSSID());
		System.out.println("Masuk Bandwith : " + super.getBandwith());
		System.out.println(AnalisInternet(super.getSSID(), super.getLogin()));

		System.out.println("Jumlah CCTV : " + super.getJmlCCTV());
		System.out.println("Kondisi CCTV : " + super.getKondisiCCTV());
		System.out.println("Posisi CCTV : " + super.getPosisiCCTV());
		System.out.println(AnalisCCTV(super.getJmlCCTV(),
				super.getKondisiCCTV(), super.getPosisiCCTV()));

	}

	@Override
	public void TampilkanLingkungan(String KondisiLante, String KondisiDinding,
									String KondisiAtap, String KondisiPintu, String KondisiJendela) {
		System.out.println("==================Lingkungan Kelas===============");
		System.out.println("Kondisi Lantai : " + super.getKondisiLante());
		System.out.println("Kondisi Dinding : " + super.getKondisiDinding());
		System.out.println("Kondisi Atap : " + super.getKondisiAtap());
		System.out.println("Kondisi Pintu : " + super.getKondisiPintu());
		System.out.println("Kondisi Jendela : " + super.getKondisiJendela());
		System.out.println("=================================================");
	}

	@Override
	public void TampilkanKebersihan(String SirkulaUdara, int NilaiCahaya,
									int KeLembapan, int Suhu) {
		System.out.println("==================Kebersihan Kelas===============");
		System.out.println("Sirkulasi Udara : " + super.getSirkulaUdara());
		System.out.println("Nilai Pencahayaan : " + super.getNilaiCahaya());
		System.out.println("Kelembapan (%) : " + super.getKeLembapan());
		System.out.println("Suhu (celcius) : " + super.getSuhu());
		System.out.println("=================================================");
	}

	@Override
	public
	void TampilKenyamanan(String keBisingan, String Bau, String Bocor,
			              String KeRusakan, String KeAusan) {
		System.out.println("==================Kenyamanan Kelas===============");
		System.out.println("Kebisingan : " + super.getKeBisingan());
		System.out.println("Kondisi Bau Ruangan : " + super.getBau());
		System.out.println("Kebocoran : " + super.getBocor());
		System.out.println("Kerusakan Ruangan : " + super.getKeRusakan());
		System.out.println("Kondisi AUS Ruangan : " + super.getKeAusan());
		System.out.println("=================================================");
	}
	
	@Override
	public void TampilKeamanan(String KeKokohan, String Bahaya, int KunciPintu,
						int KunciJendela) {

			System.out.println("==================Kondisi Kelas==================");
			System.out.println("Kekokohan Ruangan : " + super.getKeKokohan());
			System.out.println("Kunci Pintu Ruangan  : " + super.getKunciPintu());
			System.out.println("Kunci Jendela Ruangan : " + super.getKunciJendela());
			System.out.println("Intensitas Bahaya Ruangan : " + super.getBahaya());
			System.out.println("=================================================");
			System.out.println("########");
	}

}
