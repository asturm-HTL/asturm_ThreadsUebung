/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.threadsuebung.exercise3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author user
 */
public class SudokuSolver implements ISodukoSolver
{

    static File sudokuLevel1 = new File("C:\\Users\\user\\Documents\\NetBeansProjects\\asturm_ThreadsUebung\\1_sudoku_level1.csv");
            
    static int[][] sudokuField = new int[9][9];
            
        
    public static void main(String[] args) 
    {
        SudokuSolver ss = new SudokuSolver();
        
        ss.readSudoku(sudokuLevel1);
        ss.checkSudoku(sudokuField);
    }
    
    
    
    
    
    //------------------------Interface-Abstract Methods--------------------------------
    @Override
    public int[][] readSudoku(File file) 
    {
                    //Stream<Integer> sudokuFieldStream = Stream.of(sudokuField);
        try 
        {
            
            BufferedReader br = new BufferedReader(new FileReader(sudokuLevel1));
            String s = br.readLine();
            int i = 0;
            int j = 0;
            
            while(s != null)
            {
                for(int x = 0; x < s.length(); x++)
                {
                    
                    for(int z = 0; z< 9; z++)
                    {
                       
                       
                        String[] splittedLine = s.split(";");
                        sudokuField[x][z] = Integer.parseInt(splittedLine[z]);
                        System.out.println("Feld an der Stelle: "+(x+1)+", "+(z+1)+" ist: " +sudokuField[x][z]);
                        //System.out.println("lang" +s.length());
                       
                    }
                    s = br.readLine();
                }
                
                
            }
            
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(SudokuSolver.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public boolean checkSudoku(int[][] rawSudoku) 
    {
        List intergerList = new LinkedList<Integer>();
        
        for(int row = 0; row<sudokuField.length; row++)
        {
            for(int column = 0; column < sudokuField[row].length; column++)
            {
                System.out.println("nigga: "+sudokuField[row][column]);
            }
        }
        return true;
    }

    @Override
    public int[][] solveSudoku(int[][] rawSudoku) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[][] solveSudokuParallel(int[][] rawSudoku) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
