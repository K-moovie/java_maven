
package cse.practice.ch06.enhancedsimpledotcom;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random()*5); //0~4까지의 int형 난수 생성
        ArrayList<String> locations= new ArrayList<>();
        for(int i = 0; i < 3; i++)
        {
            String rand = Integer.toString(randomNum+i);
            locations.add(rand);
        }
        theDotCom.setLocationCells(locations);
        
        boolean isAlive = true;
        while(isAlive == true)
        {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took "+numOfGuesses+" guesses");
            }
        }
    }
}