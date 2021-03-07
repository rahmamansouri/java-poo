import java.util.Scanner;
public class test  {
    public static void main (String[]args)
    { Scanner scan = new Scanner (System.in);
    System.out.println("Welcome to the test");
    System.out.println("Question 1: what is 2+2 in letters ?");
    
    String ans1 = scan.next();

    while (!ans1.equals("four")){
    
    System.out.println("Wrong ! try again what is 2+2 in letters ? : ");
     ans1 = scan.next();
    
         System.out.println("Great! you had the right answer");

        
         
         
         System.out.println("Question 2: Where is Seoul ?");

    
    String ans2= scan.next();

    while (!ans2.equals("Korea")){
    
    System.out.println("Wrong ! please try again ");
     ans2 = scan.next();
    }
         System.out.println("Great you passed the test :) ");
    
    
    
 }}}
