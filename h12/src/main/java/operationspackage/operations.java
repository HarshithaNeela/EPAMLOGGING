package operationspackage;


public class operations
{
	private static operations appdata=null;
	private operations() {}
	public static operations getAppdata()
	{
		if(appdata==null)
			appdata=new operations();
		return appdata;
	}
	


	public double f1200(int n)
	{
		return(1200*n);
		
	}
	public double f1500(int n)
	{
		return(1500*n);
		
	}
	public double f1800(int n)
	{
		return(1800*n);
		
	}
	public double f2500(int n)
	{
		return(2500*n);
		
	}

}
