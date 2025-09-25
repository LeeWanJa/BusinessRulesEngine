package main;

public class Report {
    private final Action action;
    private final Facts facts;
    private final boolean isPositive;

    public Report(final Facts facts, final Action action, final boolean isPositive) {
        this.facts = facts;
        this.action = action;
        this.isPositive = isPositive;
    }

    public Action getConditionalAction() {
        return action;
    }

    public Facts getFacts() {
        return facts;
    }

    public boolean isPositive() {
        return isPositive;
    }

    @Override
    public String toString() {
        return "Report{" +
                "conditionalAction=" + action +
                ", facts=" + facts +
                ", result=" + isPositive +
                '}';
    }
}
