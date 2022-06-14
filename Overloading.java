public class Overloading {
    public static void main(String[] args) {
        
        fun(245);
        fun("ritwik"); //Function overloading happens when two function of the same name
        // can exist but the arguments in them are different
    }

    static void fun( int a) {
        System.out.println(a);
    }

    static void fun( String name) {
        System.out.println(name);
    }
}
