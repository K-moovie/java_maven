/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.practice.ch14.decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author LG
 */
public class LowerCaseReader extends FilterReader {

    public LowerCaseReader(Reader in) {
        super(in);
    }
    
     @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c :Character.toLowerCase((char)c));//To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args){
        try{
            int c;
            Reader is = new LowerCaseReader(
                            new BufferedReader(
                                new FileReader("./src/main/java/cse/practice/ch14/decorator/test.txt")));
            while ((c = is.read()) >= 0){
                System.out.print((char)c);
            }
            
        }catch (IOException ex){
            System.out.println("오류 발생: " + ex.getMessage());
        }
    }
}
