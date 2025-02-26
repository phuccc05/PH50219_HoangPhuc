package org.example.Service;

import org.example.Model.KhachHang;

import java.util.ArrayList;
import java.util.List;

public class KhachHangService {
    private List<KhachHang> danhSachKhachHang = new ArrayList<>();

    public List<KhachHang> getDanhSachKhachHang() {
        return danhSachKhachHang;
    }
    public KhachHang timKhachHang(String maKhachHang) {
        for (KhachHang khachHang : danhSachKhachHang) {
            if (khachHang.getMaKhachHang().equals(maKhachHang) && khachHang.getTenKhachHang() != null) {
                return khachHang;
            }
        }
        return null;
    }
}
