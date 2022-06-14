public class Shadowing {

    static int x = 90;  // this will be shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x);  // 90

        int x = 40;  // the class variable at line 3 is shadowed by this
        System.out.println(x); //40

        fun();
        /*
         * int x ; //this is called declaration
         *  System.out.println(x); //scope will begin when value is initialised, so this line will give error
         * x = 40; // this is called initialisation
         */
    }
    static void fun() {
        System.out.println(x);  //90
    }
}
