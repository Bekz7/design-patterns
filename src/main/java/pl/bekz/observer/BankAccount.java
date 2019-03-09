package pl.bekz.observer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

public class BankAccount implements Subject {
    private ArrayList<Observer> observers;
    private BigDecimal balance;

    BankAccount() {
        this.observers = new ArrayList<>();
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        Optional.ofNullable(o).map(observers::remove).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(balance));
    }

    void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
