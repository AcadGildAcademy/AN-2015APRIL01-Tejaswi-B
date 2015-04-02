package org.ninjasecurity;
import java.util.Scanner;
public class EvenOrOddNumber 
{
    static Scanner in= new Scanner(System.in);
    public static void main(String... args)
    {
        System.out.println("Enter a number:");
        int number=in.nextInt();
        if(number%2==0)    
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
    
    
}
