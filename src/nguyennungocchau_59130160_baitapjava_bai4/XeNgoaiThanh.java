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
public class XeNgoaiThanh extends ChuyenXe{
    private String noiDen;    
    private int soNgayDiDuoc;

    public XeNgoaiThanh() {
    }

    public XeNgoaiThanh(String noiDen, int soNgayDiDuoc, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Noi den: " + noiDen);
        System.out.println("So ngay di duoc: " + soNgayDiDuoc);
    }
    
    
}
