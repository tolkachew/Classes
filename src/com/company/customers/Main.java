package com.company.customers;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Aaa", 100L);
        Customer customer2 = new Customer("Ccc");
        Customer customer3 = new Customer("Bbb");

        Customers cusmoters = new Customers();
        cusmoters.addCustomer(customer1,1);
        cusmoters.addCustomer(customer2,2);
        cusmoters.addCustomer(customer3,3);

        cusmoters.sort();
        cusmoters.print();
        cusmoters.printSomeNumbers(0,101);
    }
}

class Customers {
    private Customer[] customers = new Customer[3];

    public void addCustomer(Customer customer, int index) {
        customers[index] = customer;
    }

    public void sort() {
        Comparator<Customer> comparator = (c1, c2) -> c1.getSurname().compareTo(c2.getSurname());
        Arrays.sort(customers, comparator);
    }

    public void print() {
        for (Customer customer : customers)
            System.out.println(customer.toString());
    }

    public void printSomeNumbers(long begin, long end) {
        for (Customer customer : customers)
            if (customer.getNumber() >= begin && customer.getNumber() <= end)
                System.out.println(customer.toString());
    }
}