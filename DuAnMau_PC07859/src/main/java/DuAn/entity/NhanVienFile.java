/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAn.entity;

/**
 *
 * @author dinhh
 */
public class NhanVienFile {

    private String maNV;
    private String hoTen;
    private String vaiTro;
    private boolean kichHoat;

    public NhanVienFile(NhanVien nv) {
        this.maNV = "NV" + nv.getMaNV();
        this.hoTen = nv.getHoTen();
        this.vaiTro = nv.isVaiTro() ? "Trưởng phòng" : "Nhân viên";
        this.kichHoat = nv.isKichHoat();
    }

    public NhanVienFile() {
    }
    
    

}