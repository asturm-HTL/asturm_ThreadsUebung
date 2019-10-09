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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Exercise1 
{
    
    static List<Integer> arrayListInteger = new ArrayList<>();
    static String fileName = "C:\\Users\\user\\Documents\\NetBeansProjects\\asturm_ThreadsUebung\\numbers.csv";
       
    
    public static void main(String[] args) throws IOException 
    {
        
        try 
        {
            
            BufferedReader br = new BufferedReader(new FileReader(fileName));
           
            
                
                while(br.readLine() != null)
                {

                    String s = br.readLine();
                    String[] parts = s.split(":");

                    for(int i = 0; i<=parts.length; i++)
                    {
                        
                        try
                        {
                            arrayListInteger.add(Integer.parseInt(parts[i]));
                        }
                        catch(Exception e)
                        {
                            //System.out.println("Eintrag war keine Zahl oder ein Buchstabe war vorhanden");
                        }
                        
                    }

                    //System.out.println(arrayListInteger);
                }
                
                System.out.println("----------------------------------------------------");
                System.out.println("Geben Sie bitte einen Teiler ein :");
                
                    Scanner input = new Scanner(System.in);
                
                int userInputDivider = input.nextInt();
                
                System.out.println("----------------------------------------------------");
                System.out.println("Geben Sie bitte ein in wieviele Teile die Ursprungsliste geteilt werden: ");
                
                int userInputListDivider = input.nextInt();
                                
                
             
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Exercise1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
