package inactionbookjava.behavior_parameterization_2.new_way.appleformatter;

import inactionbookjava.data.Apple;

public class AppleGetWeightPredicate implements AppleFormatter {

    public String accept(Apple apple) {
        return "An Apple of " + apple.getWeight() + "g";
    }
}