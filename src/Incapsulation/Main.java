package Incapsulation;

import Incapsulation.Models.*;
import Incapsulation.Service.Impl.OperationImpl;
import Incapsulation.Service.Operation;

public class Main {
    public static void main(String[] args) {

        Operation operation = new OperationImpl();
        Order order = operation.getOrder("Morgan" ,"qwerty");
        System.out.println(order);


    }

}
