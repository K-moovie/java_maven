
package cse.practice.ch03.stream;

public enum Sex { // 열거형 선언
    FEMALE("female"),MALE("male"); //각 열거형에 String값을 지정
    
    private String info;
    
    private Sex(String info){ // constuctor
        this.info = info;
    }
    
    public String toString(){
        return info;
    }
}
