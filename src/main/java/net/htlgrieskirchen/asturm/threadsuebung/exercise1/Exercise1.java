/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.threadsuebung.exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Exercise1 
{
    
    List<Integer> arrayList = new ArrayList<>();
    static String fileName = "C:\\Users\\user\\Documents\\NetBeansProjects\\asturm_ThreadsUebung\\numbers.csv";
    
    public static void main(String[] args) throws IOException 
    {
    
        try 
        {
            
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            
            while(br.readLine() != null)
            {
                
                try
                {
                    
                    
                    
                }
                catch(Exception exc)
                {
                    
                }
                
                        
            }
        
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Exercise1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
