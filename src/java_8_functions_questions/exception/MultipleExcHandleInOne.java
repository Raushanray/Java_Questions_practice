package java_8_functions_questions.exception;

public class MultipleExcHandleInOne {
    public static void main(String[] args) {
        /*
         give an ArithmeticException.
          so now wrap inside try and catch block..
         */
//        int no1 = 10;
//        int no2 = 0;
//        System.out.println(no1/no2);
        /*
        so now wrap inside try and catch block..
         */
//        try{
//            int no1 = 10;
//            int no2 = 0;
//            System.out.println(no1/no2);
//        }catch (ArithmeticException e){
//            System.out.println(e);
//        }
        /*
        now add a new case...
         */

//        try {
//            int no1 = 10;
//            int no2 = 2;
//            System.out.println(no1 / no2);
//            /*
//            now here give an another exception ArrayIndexOutOfBoundsException..
//             */
//            int[] k = new int[5];
//            for (int i = 0; i <= 5; i++) {
//                k[i] = i;
//            }
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//        /*
//        now again wrap a new catch block
//         */ catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
    /*
    before java-7 we have to handle a single exception in one catch block and this is a lengthy process..
    But from java 7 we can write multiple exceptions inside a single catch block.We can achieve this by
    using java bitwise operators.
     */
        try {
            /*
         give an ArithmeticException.
          so now wrap inside try and catch block..
         */
            int no1 = 10;
            int no2 = 0;
            System.out.println(no1 / no2);
            /*
            now here give an another exception ArrayIndexOutOfBoundsException..
             */
            int[] k = new int[5];
            for (int i = 0; i <= 5; i++) {
                k[i] = i;
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }


    }


}
