/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class JavaMap {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        HashMap<String, String> maps = new HashMap<>();

        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            maps.put(name, String.valueOf(phone));
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (maps.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + maps.get(s));
            }

        }
    }
}
