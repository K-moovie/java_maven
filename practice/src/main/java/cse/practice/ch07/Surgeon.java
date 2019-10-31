package cse.practice.ch07;

public class Surgeon extends Doctor{
    public Surgeon(boolean workAtHospital){
        super(workAtHospital);
    }
    
   //@Override
    public void treatPatient(){
        System.out.println("외과수술을 합니다.");
    }
    public void makeIncision(){
        System.out.println("살을 쨉니다.");
    }   
}
