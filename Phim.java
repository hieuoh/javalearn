public class Phim {;
	private String Ten;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private NgayChieu ngayChieu;
	
	public Phim(String ten, int namsx,HangSanXuat hsx,double giave,NgayChieu ngaychieu) {
		this.Ten=ten;
		this.namSanXuat=namsx;
		this.hangSanXuat=hsx;
		this.giaVe=giave;
		this.ngayChieu=ngaychieu;
	}
	public String getTen() {
		return this.Ten;
	}
	public void setTen(String ten) {
		this.Ten=ten;
	}
	public int getnamSanXuat() {
		return this.namSanXuat;
	}
	public void setnamSanXuat(int namsx) {
		if(namsx>=1) {
		this.namSanXuat=namsx;}
		else {
			this.namSanXuat=1;
		}
	}
	public HangSanXuat gethangSanXuat() {
		return this.hangSanXuat;
	}
	public void sethangSanXuat(HangSanXuat hangsx) {
		this.hangSanXuat=hangsx;
	}
	public double getgiaVe() {
		return this.giaVe;
	}
	public void setgiaVe(double giave) {
		if(giave>=0) {
		this.giaVe=giave;}
		else {
			this.giaVe=0;
		}
	}
	public NgayChieu getngayChieu() {
		return this.ngayChieu;
	}
	public void setngayChieu(NgayChieu ngaychieu) {
		this.ngayChieu=ngaychieu;
	}
	public boolean kiemTraGiaReHonHayKhong(Phim phimkhac) {
		return this.giaVe>phimkhac.giaVe;
	}
	public String TenHangSanXuaPhim() {
		return this.hangSanXuat.gettenHang();
	}
	public double GiaVeSauKhuyenMai(double x) {
		return this.giaVe*(1-(x/100));
	}
	

}
