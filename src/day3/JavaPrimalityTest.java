/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger big = new BigInteger(n);

        if (big.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scanner.close();
    }
}
