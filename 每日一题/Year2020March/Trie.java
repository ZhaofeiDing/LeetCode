package 每日一题.Year2020March;

/**
 * @author Zhaofei.Ding
 * @date 2020/4/1 23:37
 */
public class Trie {
    private boolean isNew;
    Trie[] next;

    public Trie() {
        next = new Trie[26];
    }

    public int insert(String word) {
        Trie node = this;
        isNew = false;
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i);
            if (node.next[c - 'a'] == null) {
                isNew = true;
                node.next[c - 'a'] = new Trie();
            }
            node = node.next[c - 'a'];
        }
        return isNew ? word.length() + 1 : 0;
    }
}
