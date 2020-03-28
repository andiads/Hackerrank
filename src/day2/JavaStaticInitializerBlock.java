/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 * @level EASY
 * @problem_title java static initializer block
 * @link https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 * @author ANDI DWI SAPUTRO
 */
public class JavaStaticInitializerBlock {

    //Write your code here
    static int B, H;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
            flag = false;
            System.exit(0);
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
