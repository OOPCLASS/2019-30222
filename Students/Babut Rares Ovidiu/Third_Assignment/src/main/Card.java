package main;

public class Card implements Comparable {
    private String number;
    private String suit;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }


    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int compareTo(Comparable objectToCompareWith) {
        int a, b;
        if (objectToCompareWith.getNumber().equals("J"))
            a = 11;
        else if (objectToCompareWith.getNumber().equals("Q"))
            a = 12;
        else if (objectToCompareWith.getNumber().equals("K"))
            a = 13;
        else if (objectToCompareWith.getNumber().equals("A"))
            a = 14;
        else
            a = Integer.parseInt(objectToCompareWith.getNumber());
        if (this.number.equals("J"))
            b = 11;
        else if (this.number.equals("Q"))
            b = 12;
        else if (this.number.equals("K"))
            b = 13;
        else if (this.number.equals("A"))
            b = 14;
        else
            b = Integer.parseInt(this.number);
        if (a > b)
            return -1;
        if (a == b)
            return 0;
        return 1;
    }
}

