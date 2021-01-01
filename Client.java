import java.util.Scanner;  // Import the Scanner class

public class Client {
public String message (int genre, String prenom){
String S;

   if(genre == 0)
   {   prenom = prenom.toUpperCase();
       
       S = "Bonjour Monsieur" + prenom;
       return S;}
       
   else { prenom = prenom.toUpperCase() ;
               S = "Bonjour Madame " + prenom ;
               return S ;
   }
    
}
    
public static void main(String[] args) {
    Client c = new Client ();
    //mehode 1: à travers arg main
    //int genre= Integer.parseInt(args[0]);
    //String prenom= args[1];
    
    
    //methode 2: à travers scanner
     Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Entrez genre: 0 pour Homme ou 1 pour femme");
    int genre= Integer.parseInt(myObj.nextLine());
    System.out.println("Entrez prenom");
    String prenom=myObj.nextLine();
   System.out.println(c.message(genre, prenom)); 
   
    }    








}
