
package cse.practice.uml;

public class Address {
    private String city;
    private String gu;
    private String streetName;
    private String builingNumber;
    
    public Address(String city, String gu, String streetName, String buildingNumber){
        this.city = city;
        this.gu = gu;
        this.streetName = streetName;
        this.builingNumber = buildingNumber;
    }
    
    
    @Override
    public String toString(){
        String str = String.format("주소 = %s %s %s %s",this.city,this.gu,this.streetName, this.builingNumber);
        return str;
    }
}
