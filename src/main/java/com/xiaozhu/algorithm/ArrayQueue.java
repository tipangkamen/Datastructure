package com.xiaozhu.algorithm;

import java.util.Arrays;

public class ArrayQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.addQueue(1);
        queue.addQueue(2);
        queue.addQueue(3);
        queue.addQueue(4);
        System.out.println(queue+":"+ Arrays.toString(queue.array));
        queue.outQueue();
        queue.outQueue();
        queue.outQueue();
        queue.outQueue();
        System.out.println(queue+":"+ Arrays.toString(queue.array));



    }


}

class  Queue{
    public  Object[] array;//数组
    private  int MaxSize;//最大容量
    private int Front;//头指针
    private int Rear;//尾指针
    //队列初始化
    public Queue(int maxSize){
        this.MaxSize=maxSize;
        this.array= new Object[maxSize];
        this.Front=0;
        this.Rear=0;
    }

    public Object[] addQueue(int num){
        //如果没超过最大容量则进队列
        if(Rear+1<= MaxSize) {
            array[Rear]=num;
            Rear++;
        }else {
            System.out.println("已达到队列最大长度，无法进入");
        }
        return array;
    }

    public Object[] outQueue(){
        if(Rear-1>=0){
            for(int i=0;i<Rear-Front-1;i++){
                array[i]=array[i+1];
            }
            array[Rear-1]= null;
            Rear--;
        }else {
            System.out.println("队列中已无数据，无法出去");
        }
        return array;
    }

}
