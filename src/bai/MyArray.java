package bai;

/**
 * Myarray
 *
 * @author BaiXiaoJun
 * @version 1.0
 * @description
 * @date 2022/11/19 9:13
 */
public class MyArray {
    // 声明一个数组
    private int[] array;
    // 声明数组的元素个数
    private int size;

    // 数组的构造方法
    public MyArray( int capacity){
         this.array =  new int[capacity];
         size = 0;
    }
    // 插入元素
    public void  insertElement(int element , int index){
        // 插入越界处理
        if (index< 0  || index > array.length-1 ){
            throw  new ArrayIndexOutOfBoundsException ("下标越界异常");
        }
        // 插入扩容处理
        if(size>=array.length){
           this.recapacity();
        }
        // 插入处理方式
        for (int i = size-1 ; i >= index ; i--) {
           array[i+1]= array[i];
        }
        array[index] = element;
    }

    private void recapacity() {
        int[] newArray = new int[array.length << 1];
        System.arraycopy(array,0,newArray,0,array.length);
    }

}
