import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        fun(2,3,5,6,7,8);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
