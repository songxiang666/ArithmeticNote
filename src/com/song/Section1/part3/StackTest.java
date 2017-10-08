package com.song.Section1.part3;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;

public class StackTest {
	public static void main(String[] args){
		Stack<String> st=new Stack<String>();
		while(!StdIn.isEmpty()){
			st.push(StdIn.readString());
		}
		st.pop();
		System.out.println(st.size());
		Iterator<String> it=st.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
