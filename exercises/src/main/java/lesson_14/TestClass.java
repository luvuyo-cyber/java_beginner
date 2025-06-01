package lesson_14;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestClass {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        try{
            tc.testCheckedException();
        }catch(IOException e) {
            System.out.println(e);
        }  catch (Exception ex) {
            Logger.getLogger(TestClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void testCheckedException() throws Exception {
        File testFile = new File("/Users/shadowsgeneraldealer/bootcamp/Github/java_beginner/exercises/src/main/java/lesson_14/testFile.txt");
        testFile.createNewFile();
        System.out.println("testFile exists: " +
                testFile.exists());
    }
}
