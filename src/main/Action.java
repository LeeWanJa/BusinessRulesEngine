package main;

@FunctionalInterface
public interface Action {
    void perform(Facts facts);
}
