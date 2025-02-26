package org.example;

public class TongMangSoNguyen {
    public int sumOddNumber(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] < 100) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
