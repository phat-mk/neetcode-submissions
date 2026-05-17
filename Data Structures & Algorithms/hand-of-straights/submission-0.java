class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0) return false;

        Arrays.sort(hand);

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int card : hand){
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        for(int card : hand) {
            if (countMap.get(card) == 0) continue;

            for(int i = 0; i < groupSize; i++){
                int current = card + i;

                if (!countMap.containsKey(current) || countMap.get(current) == 0) {
                    return false;
                }

                countMap.put(current, countMap.get(current) - 1);
            }
        }

        return true;
    }
}