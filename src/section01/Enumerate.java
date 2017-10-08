package section01;
/*
 * 	算法推理题
 * 	   x 算
 * ---------
 * 题题题题题题
 * 
 * 推理得出  算不能为0  题也不能为0
 * */
public class Enumerate {
	public static void main(String[] args){
		int i1,i2,i3,i4,i5;
		long multiple,result;
		for(i1=1;i1<=9;i1++){
			for(i2=0;i2<=9;i2++){
				for(i3=0;i3<=9;i3++){
					for(i4=0;i4<=9;i4++){
						for(i5=1;i5<=9;i5++){
							multiple=i1*10000+i2*1000+i3*100+i4*10+i5;
							result=i5*100000+i5*10000+i5*1000+i5*100+i5*10+i5;
							if(multiple*i1==result){
								System.out.println("i1:"+i1+" i2:"+i2+" i3:"+i3+" i4:"+i4+" i5:"+i5);
								return;
							}
						}
					}
				}
			}
		}
		System.out.println("79365*7="+79365*7);//555555
	}
}
