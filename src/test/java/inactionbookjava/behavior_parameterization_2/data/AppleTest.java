package inactionbookjava.behavior_parameterization_2.data;

import inactionbookjava.data.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    
    public static List<Apple> getListApples() {
        List<Apple> apples = new ArrayList<>();
        Apple apple1 = new Apple();
        apple1.setColor("RED");
        apple1.setWeight(200);
        Apple apple2 = new Apple();
        apple2.setColor("GREEN");
        apple2.setWeight(300);
        Apple apple3 = new Apple();
        apple3.setColor("GREEN");
        apple3.setWeight(100);
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        return apples;
    }
}
