package org.example;

import org.example.data.Card;
import org.example.data.UnionPayCard;
import org.example.data.VisaCard;

import static org.example.data.Country.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        invoke(new UnionPayCard());
    }
    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(RU,22);
        System.out.println(card.getBalance());
    }
}
