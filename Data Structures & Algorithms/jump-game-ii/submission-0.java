class Solution {
    public int jump(int[] nums) {
        int numberJump = 0, currentEnd = 0, farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if ( i == currentEnd) {
                numberJump++;
                currentEnd = farthest;
            }
        }

        return numberJump;
    }
}