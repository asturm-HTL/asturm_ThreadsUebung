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
            Thread thread = new Thread(new ThreadClass2(n));
            thread.start();
            
            while(j<distance)
            {
                if(j<n)
                {
                    j++;
                    arrayList.add(j); 
                    System.out.println("------------------------------------");
                    System.out.println("Aktueller Thread: " + thread);
                    System.out.println(arrayList.get(j-1));

                    if(j-1<distanceForSum && j != n)
                    {
                        sum1 = sum1 + (Integer) arrayList.get(j-1);
                        System.out.println("Summe1 ist: "+sum1);
                    }
                    else if(j==n)
                    {
                        sum1 = sum1 + (Integer) arrayList.get(j-1);
                        sum = sum + sum1;
                        distanceForSum = distanceForSum +100;
                        sum1 = j;
                        System.out.println("Summe1 ist: "+sum1);
                    }
                    else
                    {
                        sum = sum + sum1;
                        distanceForSum = distanceForSum +100;
                        sum1 = j;
                        System.out.println("Summe1 ist: "+sum1);
                    }


                    System.out.println("Summe gesamt ist: " +sum);
                
                }
            }
            if(distance <= n)
            {
                distance = j+100;
            }
            i++;
        }
        
        
        
        
        
        
        
    }
           
            
    
    
    
}
