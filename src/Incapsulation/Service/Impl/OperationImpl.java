package Incapsulation.Service.Impl;

import Incapsulation.Models.Order;
import Incapsulation.Service.DbHelper;
import Incapsulation.Service.Operation;

import java.util.Scanner;

public class OperationImpl implements Operation {
    Scanner out = new Scanner(System.in);
    DbHelper dbHelper  = new  DbHelperImpl ();

    @Override
    public Order getOrder(String login, String password) {

        System.out.println(" Добро пожаловать ");
        System.out.println(" Выберите категорию продуктов ");
        dbHelper.getAllCategory();
        String selectedCategory = out.next();
        dbHelper.getProductByCategoryName(selectedCategory);

        return null;

    }
}
