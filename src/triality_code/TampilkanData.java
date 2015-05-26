package triality_code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("Identitas.txt"));
		System.out.println("=================Identitas Kelas=================");
		System.out.println("Nama Ruang	: " + super.getNamaRuang());
		out.write(getNamaRuang());
		System.out.println("Lokasi		: " + super.getLokasi());
		out.write(getLokasi());
		System.out.println("Fakultas	: " + super.getFakultas());
		out.write(getFakultas());
		System.out.println("Program Studi	: " + super.getProdi());
		out.write(getProdi());
		System.out.println("=================================================");
		out.close();
		}
		catch (IOException i){
			
		}
	}
	
	@Override
	public void TampilkanKondisi(int Panjang, int Lebar, int JmlKursi, int JmlPintu,
								 int JmlJendela) {
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("Kondisi.txt"));
		System.out.println("==================Kondisi Kelas==================");
		System.out.println("Panjang	: " + super.getPanjang());
		out.write((int) getPanjang());
		System.out.println("Lebar		: " + super.getLebar());
		out.write((int) getLebar());
		System.out.println("Luas		: " + HitungLuas(super.getPanjang(),super.getLebar()));
		out.write((int) getLuas());
		System.out.println(BentukRuang(super.getPanjang(), super.getLebar()));
		out.write(BentukRuang(Lebar, Lebar));
		System.out.println("Rasio		: " + HitungRasio(super.getLuas(), super.getJmlKursi(), 
				super.getPanjang(), super.getLebar()));
		out.write((int) HitungRasio(getLuas(), JmlKursi, Panjang, getLebar()));
		System.out.println(HitungRasionya(super.getLuas(), super.getJmlKursi(),
				super.getPanjang(), super.getLebar()));
		out.write(HitungRasionya(getLuas(), JmlKursi, Panjang, Lebar));
		System.out.println("Jumlah Kursi	: " + super.getJmlKursi());
		out.write((int) getJmlKursi());
		System.out.println("Jumlah Pintu	: " + super.getJmlPintu());
		out.write((int) getJmlPintu());
		System.out.println("Jumlah Jendela	: " + super.getJmlJendela());
		out.write((int) getJmlJendela());
		System.out.println(AnalisPintuNjendela(super.getJmlPintu(),
				super.getJmlJendela()));
		out.write(AnalisPintuNjendela(JmlPintu, JmlJendela));
		System.out.println("=================================================");
		out.close();
		}
		catch (IOException i){
			
		}
	}

	@Override
	public void TampilkanSarana(int JmlSteker, String KondisiSteker,
								String PosisiSteker, int JmlKabelLCD, String KondisiKabelLCD,
								String PosisiKabelLCD, int JmlLampu, String KondisiLampu,
								String PosisiLampu, int JmlKipas, String KondisiKipas,
								String PosisiKipas, int JmlAC, String KondisiAC, String PosisiAC,
								int JmlCCTV, String KondisiCCTV, String PosisiCCTV, String SSID,
								double Bandwith) {
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("Sarana.txt"));
		System.out.println("===================Sarana Kelas==================");
		System.out.println("Jumlah Stop Kontak : " + super.getJmlSteker());
		out.write(getJmlSteker());
		System.out.println("Kondisi Stop Kontak : " + super.getKondisiSteker());
		out.write(getKondisiSteker());
		System.out.println("Posisi Stop Kontak : " + super.getPosisiSteker());
		out.write(getPosisiSteker());
		System.out.println(AnalisKelistrikan(super.getJmlSteker(),
				super.getKondisiSteker(), super.getPosisiSteker()));
		out.write(AnalisKelistrikan(JmlSteker, KondisiSteker, PosisiSteker));

		System.out.println("Jumlah Kabel LCD : " + super.getJmlKabelLCD());
		out.write(getJmlKabelLCD());
		System.out.println("Kondisi Kabel LCD : " + super.getKondisiKblLCD());
		out.write(getKondisiKblLCD());
		System.out.println("Posisi Kabel LCD : " + super.getPosisiKblLCD());
		out.write(getPosisiKblLCD());
		System.out.println(AnalisLCD(super.getJmlKabelLCD(),
				super.getKondisiKblLCD(), super.getPosisiKblLCD()));
		out.write(AnalisLCD(JmlKabelLCD, getKondisiKblLCD(), getKondisiKblLCD()));

		System.out.println("Jumlah Lampu : " + super.getJmlLampu());
		out.write(getJmlLampu());
		System.out.println("Kondisi Lampu : " + super.getKondisiLampu());
		out.write(getKondisiLampu());
		System.out.println("Posisi Lampu : " + super.getPosisiLampu());
		out.write(getPosisiLampu());
		System.out.println(AnalisLampu(super.getJmlLampu(),
				super.getKondisiLampu(), super.getPosisiLampu()));
		out.write(AnalisLampu(JmlLampu, KondisiLampu, PosisiLampu));

		System.out.println("Jumlah Kipas Angin : " + super.getJmlKipas());
		out.write(getJmlKipas());
		System.out.println("Kondisi Kipas Angin : " + super.getKondisiKipas());
		out.write(getKondisiKipas());
		System.out.println("Posisi Kipas Angin : " + super.getPosisiKipas());
		out.write(getPosisiKipas());
		System.out.println(AnalisKipas(super.getJmlKipas(),
					super.getKondisiKipas(), super.getPosisiKipas()));
		out.write(AnalisKipas(getJmlKipas(), KondisiKipas, PosisiKipas));

		System.out.println("Jumlah AC : " + super.getJmlAC());
		out.write(getJmlAC());
		System.out.println("Kondisi AC : " + super.getKondisiAC());
		out.write(getKondisiAC());
		System.out.println("Posisi AC : " + super.getPosisiAC());
		out.write(getPosisiAC());
		System.out.println(AnalisAC(super.getJmlAC(), super.getKondisiAC(),
				super.getPosisiAC()));
		out.write(AnalisAC(JmlAC, KondisiAC, PosisiAC));

		System.out.println("Pilih SSID : " + super.getSSID());
		out.write(getSSID());
		System.out.println("Masuk Bandwith : " + super.getBandwith());
		out.write((int)getBandwith());
		System.out.println(AnalisInternet(super.getSSID(), super.getLogin()));
		out.write(AnalisInternet(SSID, getLogin()));

		System.out.println("Jumlah CCTV : " + super.getJmlCCTV());
		out.write(getJmlCCTV());
		System.out.println("Kondisi CCTV : " + super.getKondisiCCTV());
		out.write(getKondisiCCTV());
		System.out.println("Posisi CCTV : " + super.getPosisiCCTV());
		out.write(getPosisiCCTV());
		System.out.println(AnalisCCTV(super.getJmlCCTV(),
				super.getKondisiCCTV(), super.getPosisiCCTV()));
		out.write(AnalisCCTV(JmlCCTV, KondisiCCTV, PosisiCCTV));
		System.out.println("=================================================");
		out.close();
		}
		catch (IOException i){
			
		}
	}

	@Override
	public void TampilkanLingkungan(String KondisiLante, String KondisiDinding,
									String KondisiAtap, String KondisiPintu, String KondisiJendela) {
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("Lingkungan.txt"));
		System.out.println("==================Lingkungan Kelas===============");
		System.out.println("Kondisi Lantai : " + super.getKondisiLante());
		out.write(getKondisiLante());
		System.out.println("Kondisi Dinding : " + super.getKondisiDinding());
		out.write(getKondisiDinding());
		System.out.println("Kondisi Atap : " + super.getKondisiAtap());
		out.write(getKondisiAtap());
		System.out.println("Kondisi Pintu : " + super.getKondisiPintu());
		out.write(getKondisiPintu());
		System.out.println("Kondisi Jendela : " + super.getKondisiJendela());
		out.write(getKondisiJendela());
		System.out.println("=================================================");
		out.close();
		}
		catch (IOException i){
			
		}
	}

	@Override
	public void TampilkanKebersihan(String SirkulaUdara, int NilaiCahaya,
									int KeLembapan, int Suhu) {
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("Kebersihan.txt"));
		System.out.println("==================Kebersihan Kelas===============");
		System.out.println("Sirkulasi Udara : " + super.getSirkulaUdara());
		out.write(getSirkulaUdara());
		System.out.println("Nilai Pencahayaan : " + super.getNilaiCahaya());
		out.write(getNilaiCahaya());
		System.out.println("Kelembapan (%) : " + super.getKeLembapan());
		out.write(getKeLembapan());
		System.out.println("Suhu (celcius) : " + super.getSuhu());
		out.write(getSuhu());
		System.out.println("=================================================");
		out.close();
		}
		catch (IOException i){
			
		}
	}

	@Override
	public
	void TampilKenyamanan(String keBisingan, String Bau, String Bocor,
			              String KeRusakan, String KeAusan) {
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("kenyamanan.txt"));
		System.out.println("==================Kenyamanan Kelas===============");
		System.out.println("Kebisingan : " + super.getKeBisingan());
		out.write(getKeBisingan());
		System.out.println("Kondisi Bau Ruangan : " + super.getBau());
		out.write(getBau());
		System.out.println("Kebocoran : " + super.getBocor());
		out.write(getBocor());
		System.out.println("Kerusakan Ruangan : " + super.getKeRusakan());
		out.write(getKeRusakan());
		System.out.println("Kondisi AUS Ruangan : " + super.getKeAusan());
		out.write(getKeAusan());
		System.out.println("=================================================");
		out.close();
		}
		catch (IOException i){
			
		}
	}
	
	@Override
	public void TampilKeamanan(String KeKokohan, String Bahaya, int KunciPintu,
						int KunciJendela) {

		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("Keamanan.txt"));
		System.out
				.println("==================Kondisi Kelas==================");
		System.out.println("Kekokohan Ruangan : " + super.getKeKokohan());
		out.write(getKeKokohan());
		System.out
				.println("Kunci Pintu Ruangan  : " + super.getKunciPintu());
		out.write(getKunciPintu());
		System.out.println("Kunci Jendela Ruangan : "
				+ super.getKunciJendela());
		out.write(getKunciJendela());
		System.out.println("Intensitas Bahaya Ruangan : "
				+ super.getBahaya());
		out.write(getBahaya());
		System.out
				.println("=================================================");
		System.out.println("########");
		out.close();
		}
		catch (IOException i){
			
		}
	}

}
