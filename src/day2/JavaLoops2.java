/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.util.Scanner;

/**
 * @level EASY
 * @problem java loops II
 * @link https://www.hackerrank.com/challenges/java-loops/problem
 * @author ANDI DWI SAPUTRO
 */
public class JavaLoops2 {
 public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0;
        int b=0;
        int n=0;
        for(int i=0;i<t;i++){
            
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            
            int res = 0;
            for (int x=0;x<n;x++){
                    res = res + (int) Math.pow(2,x)*b;
                    System.out.print(a + res + " ");
            }
            System.out.println();
        }
        in.close();
    }   
}
