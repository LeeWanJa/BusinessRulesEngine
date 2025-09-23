package test;

// mockito 임포트
import static org.mockito.Mockito.*;

import main.Action;
import main.BusinessRuleEngine;
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

        final Action mockAction1 = mock(Action.class);
        final Action mockAction2 = mock(Action.class);
        businessRuleEngine.addAction(mockAction1);
        businessRuleEngine.addAction(mockAction2);

        assertEquals(2, businessRuleEngine.count());
    }

    @Test
    public void shouldPerformAnActionWithFacts(){
        final Action mockAction = mock(Action.class);
        final Facts mockFacts = mock(Facts.class);
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);

        businessRuleEngine.addAction(mockAction);
        businessRuleEngine.run();

        verify(mockAction).perform(mockFacts);
    }
}
