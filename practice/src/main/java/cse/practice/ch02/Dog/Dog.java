package cse.practice.ch02.Dog;

class Dog {
//변수로 size, breed, name을 갖는 Dog클래스 정의
//메소드로 bark()를 갖는 Dog클래스 정의
    int size;
    String breed;
    String name;
    
    public Dog(){ //Constructor1
        this(30,"레브라도 리트리버","새론");
    }
    
    public Dog(int size, String breed, String name) { //Constructor2
        //우클릭.InsertCode.Constructor
        this.size = size;
        this.breed = breed;
        this.name = name;
    }
    
    void bark(){ //개가 짖는 소리를 출력하는 bark()메소드
        System.out.println(name + " 가/이 짖습니다.");
    }    
}
class DogTestDrive{
    public static void main(String[] args) { //프로그램 시작점
        Dog d1 = new Dog(30,"알라스카 말라뮤트", "보리"); //Constructor2
        d1.bark();
        
        Dog d2 = new Dog(); //Constructor1
        d2.bark();
        
        Dog d3 = new Dog(); //instance에 직접 접근
        d3.name = "코코";
        d3.size = 40;
        d3.bark(); 
    }
}