package com.song.Section2.part1;

import edu.princeton.cs.algs4.Heap;
import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.Merge;
import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.Shell;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {
	/**
	 * ����ĳ�������㷨 �������㷨����ʱ��
	 * @param alg
	 * @param a
	 * @return
	 */
	public static double time(String alg ,Double[] a){
		Stopwatch timer=new Stopwatch();
		if(alg.equals("insertion")) Insertion.sort(a);
		if(alg.equals("Selection")) Selection.sort(a);
		if(alg.equals("Shell")) Shell.sort(a);
		if(alg.equals("Merge")) Merge.sort(a);
		if(alg.equals("Quick")) Quick.sort(a);
		if(alg.equals("Heap")) Heap.sort(a);
		return timer.elapsedTime();
	}
	/**
	 * ����T������ΪN������ ��ÿ������������� ����total������¼��������ܺ�
	 * @param alg
	 * @param N
	 * @param T
	 * @return
	 */
	public static double timeRandomInput(String alg,int N,int T){
		//ʹ���㷨alg��T������ΪN����������
		double total=0.0;
		Double[] a=new Double[N];
		for(int t=0;t<T;t++){
			//����һ�β��� ����һ�����鲢����
			for(int i=0;i<N;i++){
				a[i]=StdRandom.uniform();
			}
			total +=time(alg,a);
		}
		return total;
	}
	
	public static void main(String[] args) {
		String alg1="Shell";
		String alg2="insertion";
		int N=Integer.parseInt("1000");
		int T=Integer.parseInt("200");
		
		double t1=timeRandomInput(alg1, N, T);
		double t2=timeRandomInput(alg2, N, T);
		StdOut.printf("For %d random Doubles\n   %s is ", N,alg1);
		StdOut.printf("%.1f times faster than %s\n",t2/t1,alg2);
		/*
		 * For 1000 random Doubles
   				insertion is 1.0 times faster than Selection
		 */
	}
}
