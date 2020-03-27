/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class JavaStringReversePalindrome {
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reversed = "";
        char[] ch = A.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            reversed += ch[i];
        }
        if (A.equals(reversed)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
