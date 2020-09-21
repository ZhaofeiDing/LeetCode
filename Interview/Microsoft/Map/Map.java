package Interview.Microsoft.Map;

/**
 * @author Zhaofei.Ding
 * @date 2020/3/20 16:21
 */
//定义一个Map接口
public interface Map<K, V> {
    //向Map中插入值
    public V put(K k, V v);

    //根据key获取hashMap中的值
    public V get(K k);

    //获得Map中元素的个数
    public int size();

    //获取Map中，键值对的对象
    interface Entry<K, V> {
        K getKey();

        V getValue();

        V setValue(V v);
    }
}
