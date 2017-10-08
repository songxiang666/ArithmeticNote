package section01;
//用递归 求阶乘
public class Recursion {
	public static void main(String[] args){
		System.out.println("6的阶乘为:"+recursion(6));
	}
	public static int recursion(int n){
		if(n<=1){
			return 1;
		}
		return n*recursion(n-1);
	}
}
