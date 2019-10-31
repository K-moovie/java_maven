
package cse.practice.ch10.duck;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class WrapperClassTest {
    public static void doSomething(List<Integer>numbers){ // List<Integer>형 매개변수를 받는다.
        System.out.print("첫 번째 출력: ");
        numbers.forEach(e->System.out.print(e.toString()+"   "));
        
        System.out.print("\n두 번째 출력: ");
        for (int e : numbers){
            System.out.print(e+"   ");
        }
        System.out.print("\n합계1: ");
        Optional<Integer> sum1 = numbers.stream().reduce((x,y)->x+y); // 람다표현식
        if(sum1.isPresent()){
            System.out.println(sum1.get()); // Optional<>의 메소드
        }
        
        System.out.print("합계2: "); 
        Integer sum2 = numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum2);
        
        System.out.print("합계3: ");
        Integer sum3 = numbers.stream().mapToInt(e->e).sum(); // 중간연산자(mapToInt)필요
        System.out.println(sum3);
        
        System.out.print("평균: ");
        OptionalDouble avg = numbers.stream().mapToInt(e->e).average();
        if(avg.isPresent()){
            System.out.println(avg.getAsDouble());
        } 
    }
    
    public static void doConversion(){
        Integer i1 = new Integer("123"); // 권장하지 않음
        Integer i2 = Integer.parseInt("123"); // String형 "123"을 int형 123으로 변환 
        String s1 = i1.toString(); // Integer를 String형으로 변환
        int number = i2.intValue(); // 언박싱
        
        System.out.printf("%d %d %s %d%n",i1,i2,s1,number);
        try{
            Integer i3 = Integer.parseInt("123.5"); // 예외발생
        }catch(NumberFormatException ex){
            System.err.println("에외발생:" +ex);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        
        for(int i =0; i < 20; i ++){
            int value = (int)(Math.random()*100);
            numbers.add(value); // 오토박싱
        }
        doSomething(numbers);
        doConversion();
        
    }
}
