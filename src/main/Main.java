package main;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        final Rule ruleSendEmailToSalesWhenCEO = RuleBuilder
                .when(facts -> "CEO".equals(facts.getFact("jobTitle")))
                .then(facts -> {
                    var name = facts.getFact("name");
                    Mailer.sendMail("sales@company.com", "Relevant customer!!: " + name);
                });


    }
}
