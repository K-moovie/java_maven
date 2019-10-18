
package cse.practice.ch08.pet_interface;

import cse.practice.ch08.animal_list.*;

public class Dog extends Animal implements Pet {
    @Override
    public void makeNoise(){
        System.out.println("멍멍");
    }

    @Override
    public void play(){
        System.out.println("냄새를 맡으며 뛰어 다닙니다.");
    }
}
