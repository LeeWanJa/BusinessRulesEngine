package main;

@FunctionalInterface
public interface Condition {
    boolean evaluate(Facts facts);
}
