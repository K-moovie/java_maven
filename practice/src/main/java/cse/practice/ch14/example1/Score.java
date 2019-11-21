/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.practice.ch14.example1;

/**
 *
 * @author LG
 */
public class Score {
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
