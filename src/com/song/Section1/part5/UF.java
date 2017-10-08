package com.song.Section1.part5;

//Fast find

public class UF {
	private int[] id;
	private int count;
	
	//��������ʶ��ʼ��N������
	public UF(int N){
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
	
	public int find(int x){
		return id[x];
	}
	public void union(int p,int q){
		int pID=find(p);
		int qID=find(q);
		
		if(pID==qID) return;
		
		for(int i=0;i<id.length;i++){
			//������ֵΪpID��Ԫ�ظ�Ϊ qID;
			if(id[i]==pID)
				id[i]=qID;
			count--;//���� 
		}
	}
	
	
}
