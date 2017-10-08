package com.song.Section1.part5;

public class QuickUnion {
	private int[] id;
	private int count;
	
	//以整数标识初始化N个触点
	public QuickUnion(int N){
		//初始化分量id
		count=N;
		id=new int[N];
		for(int i=0;i<N;i++){
			id[i]=i;
		}
	}
	public int count(){
		return count;
	}
	public boolean connected(int p,int q){
		return find(p)==find(q);//判断两个触点是否联通   即判断id[p]==id[q] 是否相等即可
	}
	public int find(int p){
		//找出分量的名称
		while(p!=id[p]){p=id[p];}
		return p;
	}
	public void union(int p,int q){
		int pRoot=find(p);
		int qRoot=find(q);
		
		if(pRoot==qRoot) return;
		
		id[pRoot]=qRoot;
		count--;
	}
}
