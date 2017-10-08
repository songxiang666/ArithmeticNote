package com.song.Section2.part1.Excecise;

import java.awt.Font;

import edu.princeton.cs.algs4.StdDraw;

public class TraceSelection {
	public static void sort(String[] a){
		int n=a.length;
		for(int i=0;i<n;i++){
			int min=i;
			for(int j=i;j<n;j++){
				if(less(a[j],a[min])){
					min=j;
				}
			}
			draw(a,i,i,min);
			exch(a,i,min);
		}
	}

	public static void exch(String[] a, int i, int min) {
		String swap=a[i];
		a[i]=a[min];
		a[min]=swap;
	}

	private static boolean less(String string, String string2) {
		return string.compareTo(string2)<0;
	}
	

	private static void draw(String[] a, int row, int ith, int min) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(-2.50, row, ith+"");
		StdDraw.text(-1.25, row, min+"");
		
		for(int i=0;i<a.length;i++){
			if(i==min) StdDraw.setPenColor(StdDraw.BOOK_RED);
			else if(i<ith) StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
			else 		   StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(i, row, a[i]);
		}
	}

	private static void header(String[] a){
		int n=a.length;
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(n/2.0, -3, "a[ ]");
		
		for(int i=0;i<n;i++)
			StdDraw.text(i, -2, i+"");
		StdDraw.text(-2.50,-2,"i");
		StdDraw.text(-1.25, -2,"min");
		
		StdDraw.setPenColor(StdDraw.RED);
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
		for(int i=0;i<n;i++){
			a[i]=s.substring(i,i+1);
		}
		//设置画布大小
		StdDraw.setCanvasSize(30*(n+3),30*(n+3));
		StdDraw.setXscale(-3,n+1);
		StdDraw.setYscale(n+1,-3);
		
		StdDraw.setFont(new Font("SansSerif",Font.PLAIN,13));
		
		//画出头部
		header(a);
		
		//对数组排序
		sort(a);
		
		//画出底部
		footer(a);
	}
}
