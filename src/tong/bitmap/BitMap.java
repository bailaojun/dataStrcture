package tong.bitmap;

import java.util.Arrays;

/**
 * BitMap
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 1.位运算  或 与 非  异或  左移
 * 2.位图是位的集合，通过位图来进行操作位
 * 3.位图的应用场景：大批量无重复数据排序
 * 大批量数据查目标是否存在
 * 大批量数据去重
 * 布隆过滤器，实现迷糊匹配
 *
 * @date 2022/11/18 9:16
 */
public class BitMap  {
    // 私有成员变量 bits数组
    private long[] bits;
    // 初始化位图大小 有参构造  long 8 个字节， 64 位，
    public BitMap(int size){
        // 这里为什么size/64 +1?
        this.bits = new long[size/64 +1];
    }
    // 把对应的偏移量位置的值设置为1
    // a |= b
    // 意思是先把a和b都转换成二进制, 然后再进行位或运算,最后将运算的结果赋值给a.相当于a = a | b.
    // 坑 1L  和  int offset
    public void set (int offset){
        bits[offset/64] |= 1L << (offset % 64);
    }
    // 把对应的偏移量的位置的位值设置为0,其他的位值不变
    public void clear (int offset){
        // 1 偏移offset 然后取反得0  再与运算
        bits[offset/64] &= ~(1L << offset);
    }
    // 查看某一位的值 是0还是1
    public int get(int offset){
        // 0&1 = 0   1&1 = 1
        return (int) (bits[offset/64] >> (offset % 64) & 1);
    }

    public static void main(String[] args) {
        BitMap bitMap = new BitMap(100);
        bitMap.set(70);
        // 把数组转换为toString 进行打印
        System.out.println(Arrays.toString(bitMap.bits));
        System.out.println("bitMap.get(70) = " + bitMap.get(70));
        bitMap.clear(70);
        System.out.println("bitMap.get(70) = " + bitMap.get(70));
    }
    // java 中自带的BitSet


}
