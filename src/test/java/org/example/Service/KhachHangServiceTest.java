package org.example.Service;

import org.example.Model.KhachHang;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KhachHangServiceTest {
    private KhachHangService khachHangService;

    @BeforeEach
    void setUp() {
        khachHangService = new KhachHangService();
    }

    @Test
    void timKhachHang() {
        KhachHang khachHang = new KhachHang("KH01", "Nguyen Van A", 19,"nguyena@gmail.com", "0123456789");
        khachHangService.getDanhSachKhachHang().add(khachHang);
        KhachHang khachHang1 = khachHangService.timKhachHang("KH01");
        assertEquals(khachHang, khachHang1);
    }
    @Test
    void timKhachHang2() {
        KhachHang khachHang = new KhachHang("KH01", "Nguyen Van A", 19,"nguyena@gmail.com", "0123456789");
        khachHangService.getDanhSachKhachHang().add(khachHang);
        KhachHang khachHang1 = khachHangService.timKhachHang("KH02");
        assertEquals(khachHang, khachHang1);
    }
    @Test
    void timKhachHang3() {
        KhachHang khachHang = new KhachHang("KH03", "Nguyen Van A", 19,"nguyena@gmail.com", "0123456789");
        khachHangService.getDanhSachKhachHang().add(khachHang);
        KhachHang khachHang1 = khachHangService.timKhachHang("KH03");
        assertEquals(khachHang, khachHang1);
    }
    @Test
    void timKhachHang4() {
        KhachHang khachHang = new KhachHang("KH03", null, 19,"nguyena@gmail.com", "0123456789");
        khachHangService.getDanhSachKhachHang().add(khachHang);
        KhachHang khachHang1 = khachHangService.timKhachHang("KH03");
        assertEquals(khachHang, khachHang1);
    }
    @Test
    void timKhachHang5() {
        KhachHang khachHang = new KhachHang("KH03", "Nguyen Van C", 19,null, "0123456789");
        khachHangService.getDanhSachKhachHang().add(khachHang);
        KhachHang khachHang1 = khachHangService.timKhachHang("KH03");
        assertEquals(khachHang, khachHang1);
    }
}