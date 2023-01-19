import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
    int number = 1000;
//        while (number <= 1000) {
//            if (number % 2 == 0)
//            System.out.println(number);
//            number++;
//      }
        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
