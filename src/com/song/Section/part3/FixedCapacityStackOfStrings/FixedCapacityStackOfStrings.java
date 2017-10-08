package com.song.Section.part3.FixedCapacityStackOfStrings;
//定容栈  1.有序  2.当N为空时栈为空   3.栈的顶部位于a[N-1]
/*缺点：
 * 1.只能处理Stri ng对象
 * 
 * */
public class FixedCapacityStackOfStrings {
	private String[] a;//底层由数组实现
	private int N;//存储数量
	public FixedCapacityStackOfStrings(int capacity){
		a=new String[capacity];
	}
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	public void push(String item){
		a[N++]=item;
	}
	public String pop(){
		return a[--N]; 
	}
}
