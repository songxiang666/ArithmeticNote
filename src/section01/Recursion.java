package section01;
//�õݹ� ��׳�
public class Recursion {
	public static void main(String[] args){
		System.out.println("6�Ľ׳�Ϊ:"+recursion(6));
	}
	public static int recursion(int n){
		if(n<=1){
			return 1;
		}
		return n*recursion(n-1);
	}
}
