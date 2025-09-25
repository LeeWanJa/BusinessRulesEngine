package main;

@FunctionalInterface
public interface Rule {
    void perform(Facts facts);
}
