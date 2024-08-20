public class Testsv {
	
	public static void main(String[] args) {
		Lop l1=new Lop("A", "toan");
		Lop l2=new Lop("A", "ly");
		Lop l3=new Lop("B", "hoa");
		Lop l4=new Lop("C", "sua");
		
		NgaySinh ns1=new NgaySinh(1, 5, 1999);
		NgaySinh ns2=new NgaySinh(2, 10, 1999);
		NgaySinh ns3=new NgaySinh(3, 5, 1999);
		NgaySinh ns4=new NgaySinh(1, 5, 1999);
		
		SinhVien sv1=new SinhVien(1, "Nguyen Van A", ns1, 5.5, l4);
		SinhVien sv2=new SinhVien(1, "Nguyen Van B", ns2, 8.8, l3);
		SinhVien sv3=new SinhVien(1, "Nguyen Van C", ns4, 4.0, l2);
		SinhVien sv4=new SinhVien(1, "Nguyen Van D", ns3, 9.9, l1);
		
		System.out.println("Lop cua sv1 la: "+sv1.lop());
		System.out.println("Lop cua sv2 la: "+sv2.lop());
		System.out.println("Lop cua sv3 la: "+sv3.lop());
		System.out.println("Lop cua sv4 la: "+sv4.lop());
		
		System.out.println("Sinh vien sv1 co dau hay khong: "+sv1.dauHayKhong());
		System.out.println("Sinh vien sv2 co dau hay khong: "+sv2.dauHayKhong());
		System.out.println("Sinh vien sv3 co dau hay khong: "+sv3.dauHayKhong());
		System.out.println("Sinh vien sv4 co dau hay khong: "+sv4.dauHayKhong());
        
		System.out.println("Ngay thang nam sinh cua sv1 co giong ngay sinh cua sv4 khong: "+sv1.kiemTraNgaySinhGiongNhau(sv4));
		System.out.println("Ngay thang nam sinh cua sv1 co giong ngay sinh cua sv2 khong: "+sv1.kiemTraNgaySinhGiongNhau(sv2));
		System.out.println("Ngay thang nam sinh cua sv1 co giong ngay sinh cua sv3 khong: "+sv1.kiemTraNgaySinhGiongNhau(sv3));
		System.out.println("Ngay thang nam sinh cua sv3 co giong ngay sinh cua sv4 khong: "+sv3.kiemTraNgaySinhGiongNhau(sv4));
		
		
		
	}

}
