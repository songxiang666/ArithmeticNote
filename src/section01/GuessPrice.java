package section01;
import java.util.Scanner;
public class GuessPrice {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int turePrice=0;//ָ���۸�
		int guessPrice=0;//�µļ۸�
		int i=0;//��¼�µĴ���
		
		System.out.println("��ָ���۸�:");
		turePrice=sc.nextInt();
		while(true){
			i++;
			System.out.println("�����ߣ�");
			guessPrice=sc.nextInt();
			if(turePrice>guessPrice){
				System.out.println("�����ˣ�����");
			}else if(turePrice<guessPrice){
				System.out.println("�����ˣ�����");
			}else{
				System.out.println("��ϲ�㣡����ˣ������������еĽ�Ʒ��");
				break;
			}
		}
		System.out.println("��һ������"+i+"��");
		
	}
}
