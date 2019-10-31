
package cse.practice.ch08.animal_arraylist;

import cse.practice.ch08.animal_list.Animal;
import cse.practice.ch08.animal_list.Dog;
import cse.practice.ch08.animal_list.Cat;
import cse.practice.ch08.animal_list.Tiger;
import java.util.ArrayList;
import java.util.List;

public class AnimalTestDrive {

    public static void main(String[] args) {
        List<Animal> list = new ArrayList<> ();
        Dog a = new Dog();
        Cat c = new Cat();
        Tiger t = new Tiger();
        list.add(a);
        list.add(c);
        list.add(t);
        
        System.out.println("동물이 "+ list.size() + "마리 있습니다.\n");
        for(Animal animal : list)
        {
            System.out.println(animal.getClass().getName());
            animal.makeNoise();
            animal.sleep();
            System.out.println();
        }
    }
    
}
