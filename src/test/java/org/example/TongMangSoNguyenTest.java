package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongMangSoNguyenTest {

    private TongMangSoNguyen tongMangSoNguyen;
    @BeforeEach
    void setUp() {
        tongMangSoNguyen = new TongMangSoNguyen();
    }

    @Test
    void sumOddNumber() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expected = 25;
        int result = tongMangSoNguyen.sumOddNumber(arr);
        assertEquals(expected, result);
    }
    @Test
    void sumOddNumber1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 100};
        int expected = 25;
        int result = tongMangSoNguyen.sumOddNumber(arr);
        assertEquals(expected, result);
    }
    @Test
    void sumOddNumber2() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 100};
        int expected = 16;
        int result = tongMangSoNguyen.sumOddNumber(arr);
        assertEquals(expected, result);
    }
    @Test
    void sumOddNumber3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 123, 100};
        int expected = 20;
        int result = tongMangSoNguyen.sumOddNumber(arr);
        assertEquals(expected, result);
    }
    @Test
    void sumOddNumber4() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 123, 100};
        int expected = 16;
        int result = tongMangSoNguyen.sumOddNumber(arr);
        assertEquals(expected, result);
    }
}