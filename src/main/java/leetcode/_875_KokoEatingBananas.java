package leetcode;

public class _875_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (calculateHoursNeeded(piles, mid) <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int calculateHoursNeeded(int[] piles, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1)/ speed;
        }
        return hours;
    }
}
