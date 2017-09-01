package com.ascending;

/**
 * Hello world!
 *
 */

public class App
{
	public int[] a; 
	static int afterArray[];
	
	public int[] ascend(int[] a)
	{
		
		int temp = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		return a;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] b = {10,15,16,4,6,0,1};
        App aObject = new App();
        aObject.a= b;
        b = aObject.ascend(b);       
        System.out.println("The Sorted Array : ");
        for(int i = 0; i < b.length; i++ )
        {
        	System.out.println( b[i] + " ");
        }
    }
}
