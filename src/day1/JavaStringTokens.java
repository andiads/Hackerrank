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
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        String delimiters =  "[ !,?._'@]+";
        String[] tokens = s.split(delimiters);        
        int n = tokens.length;
        if (s.length()>400000){
            System.out.println("");
        } else if (s.length()==0){
            System.out.println("0");
        } else {
            System.out.println(n);
            for (int i=0;i<tokens.length;i++){
                System.out.println(tokens[i].toString());
            }
        }
        
        scan.close();
    }
}
