
package cse.practice.ch03;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class IntArrayTest {
    public static final int MAX_NUMS = 1000;
    
    public void test(){
        int[] nums;
        long sum = 0;
        nums = new int[MAX_NUMS]; // int[] nums = new int[MAX_NUMS]와 같다.
        for(int i =0; i < MAX_NUMS; i++){ // 일반적인 합계, 평균 구하기
            nums[i] = (int)(Math.random()*100); // 0-99까지 랜덤 정수
            sum = sum + nums[i];
        }
        System.out.println("평균 1: "+(float)sum/MAX_NUMS);
        this.calculateSumUsingWrapper(nums);
    }
    private void calculateSumUsingWrapper(int[] nums){
        OptionalInt sum = java.util.Arrays.stream(nums).reduce((x,y)->(x+y)); // reduce를 사용하여 코드단축
        OptionalDouble  avg = java.util.Arrays.stream(nums).average(); // average()메소드
        if(sum.isPresent()&&avg.isPresent()){ // reduce와 average메소드의 결과가 존재하는지 판단하는 조건식
            System.out.printf("합계 = %d, 평균2 : %f%n",
                    sum.getAsInt(),avg.getAsDouble()); // sum과 average는 정수형 변수가 아님, 메소드로 int형변수로 받아옴
        }
    }
}
