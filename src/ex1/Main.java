package ex1;

/**
 * Created by igor on 25.04.15.
 */
public class Main {
    public static void main(String[] args) {
//        char c = 456 + 860;
//        System.out.println(c);
        char c = 456 + 860;
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + 456 + ": " + c);
            c++;


        }
    }
}
