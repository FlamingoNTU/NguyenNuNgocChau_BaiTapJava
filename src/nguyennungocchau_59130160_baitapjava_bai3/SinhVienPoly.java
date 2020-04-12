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
    private String hoTen;
    private String nganh;

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
    
    public abstract double getDiem();
    
    public String getHocLuc(){
        if(getDiem() < 5) return "Yeu";
        else if (getDiem() < 6 && getDiem() >= 5) 
            return "Trung Binh";
        else if (getDiem() < 7.5 && getDiem() >= 6.5) 
            return "Kha";
        else if (getDiem() < 9 && getDiem() >= 7.5) 
            return "Gioi";
        return "Xuat Sac";
    }
    
    public void xuat(){
        System.out.println("Ten sinh vien: " + hoTen);
        System.out.println("Nganh hoc: " + nganh);
    }
}
