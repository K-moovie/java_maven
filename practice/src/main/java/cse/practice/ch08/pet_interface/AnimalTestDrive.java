
package cse.practice.ch08.pet_interface;

import cse.practice.ch08.animal_list.Animal;
import java.util.List;
import java.util.ArrayList;

public class AnimalTestDrive {

    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        Dog a = new Dog();
        Cat c = new Cat();
        
        list.add(a);
        list.add(c);
        
        System.out.println("동물이 "+ list.size() + "마리 있습니다.\n");
        for(Animal animal: list)
        {
            System.out.println(animal.getClass().getName() + ":");
            animal.makeNoise();
            animal.sleep();
            if(animal instanceof Dog || animal instanceof Cat){
                //instanceof : 변수가 참조하고 있는 실제 타입
                Pet p = (Pet)animal; // interface
                p.play();
                ((Pet)animal).play();
            }
            System.out.println();
        }
    }
}
