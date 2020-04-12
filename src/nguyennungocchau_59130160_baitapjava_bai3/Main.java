/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_baitapjava_bai3;

/**
 *
 * @author Admin
 */
public class Main  {
    public static void main(String[] args) {
        SinhVienPoly svPoly = new SinhVienPoly("Le Van Binh", "Dien Tu") {
            @Override
            public double getDiem() {
                return 0;
            }
        };
        
        SinhVienPoly svIT = new SinhVienIT(6, 8, 7.5, "Nguyen Mai", "Cong nghe thong tin");                                             
        SinhVienPoly svBiz = new SinhVienBiz(7, 7, "Le Thi Ngoc", "Ke Toan");
        
        svIT.xuat();
        System.out.println("Diem: " + svIT.getDiem() + "\nHoc luc: " + svIT.getHocLuc());
        System.out.println("--------------------------------------------------");
        svBiz.xuat();
        System.out.println("Diem: " + svBiz.getDiem() + "\nHoc luc: " + svBiz.getHocLuc());
        System.out.println("--------------------------------------------------");
        svPoly.xuat();
        System.out.println("Diem: + " + svPoly.getDiem() + "\nHoc luc: " + svPoly.getHocLuc());                                    
    }
}
