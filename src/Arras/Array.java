package Arras;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        String[] citi = new String[10];
        int count = 0;
        while (count<10){
            System.out.println("Хотите добавить город ? ");
            String answer = out.next();
            if (answer.equals("y")){
                System.out.println(" введите Название города ");
                String city = out.next();
                citi[count]= city;
                count ++;

                System.out.println("Город " + city + " Успешно добавлен" );
            }else if (answer.equals("n")){
                System.out.println("Список городов ");
                for (int i=0;i<citi.length;i++){
                    System.out.println("Город " + citi[i]);
                    System.out.println("Хотите удалить город ?");
                    String ans  = out.next();
                    if (ans.equals("y")){
                        citi[i] = null;
                    }
                }
                break;
            }else{
                System.out.println(" Вы ввели не правильно , повторите попытку ");
            }

        }
        System.out.println("Список городов: ");
        int countOfNull = 0;
        for (String city:citi) {
            if (city != null) {
                System.out.println(city);
            }else {
                countOfNull ++ ;
            }
        }
        System.out.println("Количесво символов со значением null: " + countOfNull);

    }
}
