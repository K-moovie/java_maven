
package cse.practice.ch03;

public class Dog {
    private String name;

    public Dog(String name) { // constructor
        this.name = name;
    }

    public String getName() { // getter
        return name;
    }
    
    public void bark(){ // 사용자 정의 함수
        System.out.println(name + "이(가) 왈!하고 짖습니다.");
    }
}
