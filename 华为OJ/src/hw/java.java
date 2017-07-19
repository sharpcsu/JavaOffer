//package hw;
//
///**
// * Created by sharp on 2017/7/11 - 14:19
// */
//public class java {
//    public V put(K key, V value) {
//        if (key == null)
//            return putForNullKey(value); //null总是放在数组的第一个链表中
//        int hash = hash(key.hashCode()); //计算hash值
//        int i = indexFor(hash, table.length); //计算数组索引
//
//        //遍历链表, 如果key在链表中已存在则替换为新的value, 如果不存在则不采取任何操作
//        for (Entry<K,V> e = table[i]; e != null; e = e.next) {
//            Object k;
//            //如果key在链表中已存在，则替换为新value
//            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) { //hash值相等 且 key相等
//                V oldValue = e.value;
//                e.value = value;
//                e.recordAccess(this);
//                return oldValue;
//            }
//        }
//
//        modCount++; //数组元素数目+1
//        addEntry(hash, key, value, i); //添加bean
//        return null;
//    }
//
//    void addEntry(int hash, K key, V value, int bucketIndex) {
//        Entry<K,V> e = table[bucketIndex];
//        table[bucketIndex] = new Entry<K,V>(hash, key, value, e); //参数e, 是Entry.next
//        //如果size超过threshold，则扩充table大小。再散列
//        if (size++ >= threshold)
//            resize(2 * table.length);
//    }
//
//}
