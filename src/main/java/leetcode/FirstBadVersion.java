package leetcode;

import leetcode.utils.VersionControl;

public class FirstBadVersion extends VersionControl {

    public FirstBadVersion(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid;
        int candidate = 1;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                candidate = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return candidate;
    }
}
