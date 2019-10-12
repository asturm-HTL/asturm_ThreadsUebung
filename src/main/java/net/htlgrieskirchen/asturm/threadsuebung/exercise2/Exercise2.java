/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.threadsuebung.exercise2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Exercise2 
{
    
   
    
    public static void main(String[] args) 
    {
        int from = 0;
        int to= 0;
        int n;
        int chunks = 100;
        
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
        
        for(int i = 0; i<=chunks; i++)
                {
                    Thread thread = new Thread(new ThreadClass2(n, chunks, from, to));
                    thread.start();
                    from = from + (n/chunks);
                    to = from + (n/chunks);
                    System.out.println("from : "+from+" to: "+to);
                    
                }
        
        
        
        
        
    }
           
            
    
    
    
}
