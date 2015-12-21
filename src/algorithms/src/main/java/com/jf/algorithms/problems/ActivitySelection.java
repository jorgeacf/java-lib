package com.jf.algorithms.problems;

import com.jf.utils.CheckUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class ActivitySelection {

    private ActivitySelection() { }

    public static List<Activity> getActivities(Activity[] initialActivities) {

        CheckUtils.isNull(initialActivities, "initialActivities");

        Arrays.sort(initialActivities, new Comparator<Activity>() {

            public int compare(Activity a1, Activity a2) {

                if(a1.getEnd().compareTo(a2.getEnd()) < 0) { return -1; }
                if(a1.getEnd().compareTo(a2.getEnd()) > 0) { return 1; }

                return 0;
            }
        });

        List<Activity> activities = new LinkedList<Activity>();
        activities.add(initialActivities[0]);

        int len = initialActivities.length;
        for(int i = 1; i < len; i++) {

            if(initialActivities[i].getStart() > activities.get(activities.size()-1).getEnd()) {
                activities.add(initialActivities[i]);
            }
        }

        return activities;
    }




    public static class Activity {
        private final Integer start;
        private final Integer end;

        public Activity(Integer start, Integer end) {
            this.start = start;
            this.end = end;
        }

        public Integer getStart() {
            return start;
        }

        public Integer getEnd() {
            return end;
        }

        @Override
        public String toString() {
            return String.format("[%d,%d]", start, end);
        }

        @Override
        public boolean equals(Object object) {

            if(object instanceof Activity) {
                Activity that = (Activity)object;
                return this.start.equals(that.start) && this.end.equals(that.end);
            }

            return true;
        }

        @Override
        public int hashCode() {
            int hash = 17;
            hash = 31 * hash + start;
            hash = 31 * hash + end;
            return hash;
        }

    }

}
