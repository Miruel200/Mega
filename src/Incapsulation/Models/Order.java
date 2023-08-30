package Incapsulation.Models;

public class Order {
    private Long id;
    private Cashier cashier;
    private Details[] details;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public Details[] getDetails() {
        return details;
    }

    public void setDetails(Details[] details) {
        this.details = details;
    }
}
