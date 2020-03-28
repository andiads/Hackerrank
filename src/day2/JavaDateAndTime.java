/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @level EASY
 * @problem java date and time
 * @link https://www.hackerrank.com/challenges/java-date-and-time/problem
 * @author ANDI DWI SAPUTRO
 */
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String theDay = "";
         if (month == 1) 
        { 
            month = 13; 
            year--; 
        } 
        if (month == 2) 
        { 
            month = 14; 
            year--; 
        } 
        int q = day; 
        int m = month; 
        int k = year % 100; 
        int j = year / 100; 
        int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j; 
        h = h % 7; 
        switch (h) 
        { 
            case 0 : theDay = "Saturday"; break; 
            case 1 : theDay = "Sunday"; break;  
            case 2 : theDay = "Monday"; break; 
            case 3 : theDay = "Tuesday"; break; 
            case 4 : theDay = "Wednesday"; break; 
            case 5 : theDay = "Thursday"; break; 
            case 6 : theDay = "Friday"; break; 
        } 
        return theDay.toUpperCase();
    }

}

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}