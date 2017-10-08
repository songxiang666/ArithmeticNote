package section01;
//进制转换
public class TransScale {
	public static void main(String[] args){
		System.out.println("121转换为2进制为："+scale(121));
	}
	public static String scale(int num){
		if(num<=1){
			return ""+1;
		}
		String str=""+num%2;
		num=num/2;
		return scale(num)+str;
	}
}
//用递归的情况
//1.范围越来越小
//2.具有结束条件