/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^([a-zA-Z]){1}([a-zA-Z0-9_]{7,29})$";
}

public class ValidUsernameRegex {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
