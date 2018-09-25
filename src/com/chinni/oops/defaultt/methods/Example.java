package com.chinni.oops.defaultt.methods;

class Example 
{
	public static void main(String[] args) 
	{			  
	Example e=null;
		System.out.println( m1());
	/*String s="98" ;
		System.out.println(s.hashCode());
		*/

	}









	static int m1(){
 
					/*	while (i!=5)	{ i++;
							System.out.println("im in while  "+i);
									if (i==3)
									{	 System.out.println("im in  if  "+i);

										return 10;
									}
								
						}*/

      for (int i=0;i<=10;i++  ){
		  	System.out.println("in for block"+i);
			if (i==3)
			{
				System.out.println("in if block"+i);
				return 10;
			}
		}
							return 20;
	}
}
 
