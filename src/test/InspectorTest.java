//package test;
//
//import main.Action;
//import main.Facts;
//import main.Inspector;
//import main.Report;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.mock;
//
//public class InspectorTest {
//    @Test
//    public void inspectOneConditionEvaluatesTrue(){
//        final Facts facts = new Facts();
//        facts.setFact("jobTitle", "CEO");
//        final Action action = new JobTitleCondition();
//        final Inspector inspector = new Inspector(action);
//
//        final List<Report> reportList = inspector.inspect(facts);
//
//        assertEquals(1, reportList.size());
//
//        assertEquals(true, reportList.get(0).isPositive());
//    }
//
////    private static class JobTitleCondition implements Action {
////        @Override
////        public void perform(Facts facts) {
////            throw new UnsupportedOperationException();
////        }
////
////        @Override
////        public boolean evaluate(Facts facts) {
////            return "CEO".equals(facts.getFact("jobTitle"));
////        }
////    }
//}
