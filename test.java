
public class test {
	public static void main(String[] args) {
		Ngay ngay1 =new Ngay(15, 5, 2021);
		Ngay ngay2 =new Ngay(15, 9, 2030);
		Ngay ngay3 =new Ngay(15, 5, 2024);
		
		
		TacGia tacGia1=new TacGia("Hieu vv", ngay1);
		TacGia tacGia2=new TacGia("hieu pp", ngay2);
		TacGia tacGia3=new TacGia("Hieu oop", ngay3);
		
		Sach sach1=new Sach("Lap trinh python",5000,2023,tacGia1);
		Sach sach2=new Sach("Lap trinh java",10000,2023,tacGia2);
		Sach sach3=new Sach("Lap trinh c",15000,2025,tacGia3);
		
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();
		
		
		System.out.println("So sanh sach1 va 3 "+ sach1.kiemTraCungNamXuaBan(sach3));
		System.out.println("sach 1 giam 10%: "+sach1.giaSauKhiGiam(10));
		System.out.println("sach 2 giam 20%: "+sach2.giaSauKhiGiam(20));
		System.out.println("sach 3 giam 50%: "+sach3.giaSauKhiGiam(50));
		
		
	
	
		
		
		
	}

}
