package section01;
//����ת��
public class TransScale {
	public static void main(String[] args){
		System.out.println("121ת��Ϊ2����Ϊ��"+scale(121));
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
//�õݹ�����
//1.��ΧԽ��ԽС
//2.���н�������