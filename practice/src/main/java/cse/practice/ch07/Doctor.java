
package cse.practice.ch07;

public class Doctor {
    boolean workAtHospital;
    
    public Doctor(boolean workAtHospital){
        this.workAtHospital = workAtHospital;
    }
    
    public void treatPatient(){
        System.out.println("진료를 합니다.");
    }
    
    @Override
    public String toString(){
        String result = null;
        if(workAtHospital){
            result=getClass().getName() + " : 병원에서 일하는 의사입니다.";
        }
        else {
            result = getClass().getName() + " : 집에서 일하는 의사입니다.";
        }
        return result;
    }
}
