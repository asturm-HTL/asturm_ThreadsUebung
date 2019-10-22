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
import java.util.stream.IntStream;
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
        System.out.println("check:");
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
        int row = 9;
        int column = 9;
        return (rowChecker(sudokuField, row) && columnChecker(sudokuField, column) && fieldChecker(sudokuField, row, column));
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
    
    //------------------------------check-Methoden--------------------------------------
    public boolean rowChecker(int[][] field, int row)
    {
        boolean[] check = new boolean[sudokuField.length];
        return IntStream.range(0, sudokuField.length).allMatch(column -> checkMethod(sudokuField, row, check, column));
    }
    
    public boolean columnChecker(int[][] field, int column)
    {
        boolean[] check = new boolean[sudokuField.length];
        return IntStream.range(0, sudokuField.length).allMatch(row -> checkMethod(sudokuField, row, check, column));
    }
    
    public boolean fieldChecker(int[][] field, int row, int column)
    {
        boolean[] check = new boolean[sudokuField.length];
        int fieldRowStart = (row / 3) *3;
        int fieldRowEnd = fieldRowStart + 3;
        
        int fieldColumnStart = (column / 3) * 3;
        int fieldColumnEnd = fieldColumnStart + 3;
        
        for (int r = fieldRowStart; r < fieldRowEnd; r++) 
        {
        for (int c = fieldColumnStart; c < fieldColumnEnd; c++) 
        {
            if (!checkMethod(sudokuField, r, check, c)) return false;
        }
    }
    return true;
    }
    
    public boolean checkMethod(int[][]field, int row, boolean[] check, int column)
    {
        if(sudokuField[row][column] != 0)
        {
            if(!check[sudokuField[row][column] -1])
            {
                check[sudokuField[row][column] -1] = true;
            }
            else
            {
                return false;
            }
        }
        return  true;
    }
    
    
    
}
