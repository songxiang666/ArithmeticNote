package com.song.Section1.part5;

//Fast find

public class UF {
	private int[] id;
	private int count;
	
	//以整数标识初始化N个触点
	public UF(int N){
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
	
	public int find(int x){
		return id[x];
	}
	public void union(int p,int q){
		int pID=find(p);
		int qID=find(q);
		
		if(pID==qID) return;
		
		for(int i=0;i<id.length;i++){
			//将所有值为pID的元素改为 qID;
			if(id[i]==pID)
				id[i]=qID;
			count--;//触点 
		}
	}
	
	
}
