package com.song.Section2.part2;

public class MergeSortDemo {
	public static void main(String[] args) {
		String s=args[0];
		int n=s.length();
		String[] ss=new String[n];
		for(int i=0;i<n;i++){
			ss[i]=s.substring(i,i+1);
		}
		mergeSort(ss,0,(n-1)/2,n-1);
		show(ss);
	}
	public static void mergeSort(Comparable[] a,int lo,int mid,int hi){
		int i=lo,j=mid+1;//用两个指针分别指向数组左半边 和右半边
		Comparable[] aux=new Comparable[hi+1];
		//将所有元素复制到aux数组中
		for(int k=lo;k<=hi;k++){
			aux[k]=a[k];
		}
		//将元素归并会原数组
		for(int k=lo;k<=hi;k++){
			if(i>mid) a[k]=aux[j++];
			else if(j>hi) a[k]=aux[i++];
			else if(less(aux[i],aux[j])) a[k]=aux[i++];
			else a[k]=aux[j++];
		}
	}
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w)<0;
	}
	public static void show(Comparable[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
