package com.song.Section1.part5;

public class QuickUnion {
	private int[] id;
	private int count;
	
	//��������ʶ��ʼ��N������
	public QuickUnion(int N){
		//��ʼ������id
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
		return find(p)==find(q);//�ж����������Ƿ���ͨ   ���ж�id[p]==id[q] �Ƿ���ȼ���
	}
	public int find(int p){
		//�ҳ�����������
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
