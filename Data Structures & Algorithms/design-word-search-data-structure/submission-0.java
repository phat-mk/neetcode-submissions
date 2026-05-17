class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}

class WordDictionary {

    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode currNode = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (currNode.children[index] == null) {
                currNode.children[index] = new TrieNode();
            }

            currNode = currNode.children[index];
        }

        currNode.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, TrieNode node) {
        if (node == null) return false;

        if (index == word.length()) {
            return node.isEnd;
        }

        char c = word.charAt(index);
        if (c == '.') {
            for (TrieNode child : node.children) {
                if(child != null && dfs(word, index + 1, child)){
                    return true;
                }
            }
            return false;
        } else {
            int idx = c - 'a';
            return dfs(word, index + 1, node.children[idx]);
        }

    }
}