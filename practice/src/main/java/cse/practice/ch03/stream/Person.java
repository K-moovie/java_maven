
package cse.practice.ch03.stream;


public class Person implements Comparable<Person> { // implements == 인터페이스 구현
    private String name;
    private int age;
    private Sex sex; //열거형 Sex선언

    public Person(String name, int age, Sex sex) { //constructor
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() { // getter()
        return name;
    }

    public int getAge() { // getter()
        return age;
    }

    public Sex getSex() { // getter()
        return sex;
    }
    
    @Override
    public int compareTo(Person o) { 
        //인터페이스는 상속받는 클래스에서 메소드를 따로 구현해야 한다.
        return name.compareTo(o.name);
    }
}
