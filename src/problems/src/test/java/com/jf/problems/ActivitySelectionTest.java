package com.jf.problems;

import com.jf.problems.ActivitySelection.Activity;
import junit.framework.TestCase;

import java.util.List;

public class ActivitySelectionTest extends TestCase {

    public void testActivityOrder() {

        Activity[] activities = new Activity[]
                {
                        new Activity(0, 6),
                        new Activity(1, 2),
                        new Activity(5, 9),
                        new Activity(8, 9),
                        new Activity(5, 7),
                        new Activity(3, 4)
                };

        List<Activity> result = ActivitySelection.getActivities(activities);

        assertEquals(new Activity(1, 2), result.get(0));
        assertEquals(new Activity(3, 4), result.get(1));
        assertEquals(new Activity(5, 7), result.get(2));
        assertEquals(new Activity(8, 9), result.get(3));
    }

}
