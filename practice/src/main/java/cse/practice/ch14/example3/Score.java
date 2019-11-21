/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.practice.ch14.example3;

/**
 *
 * @author LG
 */
public class Score implements java.io.Serializable{
    private Person person;
    private int java;

    public Score(Person person, int java) {
        this.person = person;
        this.java = java;
    }

    public Person getPerson() {
        return person;
    }

    public int getJava() {
        return java;
    }    
}
