package Incapsulation.Service;

import Incapsulation.Models.Order;

public interface Operation {
    Order getOrder(String login , String password);
}
