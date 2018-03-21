class pallindrome
{
	public static void main(String[] args)
	{
		for(int i=0; i < args.length; i++)
		System.out.println(isPal(args[i])? "Паллиндром": "Не паллиндром");
	}
	static String reverseString(String str)
	{
		String reversed="";
		for(int i = str.length()-1; i>=0; i--)
			reversed+=str.charAt(i);
		return reversed;
		
	}
	static boolean isPal(String str)
	{
		String s = reverseString(str);
		return str.equals(s);
	}
}