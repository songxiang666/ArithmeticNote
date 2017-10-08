package com.song.Section2.part1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ShellSort {
	public static void sort(Comparable[] a){
		//��a[]����������
		int N=a.length;
		int h=1;
		while(h<N/3) h=h*3+1;
		while( h >= 1){
			//�������Ϊn����
			for(int i=h;i<N;i++){
				//��a[i] ���뵽a[i-h],a[i-2*h],a[i-3*h]..֮��
				for(int j=i;j>=0&&less(a[j],a[j-h]);j -=h){
					exch(a,j,j-h);//��������Ԫ��
				} 
			}
			h=h/3;
		}
	}
	public static boolean less(Comparable v,Comparable w){
		return v.compareTo(w)<0;
	}
	public static void exch(Comparable[] v,int num1,int num2){
		Comparable t=v[num1];
		v[num1]=v[num2];
		v[num2]=t;
	}
	public static void show(Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i]+" ");
		}
		StdOut.println();
	}
	public static boolean isSorted(Comparable[] a){
		for (int i = 1; i < a.length; i++) {
			if(less(a[i],a[i-1])) return false;
		}
		return true;
	}
	public static void main(String[] args){
		String[] a=In.readStrings();
		sort(a);
		assert isSorted(a);//ȷ�����������鶼�������
		show(a);
	}
}
