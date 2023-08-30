package LesonSeven;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*100);
        Scanner out = new Scanner(System.in);
        System.out.println(randomNumber);
        for (int i = 0; i < 5; i++) {
            System.out.println("1 tru");
            int userNumber = out.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Success!");
                break;
            }else if (randomNumber > userNumber)
                System.out.println("Bigger");
            else
                System.out.println("lower");
        }

    }
}
