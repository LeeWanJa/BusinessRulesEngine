package main;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        final Condition condition = (Facts facts) -> "CEO".equals(facts.getFact("jobTitle"));
        final Action action = (Facts facts) -> {
            var name = facts.getFact("name");
            Mailer.sendMail("sales@company.com", "Relevant customer!!!: " + name);
        };

        final Rule rule = new DefaultRule(condition, action);


        // 빌더 패턴
        final Rule builderPatternRule = new RuleBuilder()
                .when(facts -> "CEO".equals(facts.getFact("jobTitle")))
                .then(facts -> {
                    var name = facts.getFact("name");
                    Mailer.sendMail("sales@company.com", "Relevant customer!!!: " + name);
                })
                .createRule();
    }
}
