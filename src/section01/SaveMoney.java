package section01;

public class SaveMoney {
	public static void main(String[] args){
		double[] money=new double[48];
		money[47]=0;
		for(int i=money.length-2;i>=0;i--){
			money[i]=(money[i+1]+1000)/(1+0.0171/12);
			System.out.println("第"+(i+1)+"个月末本利合计："+money[i]);
		}
	
	}
}
