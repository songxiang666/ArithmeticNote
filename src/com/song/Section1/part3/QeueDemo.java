package com.song.Section1.part3;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;

public class QeueDemo {
	public static void main(String[] args){
		//In in=new In("qeue");
		Queue<Integer> q=new Queue<Integer>();
		while(!StdIn.isEmpty())
			q.enqueue(StdIn.readInt());//װԪ�ص�����
		int N=q.size();
		
		int[] a=new int[N];
		for(int i=0;i<a.length;i++){
			a[i]=q.dequeue();//ȡ��Ԫ�ص�����
			System.out.println(a[i]);//��ӡ
		}
		System.out.println();//��ӡ
	}
}
