/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_baitapjava_bai1;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        NhanVien NV1 = new NhanVien("Chau", 21, " Nha Trang", 100000, 100);
        NhanVien NV2 = new NhanVien("Xuan", 20, " Phu Yen", 200000, 70);
        

        System.out.println("THONG TIN NHAN VIEN THU 1: ");
        NV1.getThongTin();
        System.out.println("---------------------------");
        System.out.println("THONG TIN NHAN VIEN THU 2: ");
        NV2.getThongTin();
    }
}
