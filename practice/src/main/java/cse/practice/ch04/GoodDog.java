
package cse.practice.ch04;

public class GoodDog {
    private int size; // 비공개

//    public GoodDog(int size) {
//        this.size = size;
//    }

    public int getSize() { // 공개
        return size; 
    }

    public void setSize(int size) {// 공개
        this.size = size;
    }
    
    void bark() { // 패키지 가시성 
        if(size > 60){ // size가 60보다 클 때
            System.out.println("Wooof! Wooof!");
        }
        else if(size > 14){ // size가 14보다 크고 60이하 일 때
            System.out.println("Ruff! Ruff!");
        }
        else{ // size가 14이하 일 때
            System.out.println("Yip! Yip!");
        }
    }
}
