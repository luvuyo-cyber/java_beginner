package lesson_14;

public class Utils {
    //with TRY-CATCH BLOCK no need to type throws Exception after method_name()
    public void doThis() {
        try{
            doThat();
        }catch(Exception e){
            System.out.println(e);
        }
//        System.out.println("Arrived in doThis()");
        System.out.println("Back in doThis");
    }

    //NO TRY-CATCH BLOCK
    public void doThat() throws Exception {
        System.out.println("In doThat: Printing exception");
        throw new Exception("Ouch!");
    }

    public static void main(String[] args) {
        Utils util = new Utils();
        util.doThis();
    }
}