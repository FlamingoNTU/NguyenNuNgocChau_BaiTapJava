/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyennungocchau_59130160_bt1;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LopHoc LH = new LopHoc();
        HocSinh HS1 = new HocSinh("59CNTT1", "Hat", "Ngoc Chau", 21, "Nha Trang", "0886906127");
        HocSinh HS2 = new HocSinh("58CNTT1", "Mua", "Nhat Thien", 22, "Ha Noi", "0923510851");
        
        GiaoVien GV1 = new GiaoVien("Mau thiet ke", "Lap trinh", "Ngoc Xuan", 40, "Phu Yen", "0923127427");
        GiaoVien GV2 = new GiaoVien("Cong nghe phan mem", "Truyen thong", "Ngoc Anh", 50, "Binh Dinh", "0982130516");
        
        LH.themHocSinh(HS1);
        LH.themHocSinh(HS2);
        
        LH.themGVGD(GV1);
        LH.themGVGD(GV2);
        
        System.out.println("DANH SACH HOC SINH: \n");
        LH.inDSHS();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("DANH SACH GIAO VIEN GIANG DAY: \n");
        LH.inDSGVGD();
    }
    
}
