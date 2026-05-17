class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        // Step 1: Build graph
        Map<Integer, List<int[]>> graph = new HashMap<>();

        for (int[] t : times) {
            graph.computeIfAbsent(t[0], x -> new ArrayList<>())
                 .add(new int[]{t[1], t[2]});
        }

        // Step 2: Min heap (time, node)
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );

        pq.offer(new int[]{0, k});

        // Step 3: Visited set
        Set<Integer> visited = new HashSet<>();

        int maxTime = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int time = current[0];
            int node = current[1];

            if (visited.contains(node)) continue;

            visited.add(node);
            maxTime = Math.max(maxTime, time);

            if (!graph.containsKey(node)) continue;

            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int travelTime = neighbor[1];

                if (!visited.contains(nextNode)) {
                    pq.offer(new int[]{time + travelTime, nextNode});
                }
            }
        }

        return visited.size() == n ? maxTime : -1;
    }
}