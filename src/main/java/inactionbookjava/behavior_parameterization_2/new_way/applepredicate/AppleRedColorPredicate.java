package inactionbookjava.behavior_parameterization_2.new_way.applepredicate;

import inactionbookjava.data.Apple;
import inactionbookjava.data.Color;

//Select only green apples
public class AppleRedColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return Color.RED.name().equals(apple.getColor());
    }
}