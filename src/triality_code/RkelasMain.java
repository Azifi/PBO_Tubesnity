package triality_code;

public class RkelasMain {

	public static void main(String[] auch){
		MasukanData Masukin = new MasukanData("namaRuang", "lokasi", "fakultas", "prodi", "kondisiSteker", "kondisiKblLCD",
				"kondisiLampu", "kondisiAC", "kondisiKipas", "kondisiCCTV", "kondisiLante",
				"kondisiDinding", "kondisiAtap", "kondisiPintu", "kondisiJendela",
				"sirkulaUdara", "login", "sSID", "posisiSteker", "posisiKblLCD", "posisiLampu",
				"posisiAC", "posisiKipas", "posisiCCTV", "keBisingan", "bau", "bocor", "keRusakan",
				"keAusan", "keKokohan", "bahaya", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,	0, 0, 0, 0, 0, 0, 0, 0);
		Masukin.IdentitasRkelas("namaRuang", "lokasi", "fakultas", "prodi");
		Masukin.KondisiRkelas(0, 0, 0, 0, 0);
		Masukin.SaranaRkelas(0, "KondisiSteker", "PosisiSteker", 0, "KondisiKblLCD", "PosisiKblLCD", 0, "KondisiLampu", "PosisiLampu", 
				0, "KondisiKipas", "PosisiKipas", 0, "KondisiAC", "PosisiAC", 0, "KondisiCCTV", "PosisiCCTV", "SSID", 0);
		/*Masukin.LingkunganRkelas();
		Masukin.KebersiahanRkelas();*/
		
		Masukin.KenyamananRkelas("Bising", "Bau", "Bocor", "KeRusakan", "AUS");
		
		Masukin.KeamananRkelas("Kokoh", "Bahaya", 0, 0);
		
		TampilkanData Oper = new TampilkanData (Masukin.getNamaRuang(), Masukin.getLokasi(), Masukin.getFakultas(), 
				Masukin.getProdi(), Masukin.getKondisiSteker(), Masukin.getKondisiKblLCD(),
				Masukin.getKondisiLampu(), Masukin.getKondisiAC(), Masukin.getKondisiKipas(), Masukin.getKondisiCCTV(), Masukin.getKondisiLante(),
				Masukin.getKondisiDinding(), Masukin.getKondisiAtap(), Masukin.getKondisiPintu(), Masukin.getKondisiJendela(),
				Masukin.getSirkulaUdara(), Masukin.getLogin(), Masukin.getSSID(), Masukin.getPosisiSteker(), Masukin.getPosisiKblLCD(), Masukin.getPosisiLampu(),
				Masukin.getPosisiAC(), Masukin.getPosisiKipas(), Masukin.getPosisiCCTV(), Masukin.getKeBisingan(), Masukin.getBau(), Masukin.getBocor(), Masukin.getKeRusakan(),
				Masukin.getKeAusan(), Masukin.getKeKokohan(), Masukin.getBahaya(),
				Masukin.getJmlPintu(), Masukin.getJmlJendela(), Masukin.getJmlKursi(), Masukin.getJmlSteker(), Masukin.getJmlKabelLCD(),
				Masukin.getJmlLampu(), Masukin.getJmlAC(), Masukin.getJmlKipas(), Masukin.getJmlCCTV(), Masukin.getNilaiCahaya(), Masukin.getKeLembapan(),
				Masukin.getSuhu(), Masukin.getKunciPintu(), Masukin.getKunciJendela(), Masukin.getPanjang(), Masukin.getLebar(), Masukin.getLuas(), Masukin.getBandwith());
		
		Oper.TampilkanIdentitas(Oper.getNamaRuang(), Oper.getLokasi(), Oper.getFakultas(), 
				Oper.getProdi());
		
		Oper.TampilkanKondisi(Oper.getPanjang(), Oper.getLebar(), Oper.getJmlKursi(), Oper.getJmlPintu(), Oper.getJmlJendela());
		
		Oper.TampilkanSarana(Oper.getJmlSteker(), Oper.getKondisiSteker(), Oper.getPosisiSteker(), Oper.getJmlKabelLCD(), Oper.getKondisiKblLCD(), 
				Oper.getPosisiKblLCD(), Oper.getJmlLampu(), Oper.getKondisiLampu(), Oper.getPosisiLampu(), Oper.getJmlKipas(), Oper.getKondisiKipas(),
				Oper.getPosisiKipas(), Oper.getJmlAC(), Oper.getKondisiAC(), Oper.getPosisiAC(), Oper.getJmlCCTV(), Oper.getKondisiCCTV(), Oper.getPosisiCCTV(), 
				Oper.getSSID(), Oper.getBandwith());
		
		/*Oper.TampilkanLingkungan();
		
		Oper.TampilkanKebersihan();*/
		
		Oper.TampilKenyamanan(Oper.getKeBisingan(), Oper.getBau(), Oper.getBocor(), Oper.getKeRusakan(), Oper.getKeAusan());
		
		Oper.TampilKeamanan(Oper.getKeKokohan(), Oper.getBahaya(), Oper.getKunciPintu(), Oper.getKunciJendela());		
		
	}
}
