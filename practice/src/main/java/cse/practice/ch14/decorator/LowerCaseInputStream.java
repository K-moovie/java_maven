/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.practice.ch14.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author LG
 */
public class LowerCaseInputStream extends FilterInputStream{

    public LowerCaseInputStream(InputStream in) {
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
            InputStream is = new LowerCaseInputStream(
            new BufferedInputStream(
            new FileInputStream("./src/main/java/cse/practice/ch14/decorator/test.txt")));
            while ((c = is.read()) >= 0){
                System.out.print((char)c);
            }
            
        }catch (IOException ex){
            System.out.println("오류 발생: " + ex.getMessage());
        }
    }    
}
