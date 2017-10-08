package com.song.Basic;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Demo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		int T=1000;
		VisalAccumulator a=new VisalAccumulator(T,1.0);
		for(int i=0;i<T;i++){
			a.addDataValue(StdRandom.random());
		}
		StdOut.println(a);
	}
}
