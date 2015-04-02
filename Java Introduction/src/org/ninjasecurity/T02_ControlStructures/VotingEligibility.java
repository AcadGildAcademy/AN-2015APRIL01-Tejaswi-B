package org.ninjasecurity;
import java.util.Scanner;
public class VotingEligibility 
{
    static Scanner in= new Scanner(System.in);
    public static void main(String... args)
    {
        System.out.println("Enter yor age:");
        int age=in.nextInt();
        if(age>=18)    
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible to vote");
    }
    
    
}
