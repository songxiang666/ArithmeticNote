package com.song.Section1.part3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ReverseDemo {
	public static void main(String[] args){
		Stack<Integer> stack=new Stack<Integer>();
		while(!StdIn.isEmpty())
			stack.push(StdIn.readInt());
		for(int i:stack)
			StdOut.println(i);
	}
}
