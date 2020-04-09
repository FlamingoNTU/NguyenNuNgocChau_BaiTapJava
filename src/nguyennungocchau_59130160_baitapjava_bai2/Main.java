/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_baitapjava_bai2;

import nguyennungocchau_59130160_baitapjava_bai1.NhanVien;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien ds = new QuanLyNhanVien();
        NhanVien NV1 = new NhanVien("Nguyen Ngoc Chau", 21, "Nha Trang", 200000, 8);
        NhanVien NV2 = new NhanVien("Nguyen Ngoc Anh", 35, "Phu Yen", 500000, 10);
        NhanVien NV3 = new NhanVien("Nguyen Ngoc Xuan", 20, "Tuy Hoa", 2000000, 12);
        NhanVien NV4 = new NhanVien("Nguyen Ngoc Ngan", 18, "Da Nang", 800000, 24);
        NhanVien NV5 = new NhanVien("Nguyen Ngoc Thanh", 25, "Binh Dinh", 1000000, 14);
        
        ds.them(NV1);
        ds.them(NV2);
        ds.them(NV3);
        ds.them(NV4);
        ds.them(NV5);
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Nhan vien thu: " + i);
            ds.NV[i].getThongTin();
        }
       
    }
    
    
}
