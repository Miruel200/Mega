package LessonSix;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.println("Калькулятор налога");
        int tax = out.nextInt();
        int tax1 = 0;
         int tax2 = 0;
         int tax3 =0;
        if (tax >= 0 && tax <= 10000) {
            tax1 = tax/100*10;
            System.out.println("Налог 10% будет: " + tax1);
        }else if (tax >= 10000 && tax <=30000 ){
            tax2 = tax / 100 * 20;
            System.out.println("Налог будет состовлять 20%: " + tax2);
        }else if (tax>= 30000){
            tax3 = tax / 100 * 30;
            System.out.println("Налог будет состовлять 30%: " + tax3);
        }else
            System.out.println(" Некоректный ввод");





    }

}
