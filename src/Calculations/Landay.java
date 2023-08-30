package Calculations;
import java.util.Scanner;
public class Landay {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.println(" Формула красоты Ландау ");
        System.out.print("Введите обьем бюста ");
        int bust = out.nextInt();
        System.out.print("Введите обьем бедр ");
        int hip = out.nextInt();
        System.out.print("Введите обьем талии ");
        int waist = out.nextInt();
        System.out.print("Введите рост ");
        int height = out.nextInt();
        System.out.print("Введите обьем вес ");
        int weight = out.nextInt();
        double result = (bust * hip * height) / (Math.pow(waist,2)*weight);
        System.out.println("Привлекательность составляет : " + result);
    }
}
