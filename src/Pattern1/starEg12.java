package Pattern1;

public class starEg12 {

	public static void main(String[] args) 
	{
//		*
//		**		
	//	***
	//	****
	//	*****
	//	****
	//	***
	//	**
	//	*
		
//		row-9  col-5  space star 
		
		int star=1;
		
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
		   {
			   System.out.print("*");
		   }   
		
		System.out.println();
		
		if(i<5)
		{
			star++;
		}
		else
		{
			star--;
		}
	  }

	}

}
