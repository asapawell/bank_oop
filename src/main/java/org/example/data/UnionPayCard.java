package org.example.data;

public class UnionPayCard extends Card {
    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }


    protected boolean isCountryValidForThisCard(Country country) {
        return country == Country.CH;
    }
}
