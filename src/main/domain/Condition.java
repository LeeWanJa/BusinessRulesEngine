package main.domain;

@FunctionalInterface
public interface Condition {
    boolean evaluate(Facts facts);
}
