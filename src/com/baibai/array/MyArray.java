package com.baibai.array;


/**
 * MyaArray
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description 实现一个线性表 ，不定长，可以扩容，只能存储相同类型数据，有序存储。
 * @date 2022 /7/13 11:41
 */
public class MyArray {
    private int[] array;
    private int size;


    public MyArray(int initSize) {
        // initSize 指的是数组的长度
        this.array = new int[initSize];
        // size 指的是元素个数，线性表里面有多少个元素
        size = 0;
    }


    /**
     * Insert.
     * 增  线性表的插入操作： 根据下标进行插入操作，传入一个数据一个下标。
     *
     * @param element the element
     * @param index   the index
     */
    public void insert(int element, int index) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        // 坑啊
        if (size >= array.length) {
            recapacity();
        }
        // 坑1：用size进行比较，因为此时线性表的长度就等于元素个数，
        // 坑2：关键是最后一个元素也要移动，边界元素也要移动
        // 最关键的规律:无论是头插尾插还是中间插入 要移动的元素个数始终是size-1-index下标
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        // 坑3：忘记元素增加了
        size++;
    }

  /**
     * Add.
     * 这个方法实现的是 在线性表中顺序添加元素
     *
     * @param element the element
     */
   /* public void add(int element) {
        insert(element, size);
    }*/


    /**
     * Deleted int.
     *
     * @param index the index
     * @return the int
     * 删   坑：方法返回值类型是什么，一定得写对。
     */

    public int deleted(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        int deletedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[index] = array[index + 1];
        }
        size--;
        // return 后面不能写语句了，不然报错。
        return deletedElement;
    }

    /**
     * Modify.
     *
     * @param index   the index
     * @param element the element
     */
// 改
    public void modify(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        array[index] = element;
    }

    /**
     * Find int.
     *
     * @param index the index
     * @return the int
     */
// 查
    public int find(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        int findElement = array[index];
        return findElement;
    }

    /**
     * Length int.
     *
     * @return the int
     */
// 返回元素个数
    public int length() {
        return size;
    }

    /**
     * Recapacity.
     */
// 线性表的扩容
    public void recapacity() {
        int[] arrayNew = new int[array.length * 2];
        System.arraycopy(array, 0, arrayNew, 0, array.length);
        // 坑啊
        array = arrayNew;
    }

    /**
     * Output.
     */
// 遍历线性表
    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + "");
        }
    }

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);
       // myArray.add(5);
        myArray.insert(4, 0);
        myArray.insert(1, 4);
        myArray.insert(2, 3);
        myArray.insert(3, 2);
        myArray.insert(6, 2);
        myArray.output();
        System.out.println("----------------");
        myArray.length();
        System.out.println("----------------");
        myArray.deleted(0);
        System.out.println("----------------");
        myArray.modify(1, 9);
        myArray.output();

    }

}

