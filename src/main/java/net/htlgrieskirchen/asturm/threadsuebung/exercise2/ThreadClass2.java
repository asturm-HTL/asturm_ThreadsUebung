/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.threadsuebung.exercise2;

/**
 *
 * @author user
 */
public class ThreadClass2 implements Runnable
{
    
    int chunks;
    int n;
    int from;
    int to;
    
    public ThreadClass2(int n, int chunks, int from, int to)
    {
        this.n = n;
        this.chunks = chunks;
        this.from = from;
        this.to = to;
    }
    
    @Override
    public void run() 
    {
       
 
        
    }
    
    
    
}
