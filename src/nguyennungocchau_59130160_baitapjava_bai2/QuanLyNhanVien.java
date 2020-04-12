/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_baitapjava_bai2;

import java.util.ArrayList;
import nguyennungocchau_59130160_baitapjava_bai1.NhanVien;

/**
 *
 * @author Admin
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> NV = new ArrayList<>();
    
    @Override
    public void them(NhanVien nv) {
        this.NV.add(nv);
    }

    @Override
    public void inDS() {
       for(int i = 0; i < NV.size(); i++)
       {
           System.out.println("Thong tin nhan vien thu: " + (i+1));
           NV.get(i).getThongTin();
           System.out.println("-------------------------------------------------");
       }
    }
    
}
