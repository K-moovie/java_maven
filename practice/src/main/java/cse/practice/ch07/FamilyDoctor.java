
package cse.practice.ch07;

public class FamilyDoctor extends Doctor{
    boolean makeHouseCalls;
    
    public FamilyDoctor(boolean makeHouseCalls, boolean workAtHospital){
        super(workAtHospital);
        this.makeHouseCalls = makeHouseCalls;
    }
    
    public void giveAdvice(){
        System.out.println("집에서 필요한 조언을 합니다.");
    }
    
}
