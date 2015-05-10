package triality_code;

public class TampilkanData extends PropertiesRkelas {
RuangKelas baru = new RuangKelas();
	
	void TampilkanIdentitas(){
		System.out.println("=================Identitas Kelas=================");
		System.out.println("Nama Ruang	: " + baru.getNamaRuang());
		System.out.println("Lokasi		: " + baru.getLokasi());
		System.out.println("Fakultas	: " + baru.getFakultas());
		System.out.println("Program Studi	: " + baru.getProdi());
		System.out.println("=================================================");
	}
	void TampilkanKondisi(){
		System.out.println("==================Kondisi Kelas==================");
		System.out.println("Panjang	: " + baru.getPanjang());
		System.out.println("Lebar		: " + baru.getLebar());
		System.out.println("Luas		: " + HitungLuas(baru.getPanjang(), baru.getLebar()));
		System.out.println("Rasio		: " + HitungRasio(baru.getLuas(), baru.getJmlKursi(),baru.getPanjang(), baru.getLebar()));
		System.out.println("Jumlah Kursi	: " + baru.getJmlKursi());
		System.out.println("Jumlah Pintu	: " + baru.getJmlPintu());
		System.out.println("Jumlah Jendela	: " + baru.getJmlJendela());
		System.out.println("=================================================");
	}
	
}
