
public class HelloWorld {
    static int x=90; //this is shadowed 
    public static void main(String[] args) {
        System.out.println(x);
        int x=10000;
        System.out.println(x);
        
        
    }
}
