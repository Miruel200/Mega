package Incapsulation.Service.Impl;

import Incapsulation.Models.Category;
import Incapsulation.Service.DbHelper;

import java.util.Locale;

public class DbHelperImpl implements DbHelper {
    @Override
    public void getAllCategory() {
        Category alcohol = new Category(1l, "Алкоголь");
        Category bakery = new Category(2L, "Выпечка");
        Category diary = new Category(3L, "Молочные");
        Category vegetables = new Category(4L, "Овощи");
        Category sweets = new Category(5L, "Кондитерская");

        Category[] categories = getCategory();
        for (Category item :categories) {
            System.out.println(item.getName());
            
        }

    }
    @Override
    public void getProductByCategoryName(String name) {


    }

    @Override
    public Category[] getCategory() {
        return new Category[0];
    }

}
