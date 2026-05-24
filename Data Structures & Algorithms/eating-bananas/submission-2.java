class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;
        for(int pile : piles) {
            right = Math.max(right, pile);
        }
        int result = 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (isValid(piles, h, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public boolean isValid(int[] piles, int h, int k) {
        int sum = 0;
        for(int pile: piles) {
            sum += Math.ceil((double) pile/k);
        }

        return sum <= h;
    }

}