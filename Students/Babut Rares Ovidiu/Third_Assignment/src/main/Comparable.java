package main;

public interface Comparable {
    String getNumber();
    void setNumber(String number);
    int compareTo(Comparable objectToCompareWith);
}
