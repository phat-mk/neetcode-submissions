class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for (int pile : piles) {
            right = Math.max(pile, right);
        }
        int result = right;
        while (left <= right) {
            int mid = left + (right-left) / 2;
            if (canFinish(piles, mid, h)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return result;
    }

    private boolean canFinish(int[] piles, int k, int h) {
        int sum = 0;
        for (int pile: piles) {
            sum += (pile + k - 1) / k;
        }
        return sum <= h;
    }

}