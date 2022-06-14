public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

    }
    static int swap(int a , int b) {
        int temp = a;
        a= b;
        b = temp;
        return a & b;

        /*
         * consider this in terms of reference variable and heap memory
         * you have initilised two vars a and b and they are both full of objects
         * you need to sequentially empty both of those numbers
         * first empty a in to some other empty var "temp"
         * now temp is full and "a" is empty
         * fill or direct the object of b into "a"
         * now b is full
         * now transfer the value of "temp" which has the value of "a" into b
         * now a and b are swapped
         */
    }
}
