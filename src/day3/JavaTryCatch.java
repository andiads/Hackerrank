/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class JavaTryCatch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x/y;
            if (y==0) {
                throw new java.lang.ArithmeticException("/ by zero");
            } else {
                System.out.println(z);
            }
        } catch(java.lang.ArithmeticException ae){
            System.out.println(ae);
        } catch(InputMismatchException ime){
            System.out.println(ime.getClass().getName());
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
