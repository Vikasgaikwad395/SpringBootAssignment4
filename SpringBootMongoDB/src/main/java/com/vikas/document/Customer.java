package com.vikas.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("customer")
public class Customer {

    @Id
    private Integer custId;
    private String customerName;
    private String customerEmail;
    private Double customerSalary;

    public Customer() {
        super();
    }

    public Customer(Integer custId, String customerName, String customerEmail, Double customerSalary) {
        this.custId = custId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerSalary = customerSalary;
    }

    public Customer(int custId, String wills, String customerEmail, int i) {

    }


    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Double getCustomerSalary() {
        return customerSalary;
    }

    public void setCustomerSalary(Double customerSalary) {
        this.customerSalary = customerSalary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerSalary=" + customerSalary +
                '}';
    }
}