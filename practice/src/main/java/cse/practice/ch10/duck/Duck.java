
package cse.practice.ch10.duck;

public class Duck {
    private int size;
    private static int duckCount = 0;
    private int nth;
    private static Duck[] ducks;
    
    public Duck(){ // 기본 생성자 
        this(10);
    }
    
    public Duck(int size){ // 매개변수가 있는 생성자
        this.size = size;
        nth = duckCount++; // 인스턴스 변수 = static변수
    }
    
    @Override
    public String toString(){ 
        StringBuilder sb = new StringBuilder(); 
        sb.append("나는 "); // 기존데이터에 해당 문자열을 추가함
        sb.append(nth);
        sb.append("번째 오리이고, ");
        sb.append("크기는 ").append(size).append("입니다."); // 자기 자신을 반환 하기 때문에 병렬로 사용 가능
        
        return sb.toString();
    }
    
    public static void initialize(){
        ducks = new Duck[10];
        ducks[0] = new Duck(); // 기본 생성자 호출
        
        for(int i = 1; i<ducks.length;i++){
            int size = (int)(Math.random()*20)+10;
            ducks[i] = new Duck(size); // 매개변수가 있는 생성자 호출
        }
    }
    
    public static void main(String[] args){
        initialize();
        for(Duck d : ducks){
            System.out.println(d);
        }
    }
}

