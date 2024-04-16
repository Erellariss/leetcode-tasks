package leetcode;

import java.util.LinkedList;
import java.util.List;

//57
public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new LinkedList<>();
        for (int[] interval : intervals) {
            if (isIntersection(interval, newInterval)) {
                newInterval = merge(interval, newInterval);
            } else {
                result.add(interval);
            }
        }
        insertNewInterval(newInterval, result);
        return result.toArray(new int[result.size()][]);
    }

    private void insertNewInterval(int[] newInterval, List<int[]> result) {
        if (result.isEmpty()) {
            result.add(newInterval);
            return;
        }
        if (newInterval[1] < result.get(0)[0]) {
            result.add(0, newInterval);
            return;
        }
        if (newInterval[0] > result.get(result.size() - 1)[1]) {
            result.add(newInterval);
            return;
        }
        for (int i = 1; i < result.size(); i++) {
            if (isBetween(result.get(i - 1), newInterval, result.get(i))) {
                result.add(i, newInterval);
                return;
            }
        }
    }

    private boolean isIntersection(int[] a, int[] b) {
        return a[0] >= b[0] && a[0] <= b[1]
                || a[1] >= b[0] && a[1] <= b[1]
                || b[0] >= a[0] && b[0] <= a[1]
                || b[1] >= a[0] && b[1] <= a[1];
    }

    private boolean isBetween(int[] l, int[] m, int[] h) {
        if (h == null) {
            return l[1] < m[0];
        }
        if (l == null) {
            return h[0] > m[1];
        }
        return l[1] < m[0] && h[0] > m[1];
    }

    private int[] merge(int[] a, int[] b) {
        a[0] = Math.min(a[0], b[0]);
        a[1] = Math.max(a[1], b[1]);
        return a;
    }
}
