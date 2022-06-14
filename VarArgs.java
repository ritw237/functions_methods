import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,44,112,42,125,75);

        multiple(2,3, "ritwik", "someone_else");
    }

    static void multiple(int a , int b, String ...v) { //controlled arguments, ...v varargs should always come in end

    }

    static void fun(int ...v) { // ...v is called Variable Arguments , means you can take any no. of args
        System.out.println(Arrays.toString(v));
    }
}
