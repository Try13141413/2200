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
	            number1=(int) (Math.random()*100); //�������100���ڵ�����
	            number2=(int) (Math.random()*100);//�������100���ڵ�����
	            
	            if(0<=number1+number2&&number1+number2<=100) 
	            {
	            //�ӷ�����
	            	
	            	System.out.print(number1+"+"+number2+"=     ");
	            	cnt += 1;		
	            	answer[cnt]=number1+number2;
		            if (cnt % 5 == 0)
		            	System.out.println("");
		            //��������
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
 private static void shuchudaan()   //�����ģ��
	        {
	        System.out.println("***********************��Ϊ��*******************************************");
	        for(int m=1;m<answer.length;m++)
	            {
            	System.out.print(answer[m]+"     ");
	           if(m%5==0)
	        	   System.out.println();
	            }
	        }

	
}
