import java.io.*;
import java.util.*;
class Perfectsquare
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int c=a*b;
	int flag=0;
	for(int i=1;i<a+b;i++)
	{
		if(i*i==c)
		{
		flag=1;
		}
	}
	if(flag==1)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}	
  }
}

