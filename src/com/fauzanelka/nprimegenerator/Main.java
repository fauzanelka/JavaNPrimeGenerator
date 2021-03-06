package com.fauzanelka.nprimegenerator;

import com.fauzanelka.nprimegenerator.util.Prime;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Masukkan N: ");

            try {
                n = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("N tidak valid");
                sc.next();
            }

            if (n > 1000) {
                System.out.println("N maksimum 1000");
                n = 0;
            }
        } while (n <= 0);

        sc.close();

        List<Integer> nprimes = new ArrayList<>();

        int number = 1;
        do {
            if (Prime.isPrime(number)) {
                nprimes.add(number);
            }
            ++number;
        } while (nprimes.size() != n);

        System.out.print("Deret: ");
        for (int i = 0; i < nprimes.size(); i++) {
            System.out.printf("%d ", nprimes.get(i));

            if (i == nprimes.size() - 1) {
                System.out.printf("%n");
            }
        }

        System.out.printf("Total: %d%n", nprimes.stream().mapToInt(x -> x).sum());
    }
}
