package logicalPrograms;

public class MultiplicationWithoutOperator {

	public static void main(String[] args) 
	{
		
		//5*4
		//5+5+5+5
		int a=5;
		int b=4;
		int sum=0;
		
		for(int i=1;i<=4;i++)//1->2
		
		{
		
			sum=sum+a;//0+5->5; 5+5-->10
		
		}
		System.out.println("Multiplication is "+sum);
		
		int x=15;
		int y=7;
		int sum1=0;
		
		for(int j=1;j<=7;j++)
		{
			sum1=sum1+x;
		}
		
		System.out.println("Multiplication is "+sum1);
	}

}
