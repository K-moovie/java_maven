package cse.practice.ch01.beer;

public class BeerSong {
    public static void main(String[] args){
        int beerNum = 5;
        String word = "bottles"; //복수형
        
        while(beerNum > 0){ //while문 조건식 
            if(beerNum == 1){ //beerNum이 1인 조건식
                word = "bottle"; //단수형
            }
            
            System.out.println(beerNum + " " + word + " of beer on the wall"); 
            //beerNum의 상태를 출력
            System.out.println(beerNum + " " + word + " of beer."); 
            //beerNum의 상태를 출력
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum-1; //int형 변수 beerNum을 99부터 1씩 뺀다
            
            if(beerNum > 0){
                System.out.println(beerNum + " " + word + " of beer on the wall"); 
                //beerNum의 상태를 출력
            }
            else {
                System.out.println("No more bottles of beer on the wall");
            }
            System.out.println("------");
        }
    } 
}