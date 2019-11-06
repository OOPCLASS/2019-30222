package main;

public interface Iterator {
    boolean hasNext();
    Card next();
    void remove();
}
