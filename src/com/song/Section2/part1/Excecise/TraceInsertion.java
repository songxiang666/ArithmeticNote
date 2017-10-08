package com.song.Section2.part1.Excecise;

import java.awt.Font;

import edu.princeton.cs.algs4.StdDraw;

public class TraceInsertion {
	
	public static void sort(String[] a){
		int n=a.length;
		for(int i=0;i<n;i++){
			int j;
			for(j=i;j>0&&less(a[j],a[j-1]);j--){
				exch(a,j,j-1);
			}
			draw(a,i,i,j);
		}
	}

	private static boolean less(String string, String string2) {
		return string2.compareTo(string2)<0;
	}

	private static void exch(String[] a, int j, int i) {
		String swap=a[j];
		a[j]=a[i];
		a[i]=swap;
	}
	
	/**
	 * 绘图部分
	 */
	private static void draw(String[] a,int row,int ith,int jth){
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(-2.50, row, ith+"");
		StdDraw.text(-1.25, row, jth+"");
		
		for(int i=0;i<a.length;i++){
			if(i==jth) StdDraw.setPenColor(StdDraw.BOOK_RED);
			else if(i>ith) StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
			else if(i<jth) StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
			else 		   StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(i, row, a[i]);
		}
	}
	
	//display header
	private static void header(String[] a){
		int n=a.length;
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(n/2.0, -3, "a[ ]");
		
		for(int i=0;i<n;i++)
			StdDraw.text(i, -2, i+"");
		StdDraw.text(-2.50,-2,"i");
		StdDraw.text(-1.25, -2,"j");
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(-3, -1.65, n-0.5, -1.65);
		StdDraw.setPenColor(StdDraw.BLACK);
		
		for(int i=0;i<n;i++){
			StdDraw.text(i, -1, a[i]);
		}
	}
	
	private static void footer(String[] a){
		int n=a.length;
		StdDraw.setPenColor(StdDraw.BLACK);
		for(int i=0;i<n;i++){
			StdDraw.text(i, n, a[i]);
		}
	}
	
	public static void main(String[] args) {
		String s=args[0];
		
		int n=s.length();
		String[] a=new String[n];
		
		for(int i=0;i<n;i++)
			a[i]=s.substring(i,i+1);
		
		//set canvas size
		StdDraw.setCanvasSize(30*(n+3),30*(n+3));
		StdDraw.setXscale(-3,n+1);
		StdDraw.setYscale(n+1,-3);
		StdDraw.setFont(new Font("SanSerif",Font.PLAIN,13));
		
		//画出头部
		header(a);
		
		//对数组排序
		sort(a);
		
		//画出底部
		footer(a);
	}
}
