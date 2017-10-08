package com.song.Section.part3.FixedCapacityStackOfStrings;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfStringsDemo01 {
	public static void main(String[] args){
		FixedCapacityStackOfStrings s=new FixedCapacityStackOfStrings(100);
		while(!StdIn.isEmpty()){
			String item=StdIn.readString();
			if(!item.equals("-"))
				s.push(item);
			else if (!s.isEmpty()) StdOut.print(s.pop()+" ");
		}
		StdOut.println("("+s.size()+" left on stack)");
	}
	
}
