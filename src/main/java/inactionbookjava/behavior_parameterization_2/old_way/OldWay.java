package inactionbookjava.behavior_parameterization_2.old_way;

import inactionbookjava.data.Apple;
import inactionbookjava.data.Color;

import java.util.ArrayList;
import java.util.List;

public class OldWay {

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<Apple>();
        for(Apple apple: inventory){
            if(Color.GREEN.name().equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: inventory) {
            if (apple.getColor().equals(color.name())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple: inventory) {
            if(apple.getWeight() > weight){
                result.add(apple);
            }
        }
        return result;
    }

    // Is it DRY??? (don't repeat your self??) no i don't thing so

}