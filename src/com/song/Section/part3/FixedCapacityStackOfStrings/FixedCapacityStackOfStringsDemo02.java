package com.song.Section.part3.FixedCapacityStackOfStrings;

import java.util.Iterator;
import java.util.LinkedList;

import edu.princeton.cs.algs4.StdIn;

public class FixedCapacityStackOfStringsDemo02 {
	public static void main(String[] args){
		ResizingArrayStack<String> s=new ResizingArrayStack<String>();
		while(!StdIn.isEmpty()){
			String item=StdIn.readString();
			s.push(item);
		}
		//利用迭代器迭代
		Iterator<String> it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//利用for-each输出
		for(String s1:s){
			System.out.println(s1);
		}
		LinkedList link=new LinkedList();
	}
	
}
