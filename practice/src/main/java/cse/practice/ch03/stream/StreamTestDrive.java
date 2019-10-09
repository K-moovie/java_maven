
package cse.practice.ch03.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamTestDrive {
    public static List<Person> persons = new LinkedList<>();
    public static void main(String[] args){
        initialize();
        
        long maleCount = persons.stream()
                .filter(e->e.getSex() == Sex.MALE).count();
        System.out.printf(">>>남자는 %d명 입니다.%n", maleCount);
    
    
        OptionalDouble femaleAverageAge = persons.stream()
            .filter(e->e.getSex() == Sex.FEMALE) // 열거형이 FEMALE인 stream은
            .mapToInt(Person::getAge) // Person클래스의 getAge와 맴핑해서 int형으로 바꾼다.
            .average();
    
        if(femaleAverageAge.isPresent()){
            System.out.printf(">>>여자의 평균 나이는 %2f입니다.%n",
                femaleAverageAge.getAsDouble());
        }

        System.out.println(">>>20~25살인 여자의 이름을 정렬해서 출력");
        Stream <Person> sp = persons.stream()
            .filter(e->e.getSex() == Sex.FEMALE)
            .filter(e->e.getAge() >=20 && e.getAge() <= 25)
            .sorted();
    
        sp.forEach(e->System.out.printf("%s%n",e.getName()));
    }
    
    public static void initialize(){
        Person[] data = {
            new Person("Linda",21,Sex.FEMALE),
            new Person("Oliver",25,Sex.MALE),
            new Person("Alice",27,Sex.FEMALE),
            new Person("Noah",19,Sex.MALE),
            new Person("Abby",23,Sex.FEMALE),
            new Person("Daisy",25,Sex.FEMALE),
            new Person("Samuel",31,Sex.MALE),
            new Person("Crystal",31,Sex.FEMALE),
            new Person("Tadeo",33,Sex.MALE)
        };
        for(Person p :data){
            persons.add(p);
        }
    }
}
