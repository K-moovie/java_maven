package cse.practice.ch02.modifiedgame2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModifiedGuessGame {
    private int machineGeneratedNumber; // 컴퓨터 생성 변수
    private int userGuessNumber1 =-1; // 사용자 입력 int형 변수
    private int userGuessNumber2 =-1; // 사용자 입력 int형 변수
    public static final int MAX_COUNT = 5; // 최대 게임 상수

    Player p1, p2;
    public ModifiedGuessGame() { //default Constuctor
    }
        
    private void generateRandomNumber(){
        this.machineGeneratedNumber = (int)(Math.random()*100); //0-9까지 int형 랜덤숫자 생성
        System.out.println("machineGeneratedNumber = "+ machineGeneratedNumber); // Debug용
    }// end of  generateRandomNumber()
    
    public void startGame() throws IOException{
        int count = 0;
        boolean matched = false;
        String name;
        p1 = new Player("");
        p2 = new Player("");
        System.out.println("컴퓨터가 임의로 생성한 0~99까지 한 자리 숫자를 맞추는 게임입니다.");
        System.out.println("5번 안에 맞추면 맞춘 사람이 이기고 그렇지 않으면 컴퓨터가 이깁니다.");
        System.out.println("이제 시작하겠습니다.");
        System.out.println(" ");
        
        System.out.print("사용자 이름을 차례대로 입력해 주세요 : ");
        BufferedReader inputName = new BufferedReader(new InputStreamReader(System.in));
        name = inputName.readLine();
        p1.setName(name);
        
        BufferedReader inputName2 = new BufferedReader(new InputStreamReader(System.in));
        name = inputName2.readLine();
        p2.setName(name);
        
        generateRandomNumber();
        
        while(!matched && count < MAX_COUNT){
            userGuessNumber1 = p1.guessNumber();
            
            userGuessNumber2 = p2.guessNumber();

            if(userGuessNumber1 == machineGeneratedNumber ||userGuessNumber2 == machineGeneratedNumber){
                matched = true;
            }
            else {
                count++;
            }
        } // end of while()
        
        if(count < MAX_COUNT && userGuessNumber1 == machineGeneratedNumber){
            System.out.println(p1.getName()+"이 이겼습니다.");
        }
        else if(count < MAX_COUNT && userGuessNumber2 == machineGeneratedNumber){
            System.out.println(p2.getName()+"이 이겼습니다.");
        }
        else
        {
            System.out.println("컴퓨터가 이겼습니다.");
        }
    } //end of startGame()
}