
package cse.practice.uml;

public class Student {
    private String id;
    private String name;
    private Address homeAddress;
    
    public Student(String id, String name, Address homeAddress){
        this.id = id;
        this.name = name;
        this.homeAddress = homeAddress;
    }
    
    public void SayHello(){
        System.out.println("안녕하세요, 나는 " + this.name + "(학번: " + this.id + ")입니다.");
    }
    
    @Override
    public String toString(){
        String str = String.format("[%s] id = %s",this.name,this.id);
        str += ", ";
        str += homeAddress.toString();
        return str;
    }
    
    public static void main(String[] args) {
        Address homeAddress = new Address("부산시","부산진구", "엄광로", "176");
        Student s = new Student("s20163363", "김영화", homeAddress);
        System.out.print(s);
    }
}