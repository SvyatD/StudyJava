import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = s.nextInt();
        String stNum = Integer.toString(number);
        int result = 0;
        System.out.println("String from number is:" + stNum);
    }
}
