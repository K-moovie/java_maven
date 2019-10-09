
package cse.practice.ch03;

public class DogArrayTest {
    public void test(){
        Dog[] myDogs = new Dog[3];
        
        myDogs[0] = new Dog("Fred"); 
        myDogs[1] = new Dog("Marge");
        myDogs[2] = new Dog("Bart");
        // Dog는 Primitive type이 아닌 사용자 정의형이므로
        // 객체배열을 생성하고 각 배열마다 new를 사용해 주어야 한다.
        // (배열크기 + 1)만큼 new사용
        
        System.out.print("마지막 개의 이름 : ");
        System.out.println(myDogs[myDogs.length-1].getName());
        System.out.println("------------");
         
        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x = x+1;
        }
        System.out.println("------------");
        java.util.Arrays.stream(myDogs).forEach(d->d.bark());
        // java.util.Arrays로 myDogs를 stream형태로 만들어 준다.
        // stream의 forEach메소드로 각 객체배열의 bark()메소드를 호출한다.
    }
}
