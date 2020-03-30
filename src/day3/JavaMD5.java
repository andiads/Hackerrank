/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

/**
 * @level MEDIUM
 * @author ANDI DWI SAPUTRO
 */
public class JavaMD5 {

    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        String hash = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(s.getBytes());
            byte[] digest = md5.digest();
            hash = DatatypeConverter.printHexBinary(digest);
            s = hash;
            System.out.println(s.toLowerCase());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("can't find the suitable algorithms");
        }

    }
}
