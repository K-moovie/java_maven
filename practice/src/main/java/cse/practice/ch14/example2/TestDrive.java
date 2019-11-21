
package cse.practice.ch14.example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDrive {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        String fileName = "./src/main/java/cse/practice/ch14/example2/scores.ser";
        Score score1 = new Score("홍길동", 95);
        Score score2 = new Score("전우치", 92);
        
        FileOutputStream fos = new FileOutputStream("./src/main/java/cse/practice/ch14/example2/scores.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(score1);
        oos.writeObject(score2);
        
        oos.close();
        
        ObjectInputStream ois = new ObjectInputStream(
                                    new FileInputStream(fileName));
        Score readScore1 = (Score)ois.readObject();
        System.out.println(readScore1.getName() + ": " + readScore1.getJava());
        Score readScore2 = (Score)ois.readObject();
        System.out.println(readScore2.getName() + ": " + readScore2.getJava());
        ois.close();
    }
}
