package com.song.Section.part3.FixedCapacityStackOfStrings;

import java.util.Iterator;
import java.util.NoSuchElementException;
//����ջ  1.����(�Ƚ����)  2.��NΪ��ʱջΪ��   3.ջ�Ķ���λ��a[N-1]
/*ȱ�㣺
 * 1.ֻ�ܴ���String����
 * 	��������ʹ�÷��ͼ���
 * ע�⣺��java�в���ֱ�Ӵ�����������  ��ʱ��������
 * 		a=(item[])new Object[capacity];
 * 
 * ���룺����һ������Ҫ�Ķ��������  ��Ϊ���� 
 * 
 * ��ʱ ȱ���ѽ��   ������ 
 * */
@SuppressWarnings("unchecked")
public class ResizingArrayStack<item> implements Iterable<item>{
	private item[] a=(item[])new Object[1];//�ײ�������ʵ��
	private int N;//�洢���� 
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	public void push(item item){
		if(N==a.length) //�����������  
			resize(2*a.length);//����
		a[N++]=item;
	}
	public item pop(){
		item item=a[--N];
		a[N]=null;//��ֹ�������룿   ��Ȼ��Ԫ�ر�����  ��ʵ���� ����Ȼ�����ڵײ�����  Ϊ������java��ʱ������������  ������������  ֱ�Ӳ���Ԫ������
		if(N>0&&N<a.length/4) resize(a.length/2); //���������С��  ���ڰ���״̬ ���Ч��  ʹջ�������ʴﵽ��1/4
		return item; 
	}
	/**
	 * ����СΪN<=max��ջ�ƶ���һ���µĴ�СΪmax��������  ����
	 * @param max
	 * */
	private void resize(int max){
		item[] temp=(item[])new Object[max];
		for(int i=0;i<N;i++){
			temp[i]=a[i];
		}
		a=temp;
	}
	/**
	 * ���ص���������
	 * 
	 * */
	@Override
	public Iterator<item> iterator() {
		
		return new ReverseArrayIterator();//����һ������������
	}
	
	//����һ���ڲ���   ������  
	private class ReverseArrayIterator implements Iterator<item>{
		private int i=N;
		@Override
		public boolean hasNext() {
			return i>0;
		}

		@Override
		public item next() {
			if(i==0)
				throw new NoSuchElementException("Ԫ�ز����ڣ�");
			return a[--i];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("��֧�ָò�����");
		}
		
	}
	
}
