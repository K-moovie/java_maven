
package cse.practice.ch06.enhancedsimpledotcom;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells; 
    // 위치를 저장할 ArrayList형 자료구조 생성
    
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
//        System.out.println(loc.get(0)); //test용
//        System.out.println(loc.get(1));
//        System.out.println(loc.get(2));
    }
    
    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput); // userInput이 있는 index반환 
        if(index >= 0) { // 올바른 숫자가 입력했을 때
            locationCells.remove(index); // ArrayList의 해당 내용 삭제
            if(locationCells.isEmpty()){ // ArrayList가 비었으면 kill
                result = "kill";
            } else{
                result = "hit";
            }
        }
        return result;
    }
}