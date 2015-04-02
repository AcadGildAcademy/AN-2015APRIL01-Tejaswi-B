package org.ninjasecurity;
import java.util.Scanner;
public class VowelOrConsonant 
{
    static Scanner in= new Scanner(System.in);
    public static void main(String... args)
    {
        System.out.println("Enter an Alphabet");
        String alpha=in.next();
        char alphabet=alpha.toLowerCase().charAt(0);
         if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u')
             System.out.println(alpha.charAt(0)+" is a vowel");
         else
             System.out.println(alpha.charAt(0)+" is a consonant");
                        
    }
    
    
}
