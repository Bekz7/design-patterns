package pl.bekz.observer

import pl.bekz.observer.spock.lang.Specification

class BankAccountTest extends Specification {

    private def account

    def setup(){
        given: "New bank account was created"
            account = new BankAccount()
    }

    def "Should add an Observer"() {
        given: "New bank account"
        when: "New observer for account"
            def owner = new AccountOwner(account)
        then: "Bank account should be followed by new user"
             !account.getObservers().empty
    }

    def "Should delete an observer"() {
        given: "New bank account and observer for account"
            def owner = new AccountOwner(account)
        when: "Observer was deleted from observe list"
            account.deleteObserver(owner)
        then: "List of observers should be empty"
             account.getObservers().empty
    }

    def "NotifyObservers"() {
        given: "New bank account observers for account and balance has been set"
            def owner = new AccountOwner(account)
            def bankEmployee = new BankEmployee(account)
            account.setBalance(10000)
        when: "Observer was notify"
            account.notifyObservers()
        then: "Observers"
            owner.getBalance() == bankEmployee.getBalance()
    }
}
