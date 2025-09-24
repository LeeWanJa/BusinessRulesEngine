package test;

// mockito 임포트
import static org.mockito.Mockito.*;

import main.BusinessRuleEngine;
import main.ConditionalAction;
import main.Facts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessRuleEngineTest {
    @Test
    void shouldHaveNoRulesInitially(){
        final Facts mockFacts = mock(Facts.class);
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);

        assertEquals(0, businessRuleEngine.count());
    }

    @Test
    void shouldAddTwoActions(){
        final Facts mockFacts = mock(Facts.class);
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);

        final ConditionalAction mockAction1 = mock(ConditionalAction.class);
        final ConditionalAction mockAction2 = mock(ConditionalAction.class);
        businessRuleEngine.addAction(mockAction1);
        businessRuleEngine.addAction(mockAction2);

        assertEquals(2, businessRuleEngine.count());
    }

    @Test
    public void shouldPerformAnActionWithFacts(){
        final ConditionalAction mockAction = mock(ConditionalAction.class);
        final Facts mockFacts = mock(Facts.class);
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);

        businessRuleEngine.addAction(mockAction);
        businessRuleEngine.run();

        verify(mockAction).perform(mockFacts);
    }
}
