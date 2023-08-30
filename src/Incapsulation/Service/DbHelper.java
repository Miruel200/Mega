package Incapsulation.Service;

import Incapsulation.Models.Category;

public interface DbHelper {
    void getAllCategory();
    void getProductByCategoryName(String name);
    Category[] getCategory();

}
