package com.song.Section.part3.FixedCapacityStackOfStrings;
//����ջ  1.����  2.��NΪ��ʱջΪ��   3.ջ�Ķ���λ��a[N-1]
/*ȱ�㣺
 * 1.ֻ�ܴ���Stri ng����
 * 
 * */
public class FixedCapacityStackOfStrings {
	private String[] a;//�ײ�������ʵ��
	private int N;//�洢����
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
