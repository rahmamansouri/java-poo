import java.util.Scanner;
public class NombrePairInferieurAn {
public static void main(String[] args) {
System.out.println("Veuillez saisir la valeur de n");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int j=0;
for(int i=0;i<=n;i++){
	if(i%2==0){
	System.out.println(i+" est un nombre pair inférieur ou égale à " +n);
	j+=1;
	}
}
System.out.println("Le nombre d'entiers pair inférieur ou égale à " +n +" est : " +j);
}
}