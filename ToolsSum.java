/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahma
 */
public class ToolsSum {
   
    
     public String doUpper(String texte) {
 texte = texte.toUpperCase();
 return texte;
}
    
 public static void main(String[] args) {
     
 ToolsSum tools = new ToolsSum();
 String chaine = "fst AU 2020-2021";
 System.out.println(tools.doUpper(chaine));
 System.out.println(chaine);
 String resultat = chaine.concat("Section TIC2");
 System.out.println(resultat.substring(0,3));
 String str=" ";
 str.trim();
 System.out.println(str.equals("")+" "+str.isEmpty());
 
 }
}

