//package main;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Inspector {
//    private final List<Action> actionList;
//
//    public Inspector(final Action... actionList) {
//        this.actionList = Arrays.asList(actionList);
//    }
//
//    public List<Report> inspect(final Facts facts) {
//        final List<Report> reportList = new ArrayList<>();
//        for(Action action : actionList) {
//            final boolean conditionResult = action.evaluate(facts);
//            reportList.add(new Report(facts, action, conditionResult));
//        }
//        return reportList;
//    }
//}
