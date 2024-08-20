public class NgaySinh {
	private int ngay,thang,nam;

	public NgaySinh(int ngay, int thang, int nam) {
		
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public int getNgay() {
		
		return ngay;
	
	}

	public void setNgay(int ngay) {
		if(ngay>=1 && ngay<=31) {
		this.ngay = ngay;}
		else {
			this.ngay=1;
		}
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		if(thang>=1 && thang<=12) {
		this.thang = thang;}
		else {
			this.thang=1;
		}
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		if(nam>=1) {
		this.nam = nam;}
		else {
			this.nam=1;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nam;
		result = prime * result + ngay;
		result = prime * result + thang;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NgaySinh other = (NgaySinh) obj;
		if (nam != other.nam)
			return false;
		if (ngay != other.ngay)
			return false;
		if (thang != other.thang)
			return false;
		return true;
	}
	
	

}
