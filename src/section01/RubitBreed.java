package section01;
//쳲���������  ���ӷ�ֳ����   
public class RubitBreed {
	public static void main(String[] args){
		int[] num=new int[13];
		num[0]=1;
		num[1]=1;
		for(int i=2;i<num.length;i++){
			num[i]=num[i-1]+num[i-2];
			System.out.println("��"+(i+1)+"�¹���"+num[i]+"ֻ����");
		}
	}
}
