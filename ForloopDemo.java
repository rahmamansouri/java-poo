/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopdemo;

import java.util.Scanner;

/**
 *
 * @author rahma
 */
public class ForloopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.println("enter number to print multiplication table");
        
        
        
        int num = sc.nextInt();
        int i = 1;
         while (i<=10){
            System.out.println (num+ "*" +i+ "=" + num*i   );
        }
             
    }
    
}
