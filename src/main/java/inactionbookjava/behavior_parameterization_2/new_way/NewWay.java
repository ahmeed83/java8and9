package inactionbookjava.behavior_parameterization_2.new_way;

import inactionbookjava.behavior_parameterization_2.new_way.appleformatter.AppleFormatter;
import inactionbookjava.behavior_parameterization_2.new_way.applepredicate.ApplePredicate;
import inactionbookjava.data.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NewWay {

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<String> prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        List<String> strings = new ArrayList<>();
        for (Apple apple : inventory) {
            strings.add(formatter.accept(apple));
        }
        return strings;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
}






