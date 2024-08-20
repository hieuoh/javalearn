public class HangSanXuat {
	private String tenHang;
	private String quocGia;
	public HangSanXuat(String tH,String qG){
		this.tenHang=tH;
		this.quocGia=qG;
		
		
	}
	public String gettenHang() {
		return this.tenHang;
	}
	public void settenHang(String tH) {
		 this.tenHang=tH;
		
	}
	public String getquocGia() {
		return this.quocGia;
	}
	public void setquocGia(String qG) {
		this.quocGia=qG;
	}
	public String toString() {
		return "Quoc gia: "+this.quocGia+". Day la ten hang: "+this.tenHang;
	}
	

}
