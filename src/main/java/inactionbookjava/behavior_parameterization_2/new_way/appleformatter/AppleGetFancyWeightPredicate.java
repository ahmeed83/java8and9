package inactionbookjava.behavior_parameterization_2.new_way.appleformatter;

import inactionbookjava.data.Apple;

public class AppleGetFancyWeightPredicate implements AppleFormatter {

    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "Heavy apple" : "Not really heavy apple";
        return characteristic + " And the color is: " + apple.getColor();
    }
}