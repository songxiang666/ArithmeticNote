package com.song.Section1.part3;

import java.util.Iterator;


public class Queue<Item> implements Iterable<Item>{
	private Node first;
	private Node last;
	private int N;
	public boolean isEmpty(){
		return first==null;//n==0
	}
	public int size(){
		return N;
	}
	public void enqueue(Item item){
		Node oldlast=last;
		last=new Node();
		last.item=item;
		last.next=null;
		if(isEmpty())
			first=last;
		else
			oldlast.next=last;
		N++;
	}
	public Item dequeue(){
		Item item=first.item;
		first=first.next;
		if(isEmpty())
			last=null;
		N--;
		return item;
	}
	class Node{
		Item item;
		Node next;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new queueIterator();
	}
	class queueIterator implements Iterator<Item>{

		private Node current=first;
		@Override
		public boolean hasNext() {
			return current!=null;
		}

		@Override
		public Item next(){
			Item item=current.item;
			current=current.next;
			return item;
		}

		@Override
		public void remove() {
			
		}
	}
}
