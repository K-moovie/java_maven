
package cse.practice.ch06.enhancedsimpledotcom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + " ");
        try{ // 오류가 발생하지 않을 때 
            BufferedReader is = new BufferedReader(
                new InputStreamReader(System.in));
        inputLine = is.readLine();
        
        if(inputLine.length() == 0)
            return null; 
        }catch(IOException e){ // 오류가 발생할 때
            System.out.println("IOException: "+e);
        }
        return inputLine.toLowerCase(); //대문자는 소문자로 변환
    }
}
