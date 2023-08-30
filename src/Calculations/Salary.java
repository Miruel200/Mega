package Calculations;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner out = new Scanner(System.in);
        System.out.println("   Заработная плата  ");
        System.out.print("Оклад ");
        int salary = out.nextInt();
        System.out.print("Календарные дни ");
        int days = out.nextInt();
        System.out.print("Отработанные дни ");
        int worked = out.nextInt();
        System.out.print("Премия ");
        int bonus = out.nextInt();
        System.out.print("Налоги ");
        double tax = out.nextInt();
        System.out.print("Удержание ");
        int deductions = out.nextInt();
        double resultTax = salary * 13 /100;
        double result = salary / days * worked + bonus - resultTax - deductions;
        System.out.println(" Заработная плата состоавляет: " + result);


    }
}
