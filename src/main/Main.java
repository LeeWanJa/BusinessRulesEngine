package main;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Facts facts = new Facts();
        facts.addFact("Mark", "CEO");

        BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(facts);
    }
}
