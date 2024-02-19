package org.example.data;

abstract public class Card {
    protected String cardHolder;
    protected int balance;
    protected String cardNumber;
    protected PaymentSystem paymentSystem;

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public Card(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    public void payInCountry(Country country, int amount) {
        if (isCountryValidForThisCard(country) && isBalanceGreaterOrEqualThan(amount)) {
            balance -= amount;
            System.out.println("Accepted");
        }
    }

    protected abstract boolean isCountryValidForThisCard(Country country);

    protected boolean isBalanceGreaterOrEqualThan(int amount) {
        return balance >= amount;
    }

    ;
}
