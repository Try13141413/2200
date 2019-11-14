package text;
public class jaijianfa {
	static int answer[]=new int[51];
	public static void main(String[] args)
	{
		
		hexin();
		shuchudaan();
	}
	
public static void hexin(){
		  int cnt=0;
	        int number1=0,number2=0;
	        
	        for(;;) {  
	            number1=(int) (Math.random()*100); //随机生成100以内的数字
	            number2=(int) (Math.random()*100);//随机生成100以内的数字
	            
	            if(0<=number1+number2&&number1+number2<=100) 
	            {
	            //加法部分
	            	
	            	System.out.print(number1+"+"+number2+"=     ");
	            	cnt += 1;		
	            	answer[cnt]=number1+number2;
		            if (cnt % 5 == 0)
		            	System.out.println("");
		            //减法部分
		            if (cnt == 50) break;
		            if(number1<number2) {
		                int t;
		                t=number1;
		                number1=number2;
		                number2=t;
		            }
		            System.out.print(+number1+"-"+number2+"=     ");
		            cnt += 1;
		            answer[cnt]=number1-number2;
		            if (cnt % 5 == 0)
		            	System.out.println("");
		            if (cnt == 50) break;    
	            }
	           
	        }
}
 private static void shuchudaan()   //输出答案模块
	        {
	        System.out.println("***********************答案为：*******************************************");
	        for(int m=1;m<answer.length;m++)
	            {
            	System.out.print(answer[m]+"     ");
	           if(m%5==0)
	        	   System.out.println();
	            }
	        }

	
}
