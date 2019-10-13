/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.threadsuebung.exercise2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ThreadClass2 implements Runnable
{
    int j = 0;
    int n;
    int distance = 100;
    int distanceForSum = 100;
    ArrayList arrayList;
    int sum1 = 0;
    int sum = 0;
    
    public ThreadClass2(int n, ArrayList arrayList)
    {
        //this.j = j;
        this.n = n;
        //this.distance =distance;
        //this.distanceForSum = distanceForSum;
        this.arrayList = arrayList;
        //this.sum1 = sum1;
        //this.sum = sum;
        
    }
    
    @Override
    public void run() 
    {
         
        
            while(j<distance)
            {
                if(j<n)
                {
                    j++;
                    arrayList.add(j); 
                    
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
        
    }
    
    
    
}
