package section01;
//斐波那契数列  兔子繁殖问题   
public class RubitBreed {
	public static void main(String[] args){
		int[] num=new int[13];
		num[0]=1;
		num[1]=1;
		for(int i=2;i<num.length;i++){
			num[i]=num[i-1]+num[i-2];
			System.out.println("第"+(i+1)+"月共有"+num[i]+"只兔子");
		}
	}
}
