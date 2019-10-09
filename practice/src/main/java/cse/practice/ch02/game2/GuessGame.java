package cse.practice.ch02.game2;

import java.io.BufferedReader;// 
import java.io.IOException; // 
import java.io.InputStreamReader; //

public class GuessGame {
    private int machineGeneratedNumber; // 컴퓨터 생성 변수
    private int userGuessNumber =-1; // 사용자 입력 int형 변수
    public static final int MAX_COUNT = 5; // 최대 게임 상수

    public GuessGame() { //default Constuctor
    }
    
    public void getUserInput() throws IOException{
        String inputLine = null; // 사용자 입력 String형 변수
        System.out.print("0~9까지 한 자리 숫자를 추측해서 입력해주세요 : ");
        boolean rightNumberFormat = false; //0-9까지 숫자조건 변수
        do{ //do-while문은 선 실행, 후 조건검사
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            //표준입력으로부터 문자단위로 계속 읽어라
            inputLine = is.readLine(); //readLine은 BufferedReader 메소드
            
            if(inputLine.matches("[0-9]")){ // 유효성 검사 
                                            //matches("[0-9]")은 정규표현식
                this.userGuessNumber = Integer.parseInt(inputLine); //String을 Integer형식 변환
                                                                    //조건이 옳을때까지 실행
                rightNumberFormat = true;
            }
            else{
                System.out.print("0~9까지 한 자리 숫자만 입력해야합니다! 다시 입력해주세요.");
            }
        } while(!rightNumberFormat); // rightNumberFormat == false;
    } //end of getUserInput()
    
    private void generateRandomNumber(){
        this.machineGeneratedNumber = (int)(Math.random()*10); //0-9까지 int형 랜덤숫자 생성
        System.out.println("machineGeneratedNumber = "+ machineGeneratedNumber); // Debug용
    }// end of  generateRandomNumber()
    
    public void startGame() throws IOException{
        int count = 0;
        boolean matched = false;
        
        System.out.println("컴퓨터가 임의로 생성한 0~9까지 한 자리 숫자를 맞추는 게임입니다.");
        System.out.println("5번 안에 맞추면 당신이 이기고 그렇지 않으면 컴퓨터가 이깁니다.");
        System.out.println("이제 시작하겠습니다.");
        System.out.println(" ");
        
        generateRandomNumber();
        
        while(!matched && count < MAX_COUNT){
            getUserInput();
            if(userGuessNumber == machineGeneratedNumber){
                matched = true;
            }
            else {
                count++;
            }
        } // end of while()
        
        if(count < MAX_COUNT){
            System.out.println("당신이 이겼습니다.");
        }
        else{
            System.out.println("컴퓨터가 이겼습니다.");
        }
    } //end of startGame()
}