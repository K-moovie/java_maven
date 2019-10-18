
package cse.practice.ch08.animal_list;

public class AnimalTestDrive {

    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        Tiger t = new Tiger();
        
        list.add(a);
        list.add(c);
        list.add(t);
        
        System.out.println("동물이 "+ list.getNextIndex() + "마리 있습니다.\n");
        for(int i =0; i < list.getNextIndex(); i++)
        {
            System.out.println(list.get(i).getClass().getName() + ":");
            list.get(i).makeNoise();
            list.get(i).sleep();
            System.out.println();
        }       
    } 
}
