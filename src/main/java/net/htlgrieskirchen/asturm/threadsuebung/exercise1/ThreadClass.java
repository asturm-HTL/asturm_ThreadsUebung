/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.threadsuebung.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class ThreadClass implements Runnable 
{
    static List<Integer> arrayListInteger = new ArrayList<>();
    static int userInput;
    static int from;
    static int to;
    
    
    public ThreadClass(List<Integer> arrayListInteger, int userInput, int from, int to)
    {
        this.arrayListInteger = arrayListInteger;
        this.userInput = userInput;
        this.from = from;
        this.to = to;
        
        
    }
    
    @Override
    public void run() 
    {
       
        for(int j = from; j<=to ; j++)
                {
                    
                    if(arrayListInteger.get(j) % userInput == 0)
                    {
                        System.out.println(arrayListInteger.get(j));
                    }
                    
                }
    }


    
}
