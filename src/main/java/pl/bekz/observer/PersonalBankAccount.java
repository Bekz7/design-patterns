package pl.bekz.observer;

import java.math.BigDecimal;

public class PersonalBankAccount {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        AccountOwner owner = new AccountOwner(account);
        BankEmployee employee = new BankEmployee(account);

        account.setBalance(BigDecimal.valueOf(1000.45));
        account.notifyObservers();
        owner.display();
        employee.display();
    }
}
