package inactionbookjava.behavior_parameterization_2.new_way;

import inactionbookjava.behavior_parameterization_2.data.AppleTest;
import inactionbookjava.behavior_parameterization_2.new_way.appleformatter.AppleGetFancyWeightPredicate;
import inactionbookjava.behavior_parameterization_2.new_way.appleformatter.AppleGetWeightPredicate;
import inactionbookjava.behavior_parameterization_2.new_way.applepredicate.AppleGreenColorPredicate;
import inactionbookjava.behavior_parameterization_2.new_way.applepredicate.AppleHeavyWeightPredicate150;
import inactionbookjava.behavior_parameterization_2.new_way.applepredicate.AppleRedColorAndHeavyWeightPredicate500;
import inactionbookjava.behavior_parameterization_2.new_way.applepredicate.AppleRedColorPredicate;
import inactionbookjava.data.Color;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class NewWayTest {

    //NOTE: You can use one method that manage for you the filter. You have to pass the interface that you want to filter

    @Test
    public void testFilterApples() {
        assertEquals(2, NewWay.filterApples(AppleTest.getListApples(), new AppleGreenColorPredicate()).size());
        assertEquals(1, NewWay.filterApples(AppleTest.getListApples(), new AppleRedColorPredicate()).size());
        assertEquals(2, NewWay.filterApples(AppleTest.getListApples(), new AppleHeavyWeightPredicate150()).size());
        assertEquals(0, NewWay.filterApples(AppleTest.getListApples(), new AppleRedColorAndHeavyWeightPredicate500()).size());
    }

    @Test
    public void testPrettyPrintApple() {
        assertEquals(3, NewWay.prettyPrintApple(AppleTest.getListApples(), new AppleGetWeightPredicate()).size());
        assertTrue("An Apple of 200g", NewWay.prettyPrintApple(AppleTest.getListApples(), new AppleGetWeightPredicate()).get(0).equals("An Apple of 200g"));
        assertEquals(3, NewWay.prettyPrintApple(AppleTest.getListApples(), new AppleGetFancyWeightPredicate()).size());
        assertTrue("Heavy apple And the color is: RED", NewWay.prettyPrintApple(AppleTest.getListApples(), new AppleGetFancyWeightPredicate()).get(0).equals("Heavy apple And the color is: RED"));
    }

    @Test
    public void testFilterLambda() {
        assertEquals(2, NewWay.filter(AppleTest.getListApples(), apple -> apple.getWeight() > 150).size());
        assertEquals(3, NewWay.filter(AppleTest.getListApples(), apple -> apple.getWeight() < 500).size());
        assertEquals(2, NewWay.filter(AppleTest.getListApples(), apple -> apple.getColor().equals(Color.GREEN.name())).size());
        assertEquals(1, NewWay.filter(AppleTest.getListApples(), apple -> apple.getColor().equals(Color.RED.name())).size());
    }
}

