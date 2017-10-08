package com.song.Section1.part3;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;

public class QeueDemo {
	public static void main(String[] args){
		//In in=new In("qeue");
		Queue<Integer> q=new Queue<Integer>();
		while(!StdIn.isEmpty())
			q.enqueue(StdIn.readInt());//装元素到队列
		int N=q.size();
		
		int[] a=new int[N];
		for(int i=0;i<a.length;i++){
			a[i]=q.dequeue();//取出元素到数组
			System.out.println(a[i]);//打印
		}
		System.out.println();//打印
	}
}
