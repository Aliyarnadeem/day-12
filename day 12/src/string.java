
class string {
	public static void main(string[] args)
	{
		String a="banglore";
		System.out.println("print a=" +a);
		
		String b="chennai";
		System.out.println("print b=" +b);
		
		if(a==b)
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
		
		String c=a.concat(b);
		System.out.println("joined strings is =" +a.concat(b));
	}
	}