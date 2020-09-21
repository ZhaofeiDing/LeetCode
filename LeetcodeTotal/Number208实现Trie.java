package LeetcodeTotal;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/1 22:43
 */
public class Number208实现Trie {
    class Trie {
        private boolean isEnd;
        Trie[] next;

        public Trie() {
            isEnd = false;
            next = new Trie[26];
        }

        public void insert(String word) {
            Trie node = this;
            for (char c : word.toCharArray()) {
                if (node.next[c - 'a'] == null) {
                    node.next[c - 'a'] = new Trie();
                }
                node = node.next[c - 'a'];
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            Trie node = this;
            for (char c : word.toCharArray()) {
                node = node.next[c - 'a'];
                if (node == null) {
                    return false;
                }
            }
            return node.isEnd;
        }

        public boolean startsWith(String prefix) {
            Trie node = this;
            for (char c : prefix.toCharArray()) {
                node = node.next[c - 'a'];
                if (node == null) {
                    return false;
                }
            }
            return false;
        }
    }
}
