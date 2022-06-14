import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String message= greet();
        // System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = in.next();

        String personlised = myGreet(name);
        System.out.println(personlised);
    }

     static String myGreet(String name) {
        String message = "hello " + name;
        return message;
        
    }
    static String greet() {

        String greeting = "Hello coders!!!";

        return greeting;
    }
}
