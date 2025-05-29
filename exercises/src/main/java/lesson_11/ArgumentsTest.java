package lesson_11;

public class ArgumentsTest {
    public static void main(String[] args) {
//        System.out.println("args[0] is " + args[0]);
//        System.out.println("args[1] is " + args[1]);
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        System.out.println("Total is " + (arg1 + arg2));
    }
}