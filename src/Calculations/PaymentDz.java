package Calculations;
import java.util.Scanner;

public class PaymentDz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сумма кредита: ");
        double total = in.nextDouble();
        System.out.println("Годовая процентная ставка: ");
        float percent = in.nextFloat();
        System.out.print("Срок кредита в мясацах: ");
        int montCount = in.nextInt();
        double r = percent / 12 / 100;
        double result = total * (r * Math.pow((r + 1),montCount))/ (Math.pow((1+r) ,montCount)) - 1;
        System.out.println(" Ежемесячный платеж: " + result);

    }
}
