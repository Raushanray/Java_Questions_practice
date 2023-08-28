package java_8_functions_questions.string.demo;

public class StringDemo {
    public static void main(String[] args) {
        /*
        here i am creating string object using new keyword . and we know when we create a string object
        using new keyword it means it is a run time operating, so it's object is created in heap area..
        and in heap area no rule of  duplication. here create both string has return different objects.
        and output is else part..
         */
        String s3 = new String("java");
        String s4 = new String("java");
        if (s3 == s4) {
            System.out.println("String " + "\"s3 and s4\" " + " are creating using new keyword :- " + " both of the objects pointing to the same reference ");
        } else {
            System.out.println("String " + "\"s3 and s4\" " + " are creating using new keyword :- " + "String creating using new keyword " + " both of the objects pointing to the different reference ");
        }
        /*
        here i am creating string object using double quotes. and we know when we create a string object
        using new keyword it means it is a Compile time operating, so it's object is created in
        scp (string constant pool) area.
        and in scp area rule of  duplication is not allowed. here create both string has return same objects.
        and output is if part..
         */
        String s1 = "java";
        String s2 = "java";

        if (s1 == s2) {
            System.out.println("String " + "\"s1 and s2\" " + " are creating using string literals :- " + "both of the objects pointing to the same reference ");
        } else {
            System.out.println("String " + "\"s1 and s2\" " + " are creating using string literals :-  " + "both of the objects pointing to the different reference ");
        }
    }
}
