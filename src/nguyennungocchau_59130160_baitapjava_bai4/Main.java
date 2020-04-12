/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_baitapjava_bai4;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        ChuyenXe NoiThanh1 = new XeNoiThanh(1, 20, "C001", "Nguyen Quang Cao", "79H1-001", 100000);
        ChuyenXe NoiThanh2 = new XeNoiThanh(2, 35, "C002", "Tran Van Tien", "77H1-002", 50000);
        ChuyenXe NoiThanh3 = new XeNoiThanh(3, 50, "C003", "Le Gia Bao", "78H1-003", 3000000);
        
        ChuyenXe NgoaiThanh1 = new XeNgoaiThanh("Ha Noi", 14, "C004", "Le Gia Phuc", "79N1-004", 300000);
        ChuyenXe NgoaiThanh2 = new XeNgoaiThanh("Tuy Hoa", 5, "C005", "Cao Van Hau", "79Z1-005", 150000);
        ChuyenXe NgoaiThanh3 = new XeNgoaiThanh("Nha Trang", 7, "C006", "Do Duy Manh", "51V1-006", 100000);
        
        QuanLyChuyenXe ds = new QuanLyChuyenXe();
        ds.themCX(NoiThanh1);
        ds.themCX(NoiThanh2);
        ds.themCX(NoiThanh3);
        ds.themCX(NgoaiThanh1);
        ds.themCX(NgoaiThanh2);
        ds.themCX(NgoaiThanh3);
        
        for(int i = 0; i < 6; i++){
            System.out.println("THONG TIN CHUYEN XE THU: " + (i+1));
            ds.CX.get(i).xuat();
            System.out.println("---------------------------------");
        }
        System.out.println("----------- DOANH THU -----------");
        ds.tinhTongDoanhThuTheoLoai();
        ds.tinhTongDoanhThu();
    }
}
