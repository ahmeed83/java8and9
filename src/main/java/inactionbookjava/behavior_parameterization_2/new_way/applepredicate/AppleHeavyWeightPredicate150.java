package inactionbookjava.behavior_parameterization_2.new_way.applepredicate;

import inactionbookjava.data.Apple;

public class AppleHeavyWeightPredicate150 implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}