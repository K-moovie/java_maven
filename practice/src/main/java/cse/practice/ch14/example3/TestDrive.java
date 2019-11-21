/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.practice.ch14.example3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author LG
 */
public class TestDrive {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        String fileName = "./src/main/java/cse/practice/ch14/example3/scores.ser";
        Person p1 = new Person("홍길동", "101");
        Person p2 = new Person("전우치", "102");
        Score score1 = new Score(p1, 95);
        Score score2 = new Score(p2, 92);
        
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(score1);
        oos.writeObject(score2);
        
        oos.close();
        
        ObjectInputStream ois = new ObjectInputStream(
                                    new FileInputStream(fileName));
        List<Score> scores = new LinkedList<>();
        scores.add((Score)ois.readObject());
        scores.add((Score)ois.readObject());
        
        for(Score score : scores){
            System.out.println(score.getPerson().getName() + " (" + score.getPerson().getId() + 
                    "): " + score.getJava());
        }
        ois.close();
    }
}
