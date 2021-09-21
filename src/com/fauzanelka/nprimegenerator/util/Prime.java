package com.fauzanelka.nprimegenerator.util;

public class Prime {
    public static boolean isPrime(int n) {
        int i, m, flag = 0;
        m = n / 2;

        if (n == 0 || n == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }

        return flag == 0;
    }
}