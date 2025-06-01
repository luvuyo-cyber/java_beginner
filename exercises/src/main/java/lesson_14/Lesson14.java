package lesson_14;

public class Lesson14 {

    public static void main(String[] args) {
        TestArray arr1 = new TestArray(5);
        arr1.addElement(5, 23);

    }
}

class TestArray {

    int[] intArray = new int[5];

    public TestArray(int size) {
        intArray = new int[size];
    }

    public void addElement(int index, int value) {
        intArray[index] = value;
    }
}