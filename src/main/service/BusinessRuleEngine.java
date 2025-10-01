package main.service;

import main.domain.Facts;
import main.domain.Rule;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {
    private final List<Rule> rules;
    private final Facts facts;;

    public BusinessRuleEngine(final Facts facts) {
        this.rules = new ArrayList<>();
        this.facts = facts;
    }

    public void run(){
        this.rules.forEach(rule -> rule.perform(facts));
    }
}
