package com.song.Section1.part3;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

public class QueueTest {
	public static void main(String[] args){
		Queue<String> qu=new Queue<String>();
		while(!StdIn.isEmpty()){
			qu.enqueue(StdIn.readString());
		}
		Iterator<String> it=qu.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
