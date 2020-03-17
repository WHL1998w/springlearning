package com.soft1851.spring.ioc.entity;

/**
 * @ClassName Sort
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/3/10
 **/
public class Sort {
    //直接排序
    public void insertSort(int[] keys){
        for (int i = 1;i < keys.length;i++){
            int temp = keys[i],j;
            for (j = i - 1;j >= 0&&temp <keys[j];j--){
                keys[j+1] = keys[j];
            }
            keys[j + 1] = temp;
            System.out.print("第" + i + "趟temp:" + temp + "\t");
            print(keys);
            System.out.println();
        }

    }
    public static void print(int[] value){
        for (int i = 0;i<value.length;i++){
            System.out.println(value[i] + " ");
        }
    }
}