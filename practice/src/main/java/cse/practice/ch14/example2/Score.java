
package cse.practice.ch14.example2;

public class Score implements java.io.Serializable{
    private String name;
    private int java;

    public Score(String name, int java) {
        this.name = name;
        this.java = java;
    }

    public String getName() {
        return name;
    }

    public int getJava() {
        return java;
    }
}
