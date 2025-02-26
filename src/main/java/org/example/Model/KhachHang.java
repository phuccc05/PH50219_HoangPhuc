package org.example.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KhachHang {
    private String maKhachHang;
    private String tenKhachHang;
    private Integer tuoi;
    private String email;
    private String soDienThoai;
}
