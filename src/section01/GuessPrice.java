package section01;
import java.util.Scanner;
public class GuessPrice {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int turePrice=0;//指定价格
		int guessPrice=0;//猜的价格
		int i=0;//记录猜的次数
		
		System.out.println("请指定价格:");
		turePrice=sc.nextInt();
		while(true){
			i++;
			System.out.println("参与者：");
			guessPrice=sc.nextInt();
			if(turePrice>guessPrice){
				System.out.println("主持人：低了");
			}else if(turePrice<guessPrice){
				System.out.println("主持人：高了");
			}else{
				System.out.println("恭喜你！答对了，你能拿走所有的奖品。");
				break;
			}
		}
		System.out.println("您一共答了"+i+"次");
		
	}
}
