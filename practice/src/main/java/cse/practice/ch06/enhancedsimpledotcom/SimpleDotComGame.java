
package cse.practice.ch06.enhancedsimpledotcom;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuesses = 0; // 게임 횟수를 세는 int형 변수
        GameHelper helper = new GameHelper(); // GameHelper객체 생성
        
        SimpleDotCom theDotCom = new SimpleDotCom(); // SimpleDotCom객체 생성
        int randomNum = (int)(Math.random()*5); // 0~4까지의 int형 난수 생성
        ArrayList<String> locations= new ArrayList<>(); // randomNum을 저장할 ArrayList 생성  
        for(int i = 0; i < 3; i++)
        {
            String rand = Integer.toString(randomNum+i);
            // int형 변수를 String형으로 변환
            locations.add(rand); // ArrayList에 추가
        }
        theDotCom.setLocationCells(locations);
        
        boolean isAlive = true; // 게임 종료 여부를 저장하는 변수
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