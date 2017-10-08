package com.song.Section1.part5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickUnionTest {
	public static void main(String[] args){
		QuickUnion qu=new QuickUnion(10);
		while(!StdIn.isEmpty()){
			int p=StdIn.readInt();
			int q=StdIn.readInt();
			if(qu.connected(p, q)) continue;
			qu.union(p, q);
			StdOut.println(qu.count()+"components");
		}
	}
}
