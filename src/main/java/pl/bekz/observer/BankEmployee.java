package pl.bekz.observer;

import java.math.BigDecimal;

public class BankEmployee implements Observer, View {
    private BigDecimal balance;

    BankEmployee(Subject account) {
        account.addObserver(this);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void update(BigDecimal balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "BankEmployee{" +
                "balance=" + balance +
                '}';
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}

