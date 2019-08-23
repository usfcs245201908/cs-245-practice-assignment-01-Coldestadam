public class Practice01MathRecursive implements Practice01Math{

	public int fib(int n) throws Exception
	{
		try{
			if (n < 0){
				throw new Exception();
			}

			if(n==0||n==1)
			{
				return n;
			}
			else{
				return fib(n-1) + fib(n-2);
			}
		}

		catch(Exception e)
		{
			throw e;
		}
	}

	public int fact(int n) throws Exception {
		try{
			if (n < 0){
				throw new Exception();
			}

			else if (n==0){
				return 1;
			}
			else{
				return n*fact(n-1);
			}
		}
		catch(Exception e){
			throw e;
		}
	}

}