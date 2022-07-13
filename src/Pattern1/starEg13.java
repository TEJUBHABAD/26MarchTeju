package Pattern1;

public class starEg13 {

	public static void main(String[] args)
	{
//		*        *
//		**	    **
	//	***    ***
	//	****  ****
	//	**********
	//	****  ****
	//	***    ***
	//	**      **
	//	*        *
		
		int star1= 1;
		int space1=0;
		int star2= 1;
		int space2=8;
		
		for(int a=1;a<=9;a++)
		{
			for(int b=1;b<=star1;b++)
			{
				System.out.print("*");
			}
			for(int e=1;e<=space1;e++)
			{
				System.out.print(" ");
			}
			for(int d=1;d<=space2;d++)
			{
				System.out.print(" ");
			}
			
			for(int c=1;c<=star2;c++)
			{
				System.out.print("*");
			}
			
			
			if(a<5)
			{
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else 
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}
			System.out.println();
		}
		

	}

}
