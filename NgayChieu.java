public class NgayChieu {
	private int Ngay;
	private int Thang;
	private int Nam;
	public NgayChieu(int ngay, int thang, int nam) {
	
		this.Ngay = ngay;
		this.Thang = thang;
		this.Nam = nam;
	}
	public int getNgay() {
		return this.Ngay;
	}
	public void setNgay(int ngay) {
		if(ngay>=1 && ngay<=31) {
		this.Ngay = ngay;}
		
		else {
			this.Ngay=1;
		}
		
	}
	public int getThang() {
		return this.Thang;
	}
	public void setThang(int thang) {
		if(thang>=1 &&thang<=12) {
		this.Thang = thang;}
		else {
			this.Thang=1;
		}
	}
	public int getNam() {
		return Nam;
	}
	public void setNam(int nam) {
		if(nam>=1) {
		this.Nam = nam;}
		else {
			this.Nam=1;
		}
	}
	
	

}
