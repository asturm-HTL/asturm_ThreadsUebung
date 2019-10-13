/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.threadsuebung.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercise2 
{
    
   
    
    public static void main(String[] args) 
    {
        
        int n;
        int distance = 100;
        int distanceForSum = 100;
       
        
   
        Scanner input = new Scanner(System.in);
        
        System.out.println("Geben Sie bitte die Zahl 'n' ein");
        n = input.nextInt();
        
        while(n<100)
        {
            System.out.println("Bitte eine Zahl über 100 eingeben!");
            System.out.println("----------------------------------");
            System.out.println("Geben Sie bitte die Zahl 'n' ein");
         
            n = input.nextInt();
        }
        
        ArrayList arrayList = new ArrayList();
        
        int sum1 = 0;
        int j = 0;
        int i = 0;
        int sum = 0;
        
        while(i<=n)
        {
            Thread thread = new Thread(new ThreadClass2(j, arrayList));
            thread.start();
            

            i++;
        }
        
        
        
        
        
        
        
    }
           
            
    
    
    
}
