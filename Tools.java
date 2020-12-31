/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahma
 */

public class Tools { 
 int count = 9; 
 int param ; 
 public void logIn() { 
 int count = 10; 
 System.out.println("local variable count is " + count); 
 } 
 public void count(){ 
 System.out.println("instance variable count is "+count); 
 }  
 public void setCount(int count){ 
 this.count=count; 
 } 
 public static void main(String[] args){ 
 Tools tools = new Tools(); 
 System.out.println("Param ="+tools. param ); 
 tools.logIn(); 
 tools.count(); 
 tools.setCount(20); 
 System.out.println("Count ="+tools.count); 
 } 
} 
