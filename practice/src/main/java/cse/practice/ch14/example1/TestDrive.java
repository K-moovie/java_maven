
package cse.practice.ch14.example1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestDrive {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        Score score1 = new Score("홍길동", 95);
        Score score2 = new Score("전우치", 92);
        
        FileOutputStream fos = new FileOutputStream("./src/main/java/cse/practice/ch14/example1/scores.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(score1);
        oos.writeObject(score2);
        
        oos.close();
    }
}
