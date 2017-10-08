package com.song.Section.part3.FixedCapacityStackOfStrings;

import java.util.Iterator;
import java.util.NoSuchElementException;
//定容栈  1.有序(先进后出)  2.当N为空时栈为空   3.栈的顶部位于a[N-1]
/*缺点：
 * 1.只能处理String对象
 * 	处理方法：使用泛型技术
 * 注意：在java中不能直接创建泛型数组  暂时用下面解决
 * 		a=(item[])new Object[capacity];
 * 
 * 游离：保存一个不需要的对象的引用  称为游离 
 * 
 * 此时 缺点已解决   完美！ 
 * */
@SuppressWarnings("unchecked")
public class ResizingArrayStack<item> implements Iterable<item>{
	private item[] a=(item[])new Object[1];//底层由数组实现
	private int N;//存储数量 
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	public void push(item item){
		if(N==a.length) //如果数组已满  
			resize(2*a.length);//扩容
		a[N++]=item;
	}
	public item pop(){
		item item=a[--N];
		a[N]=null;//防止对象游离？   虽然该元素被弹出  但实际上 它任然存在于底层数组  为了能让java及时进行垃圾回收  采用这种做法  直接不对元素引用
		if(N>0&&N<a.length/4) resize(a.length/2); //调整数组大小后  处于半满状态 提高效率  使栈的利用率达到了1/4
		return item; 
	}
	/**
	 * 将大小为N<=max的栈移动到一个新的大小为max的数组中  扩容
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
	 * 神秘迭代器方法
	 * 
	 * */
	@Override
	public Iterator<item> iterator() {
		
		return new ReverseArrayIterator();//返回一个迭代器对象
	}
	
	//声明一个内部类   迭代器  
	private class ReverseArrayIterator implements Iterator<item>{
		private int i=N;
		@Override
		public boolean hasNext() {
			return i>0;
		}

		@Override
		public item next() {
			if(i==0)
				throw new NoSuchElementException("元素不存在！");
			return a[--i];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("不支持该操作！");
		}
		
	}
	
}
