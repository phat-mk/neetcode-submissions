class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Node result = new Node();
        HashMap<Node, Node> visited = new HashMap<>();

        result = DFS(node, visited);

        return result;
    }

    private Node DFS(Node node, HashMap<Node, Node> visited) {
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node clone = new Node(node.val, new ArrayList<>());
        visited.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(DFS(neighbor, visited));
        }

        return clone;
    }
}