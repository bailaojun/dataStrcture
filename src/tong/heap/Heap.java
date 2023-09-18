package tong.heap;

import javax.lang.model.util.Elements;

/**
 * Heap
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * 小顶堆
 * @date 2022/11/18 12:11
 */
public class Heap {
    private int[] elements;
    // 数组中有几个元素
    private int size;

    public Heap (int capacity) {
        // 下标从1开始
        this.elements = new int[capacity + 1];
        this.size = 1;
    }
    public int size (){
        // 保证一开始为空
        return this.size -1;
    }
    // 优先级队列 入队的方法
    public void offer(int x){
        // 找到size位置  元素个数=下标大小 size++
        int s = this.size++;
        // 把元素放到s下标的位置
        elements[s] = x;
        // 向上进行堆化
        heapifyUp(s);
    }
    // 传入元素下标位置pos
    private void heapifyUp(int pos){
        while(pos > 0){
            // 堆的特点 ： 父节点的下标 等于 子节点的下标除以2
            int parent = pos >> 1;
        }
    }

}
