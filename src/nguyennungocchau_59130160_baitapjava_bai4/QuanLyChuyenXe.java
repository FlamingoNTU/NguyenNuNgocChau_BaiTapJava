/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_baitapjava_bai4;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe> CX = new ArrayList<>();

    public QuanLyChuyenXe() {
    }
    
    public void themCX(ChuyenXe cx){
        CX.add(cx);
    }
    
    public void xuatCX(ChuyenXe cx){
        for(int i = 0; i < CX.size(); i++){
            System.out.println("Ma so chuyen: " + CX.get(i).maSoChuyen + "\nHo ten tai xe: " + CX.get(i).hoTenTaiXe);                
        }                
    }
    
    public void inThongTin(){
        for(int i = 0; i < CX.size(); i++){
            CX.get(i).xuat();
            System.out.println("\n");
        }            
    }
    
    public void tinhTongDoanhThuTheoLoai(){
        double doanhThuNoiThanh = 0;
        double doanhThuNgoaiThanh = 0;
        for(int i = 0; i < CX.size(); i++){                                
            if( CX.get(i) instanceof XeNoiThanh) 
                doanhThuNoiThanh += CX.get(i).doanhThu;
            if( CX.get(i) instanceof XeNgoaiThanh) 
                doanhThuNgoaiThanh += CX.get(i).doanhThu;                
        }            
        System.out.println("Doanh thu xe nội thành: " + doanhThuNoiThanh);
        System.out.println("Doanh thu xe ngoại thành: " + doanhThuNgoaiThanh);
        System.out.println();        
    }
    
    public void tinhTongDoanhThu(){
        double doanhThu = 0;
        for(int i = 0; i < CX.size(); i++){
            doanhThu += CX.get(i).doanhThu;
        }            
        System.out.println("Tong doanh thu: " + doanhThu);        
    }   
}
