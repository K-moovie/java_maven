
package cse.practice.ch04.poordog;

public class PoorDogTestDrive {

    public static void main(String[] args) { // main()메소드는 같은 패키지내에 중복할 수 있다.
        PoorDog one = new PoorDog();
        System.out.format("Dog size is %d%n", one.getSize());
        System.out.format("Dog size is %s%n", one.getName());
    }
}
