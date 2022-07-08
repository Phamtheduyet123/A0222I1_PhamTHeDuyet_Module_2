package services;

import models.Customer;

public interface CustomerService  extends Service{
    void addNewCustomer(Customer customer);
    void editCustomer(Customer e, int id);
}
