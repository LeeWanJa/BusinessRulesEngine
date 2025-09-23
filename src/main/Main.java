package main;

public class Main {
    public static void main(String[] args) {
        final Customer customer = new Customer("Mark", "CEO");

        BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        // 방법 1 : 익명 클래스
        businessRuleEngine.addAction(new Action() {
            @Override
            public void perform() {
                if("CEO".equals(customer.getPosition())){
                    Mailer.sendEmail("sales@company.com", "Relevant customer: " + customer.getName());
                }
            }
        });

        // 방법 2 : 람다식
        businessRuleEngine.addAction(() -> {
           if("CEO".equals(customer.getPosition())){
               Mailer.sendEmail("sales@company.com", "Relevant customer: " + customer.getName());
           }
        });

        /*
            1. Action이 외부의 하드코딩된 Customer 객체를 끌어다 쓰고 있음. 즉 Action을 테스트 하려면 무조건
            Customer 객체 하나를 선언하고 해야함. 직업의 종류가 다양해지면 질 수록 많은 수의 하드코딩된 Customer
            객체가 필요할 것이다. 따라서 외부에서 객체를 주입받는게 아니라 Action을 실행할 때 customer 객체가 매개변수로
            전달받아야 한다.

            2. Action 이 다루어야 하는 데이터가 외부에 존재하기 때문에 애초에 예측했던 객체의 상태가 변할 수 있는
            위험이 존재하기 때문에 데이터와 규칙 엔진은 함께 묶여야 한다. 이를 통해 규칙 엔진이 실행될 때 바로 함께
            그룹화된 데이터가 실행되면서 데이터의 안전성이 보장된다.
         */
    }
}
