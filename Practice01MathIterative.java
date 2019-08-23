public class Practice01MathIterative implements Practice01Math
{

	public int fib(int n) throws Exception
	{
		try{
			if(n<0)
			{
				throw new Exception();
			}
			else if(n==0)
				return 0;
			else if(n==1)
				return 1;
			else
			{
				int secondlast_term=0;//(n-2)
				int firstlast_term=1;//(n-1)
				int answer=0;
				for(int i=2; i<=n; i++)
				{
			 		answer=firstlast_term+secondlast_term;
					secondlast_term=firstlast_term;
					firstlast_term=answer;
				}
				return answer;
			}
		}

		catch(Exception e){
			throw e;
		}

	}

	public int fact(int n) throws Exception
	{
		try{
			if (n < 0)
			{
				throw new Exception();
			}
			
			int total=1;
			for(int i=n; i>0; i--)
				total *= i;
			return total;
		}

		catch(Exception e)
		{
			throw e;
		}
	}
}