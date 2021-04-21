package ku.bankaccount.model;

import ku.bankaccount.config.AttributeEncryptor;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue
    private UUID id;

    @Convert(converter = AttributeEncryptor.class)
    private String customerName;
    private double balance;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
