
public class Test {
	
	public static void main(String[] args) {
		NgayChieu nc1=new NgayChieu(1, 1, 2025);
		NgayChieu nc2=new NgayChieu(2, 3, 2024);
		NgayChieu nc3=new NgayChieu(1, 11, 2025);
		HangSanXuat hsx1=new HangSanXuat("vip", "VietNam");
		HangSanXuat hsx2=new HangSanXuat("noVip", "HoaKy");
		HangSanXuat hsx3=new HangSanXuat("on", "Trung quoc");
		Phim p1=new Phim("phim moi nam nay hay", 2023, hsx1, 15000, nc1);
		Phim p2=new Phim("phim tam nam nay hay", 2022, hsx2, 8000, nc2);
		Phim p3=new Phim("phim on nam nay hay", 2021, hsx3, 10000, nc3);
		
		System.out.println("Gia p1 co re hon p2 hay khong: "+ p1.kiemTraGiaReHonHayKhong(p3));
		System.out.println("Gia p2 co re hon p3 hay khong: "+ p2.kiemTraGiaReHonHayKhong(p3));
		System.out.println("Hang san xuat phim p1 la: "+p1.TenHangSanXuaPhim());
		System.out.println("Hang san xuat phim p2 la: "+p2.TenHangSanXuaPhim());
		System.out.println("Hang san xuat phim p3 la: "+p3.TenHangSanXuaPhim());
		
		System.out.println("Gia phim p1 sau giam gia la"+p1.GiaVeSauKhuyenMai(10));
		System.out.println("Gia phim p2 sau giam gia la"+p2.GiaVeSauKhuyenMai(10));
		System.out.println("Gia phim p3 sau giam gia la"+p3.GiaVeSauKhuyenMai(10));
		
		
		
	}
	

}
