package pl.bekz.observer;

import java.math.BigDecimal;

public class AccountOwner implements Observer, View {
    private BigDecimal balance;

    AccountOwner(Subject account) {
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
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "AccountOwner{" +
                "balance=" + balance +
                '}';
    }
}

