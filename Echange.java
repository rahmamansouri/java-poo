import java.util.Scanner;

public class Echange {
    
    public static void main (String[] args)
    {
Scanner sc1=new Scanner(System.in);
 double x=sc1.nextDouble();
 System.out.println("Saisissez la valeur de x :");

 

Scanner sc2=new Scanner(System.in);
 double y=sc2.nextDouble();
 System.out.println("Saisissez la valeur de y :");

 Double z = x;
 x = y;
 y = z;
 
 System.out.println("la valeur de " + x + "devient:");
     System.out.println("la valeur de " + y + "devient:");

}
}