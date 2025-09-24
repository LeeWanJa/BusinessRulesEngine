package main;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Facts fact = new Facts();
        fact.addFact("jobTitle", "CEO");

        BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(fact);
        businessRuleEngine.addAction(facts -> {
            var jobTitle = facts.getFact("jobTitle");
            if("CEO".equals(jobTitle)) {
                var name = facts.getFact("name");
                // Mailer.sendEmail("sales@company.com", "Relevant customer: " + name);
                // 아직 미구현
            }
        });
        /*
            // 컴파일러가 속으로 생각하며 만드는 코드 (실제로는 더 최적화됨)
            new Action() {
                @Override
                public void perform(Facts facts) {
                    // 람다식의 { ... } 안의 내용이 그대로 들어옴
                    var jobTitle = facts.getFact("jobTitle");
                    if("CEO".equals(jobTitle)) {
                        var name = facts.getFact("name");
                        Mailer.sendEmail("sales@company.com", "Relevant customer: " + name);
                    }
                }
            }
         */

        // enum, switch 사용
        businessRuleEngine.addAction(facts -> {
            var forecastedAmount = 0.0;
            var dealStage = Stage.valueOf(facts.getFact("stage"));
            var amount = Double.parseDouble(facts.getFact("amount"));
            if(dealStage == Stage.LEAD){
                forecastedAmount = amount * 0.2;
            } else if(dealStage == Stage.INTERESTED){
                forecastedAmount = amount * 0.8;
            } else if(dealStage == Stage.EVALUATING){
                forecastedAmount = amount * 0.5;
            } else if(dealStage == Stage.CLOSED){
                forecastedAmount = amount;
            }
            facts.addFact("forecastedAmount", String.valueOf(forecastedAmount));
        });
    }
}
