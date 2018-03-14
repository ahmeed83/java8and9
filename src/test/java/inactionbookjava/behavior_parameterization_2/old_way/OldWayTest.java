package inactionbookjava.behavior_parameterization_2.old_way;

import inactionbookjava.behavior_parameterization_2.data.AppleTest;
import inactionbookjava.data.Color;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class OldWayTest {

    @Test
    public void testFilterGreenApples() {
        assertEquals(2 , OldWay.filterGreenApples(AppleTest.getListApples()).size());
    }

    @Test
    public void testFilterApplesByColor() {
        assertEquals(2, OldWay.filterApplesByColor(AppleTest.getListApples(), Color.GREEN).size());
    }

    @Test
    public void testFilterApplesByWeight() {
        //find all the apples that are greater than the given weight
        assertEquals(2, OldWay.filterApplesByWeight(AppleTest.getListApples(), 150).size());
    }
}