package ru.itis.inf403.lab202.setGen;

public class Set403TestCardsEquals {
    public static void main(String[] args) {
        Set403Impl<Card> collection = new Set403Impl<>();
        Card card1 = new Card("Legend", 10, 10, 5);
        Card card2 = new Card("Warrior", 3, 2, 2);
        Card card3 = new Card("Rat", 1, 2, 1);
        Card card4 = new Card("Rat", 2, 1, 1);
        collection.add(card1);
        collection.add(card2);
        collection.add(card3);
        collection.add(card4);

        System.out.println(collection.remove(card3));
    }
}
