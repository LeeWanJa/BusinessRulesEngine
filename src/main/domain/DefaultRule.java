package main.domain;

public class DefaultRule implements Rule {
    private final Condition condition;
    private final main.domain.Action action;

    public DefaultRule(Condition condition, Action action) {
        this.condition = condition;
        this.action = action;
    }

    public void perform(final Facts facts) {
        if(condition.evaluate(facts)) {
            action.execute(facts);
        }
    }
}
