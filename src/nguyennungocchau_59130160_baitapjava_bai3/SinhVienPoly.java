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
public abstract class SinhVienPoly {
    public String hoTen;
    public String nganh;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public void getDiem(){
        
    }
    
    public void getHocLuc(){
        
    }
    
    public void xuat(){
        System.out.println("Ten sinh vien: " + hoTen);
        System.out.println("Nganh hoc sinh vien: " + nganh);
    }
}
