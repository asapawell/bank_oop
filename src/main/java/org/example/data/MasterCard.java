package org.example.data;

public class MasterCard extends Card implements ICard{
    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }


    protected boolean isCountryValidForThisCard(Country country) {
        return true;
    }
}
