import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ведите сумму:");
        int sum = s.nextInt();
        System.out.println("Ваша скидка в %:");
        int discount = s.nextInt();
        if (discount > 25){
            discount = 25;
        }
        System.out.println("К оплате:" + (sum - sum*discount/100));
    }
}
