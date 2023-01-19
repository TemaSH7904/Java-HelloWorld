import java.util.Scanner;

public class YabndexTest1 {
    public static void main(String[] args) {
//Ввод строк по заданому количеству пользователем
        Scanner scanner = new Scanner(System.in);
        int numQuestion = scanner.nextInt();
        boolean terms = numQuestion >= 1 && numQuestion <= 100;
        int i = 0;
        while (i <= numQuestion && terms) {
            String line = scanner.nextLine();
            i++;
        }
    }
}
