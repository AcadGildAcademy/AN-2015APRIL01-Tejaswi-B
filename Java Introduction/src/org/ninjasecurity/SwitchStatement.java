package org.ninjasecurity;

import java.util.Scanner;

/**
 *
 * @author Tejaswi
 */
public class JavaIntroduction {
   
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the Month number");
        int m=in.nextInt();
        switch(m)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number Of Days in this Month are: 31");
                break;
            case 2:
                System.out.println("Number Of Days in this Month are: 28 in non leap year and 29 in a leap year");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number Of Days in this Month are: 30");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
  }
