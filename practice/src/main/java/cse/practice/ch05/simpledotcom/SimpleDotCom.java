
package cse.practice.ch05.simpledotcom;

public class SimpleDotCom {
    int[] locationCells; // 위치를 저장하는 배열
    int numOfHits = 0;
    
    public void setLocationCells(int[] locs){ // 위치를 받아와 저장한다.
        locationCells = locs;
    }
    
    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess); // String형 변수를 int형으로 변환
        String result = "miss"; // 결과를 표시할 변수
        for(int i = 0; i < locationCells.length;i++){ 
            if(guess == locationCells[i]){
        //for(int cell : locationCells){ //enhanced loop
            //if(guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }   
}
