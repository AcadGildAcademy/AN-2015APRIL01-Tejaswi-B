package org.ninjasecurity;
import java.util.Scanner;
public class LeapYearFinder 
{
    static Scanner in= new Scanner(System.in);
    public static void main(String... args)
    {
        System.out.println("Enter a year:");
        int year=in.nextInt();
         if((year % 100 != 0)&&(year % 400 == 0) || ((year % 4 == 0)))
              System.out.println("Leap Year");
         else
             System.out.println("Non Leap Year");
                        
    }
    
    
}
