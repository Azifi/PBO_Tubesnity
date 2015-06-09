package venta.rista.task.err.mais;

public class SaranaSteker {
	private int JmlSteker, KondisiSteker, PosisiSteker;
	private String StatusKonSteker, StatusPosSteker;
	
	public int getJmlSteker() {
		return JmlSteker;
	}
	
	public int getKondisiSteker() {
		return KondisiSteker;
	}
	
	public int getPosisiSteker() {
		return PosisiSteker;
	}
	
	public String getStatusKonSteker() {
		return StatusKonSteker;
	}
	
	public String getStatusPosSteker() {
		return StatusPosSteker;
	}
	
	public void setJmlSteker(int jmlSteker) {
		this.JmlSteker = jmlSteker;
	}
	
	public void setKondisiSteker(int kondisiSteker) {
		this.KondisiSteker = kondisiSteker;
	}
	
	public void setPosisiSteker(int posisiSteker) {
		this.PosisiSteker = posisiSteker;
	}
	
	public void setStatusKonSteker(String statusKonSteker) {
		this.StatusKonSteker = statusKonSteker;
	}
	
	public void setStatusPosSteker(String statusPosSteker) {
		this.StatusPosSteker = statusPosSteker;
	}
	
}
