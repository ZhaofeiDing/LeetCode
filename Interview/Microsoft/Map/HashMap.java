package Interview.Microsoft.Map;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/21 14:35
 */
public class HashMap<K, V> implements Map<K, V> {
    Node<K, V>[] array = null;
    private static int defaultLength = 16;
    private static double factor = 0.75D;
    private int size;


    public V put(K k, V v) {

        //1.加载机制，初始化一个数组
        if (array == null) {
            array = new Node[defaultLength];
        }

        //2.计算数组下标
        int index = hash(k, defaultLength);

        //3.扩容，判断是否需要扩容
        //扩容规则，元素的个数size大于桶的尺寸*加载因子
        if (size > defaultLength * factor) {
            resize();
        }


        //4.放入要插入的元素（添加到链表）
        Node<K, V> node = array[index];
        //先判断一下这个链表的index位置是否为空
        if (node == null) {
            array[index] = new Node<K, V>(k, v, null);
            size++;
        } else {
            if (k.equals(node.getKey()) || k == node.getKey()) {
                return node.setValue(v);
            } else {
                array[index] = new Node<K, V>(k, v, node);
                size++;
            }
        }

        return null;
    }


    //扩容，重新排列元素
    private void resize() {

        //翻倍扩容
        //1.创建新的array临时变量，相当于defaultLength * 2
        Node<K, V>[] temp = new Node[defaultLength << 2];

        //2.重新计算散列值，插入到新的array中，如code = key % defaultLength -->  code = key % (defaultLength * 2)

        Node<K, V> node = null;
        for (int i = 0; i < array.length; i++) {
            node = array[i];
            while (node != null) {
                //重新散列
                int index = hash(node.getKey(), temp.length);
                //插入链表的头部
                Node<K, V> next = node.next;
                node.next = temp[index];
                temp[index] = node;
                node = next;
            }
        }

        //3.替换掉旧的array
        array = temp;
        //更新默认的扩容因子的值
        defaultLength = temp.length;
        temp = null;

    }

    //计算位置
    private int hash(K k, int length) {
        int code = k.hashCode();

        return code % length;
    }

    //实现HashMap的get()方法
    public V get(K k) {
        if (array != null) {
            int index = hash(k, defaultLength);
            Node<K, V> node = array[index];

            while (node != null) {
                if (node.getKey() == k) {
                    return node.getValue();
                } else {
                    node = node.next;
                }
            }

        }
        return null;
    }

    //获取HashMap元素个数
    public int size() {
        return size;
    }

}
