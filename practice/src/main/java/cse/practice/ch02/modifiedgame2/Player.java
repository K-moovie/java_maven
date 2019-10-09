package cse.practice.ch02.modifiedgame2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
    private String name;
    private int number;
    private boolean rightNumberFormat = false;
    public Player(String name){
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {return this.name;}
    public int guessNumber() throws IOException{
        String inputLine;
        do{
            System.out.println(this.name + "님 차례입니다:");
            System.out.println("0~99까지 숫자를 추축해서 입력해 주세요:");
            BufferedReader guessnumber = new BufferedReader(new InputStreamReader(System.in));
            inputLine = guessnumber.readLine();
            if(inputLine.matches("[1-9]?[0-9]"))
            {
                this.number = Integer.parseInt(inputLine);
                rightNumberFormat = true;
            }
            else {
                System.out.println("0~99까지 두 자리 숫자만 입력해야 합니다. 다시 입력하세요!");
            }
        } while(!rightNumberFormat);
        
        return this.number;
    }
}
