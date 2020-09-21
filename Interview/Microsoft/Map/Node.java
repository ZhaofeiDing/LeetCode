package Interview.Microsoft.Map;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/21 14:35
 */
//链表节点（链表类）
public class Node<K, V> implements Map.Entry<K, V> {
    K key;
    V value;

    //表示下一个节点
    Node<K, V> next;

    //构造一个包含当前节点和下一个节点的链表
    public Node(K key, V value, Node<K, V> node) {
        this.key = key;
        this.value = value;
        this.next = node;
    }

    //链表的get和set方法
    public K getKey() {
        return this.key;
    }

    public V setValue(V v) {
        V oldValue = this.value;
        this.value = v;
        return oldValue;
    }

    public V getValue() {
        return this.value;
    }
}
