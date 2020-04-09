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
public class QuanLyNhanVien implements IQuanLy{
    NhanVien[] NV = new NhanVien[50];
    int k = 0;
    
    @Override
    public void them(NhanVien nv) {
        NV[k] = new NhanVien();
        NV[k] = nv;
        k++;
    }

    @Override
    public void inDS() {
       for(int i = 0; i < k; i++)
       {
           System.out.println("Nhan vien thu: " + i);
           NV[i].getThongTin();
       }
    }
    
}
