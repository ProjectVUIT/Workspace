import java.util.*; 
import java.io.*;
public class Project
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Experiment-1");
		System.out.println("Experiment-2");
		System.out.println("Experiment-3");
		System.out.println("Experiment-4");
		System.out.println("Experiment-5");
		System.out.println("Experiment-6");
		System.out.println("Experiment-7");
		System.out.println("Experiment-8");
		System.out.println("Experiment-9");
		System.out.println("Experiment-10");
		System.out.println("Experiment-11"); 
		System.out.println("enter your choice:");
		n=s.nextInt();
		if(n>11)
		{
			System.out.println("enter the correct choice:");
			n=s.nextInt();
		}
		switch(op)
		{
			case 1: createnode();
					break;
			case 2: insbeg();
					break;
			case 3: insend();
					break;

			case 4: printf("enter position to insert the node");
					scanf("%d",&pos);
					inspos(pos);
					break;
			case 5: delbeg();
					break;
			case 6: printf("enter the position u want to delete");
					scanf("%d",&pos);
					delpos(pos);
					break;
			case 7: delend();
					break;

			case 8: display();
					break;
}
}
 }
	
		












class arith
{
	public static void main(String arg[])
	{
		int a=20,b=10;

		System.out.println("the addition of two numbers is "+(a+b));
		System.out.println("the difference between two numbers is "+(a-b));
		System.out.println("the division of two numbers is "+(a/b));
		System.out.println("remainder is "+(a%b));
		System.out.println("the product of two numbers is "+(a*b));
	}
}


#####
import java.util.*;

public class ariths
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);

		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		

		System.out.println("addition= "+(a+b));
		System.out.println("difference= "+(a-b));
		System.out.println("division= "+(a/b));
		System.out.println("remainder= "+(a%b));
		System.out.println("product= "+(a*b));
	}
}
######
import java.util.*;
class circle
{
	
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int r;
		System.out.println("Enter the radius of the circle");
		r=s.nextInt();		
		double a=Math.PI*(r*r);
		double c=Math.PI*2*r;
		System.out.println("the area of the circle is "+a);
		System.out.println("the circumference of the circle is "+c);
	}
}
		
		###############
		
class example 
{
	public static void main(String arg[])
	{
		System.out.println("HELLO WORLD");
	}
}
#################
import java.util.*;
public class exce
{
    public static void main(String[] args)
    {
        try
        {
			Scanner s=new Scanner(System.in);
            System.out.println("Enter the numerator");
			int a=s.nextInt();
			System.out.println("Enter the denominator");
			int b=s.nextInt();
            float c = a/b;
			System.out.println("The division is "+c);
         }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
        }
        finally
        {
            System.out.printf("Finally is always executed");
        }
    }
}
####################
import java.util.*;
public class exp3 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,i,j;
		System.out.println("Enter the number of strings");
		n=s.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the Strings");
		for(i=0;i<n;i++)
			arr[i]=s.next();
		System.out.println("The enterd string are ");
		for(i=0;i<n;i++)
			System.out.println("  "+arr[i]);
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("strings after sorting are");
		for(i=0;i<n;i++)
			System.out.println("  "+arr[i]);
	}
}
		
		
		#########################
interface A
{
    int x=10;
}
interface B
{
    int x=100;
}
class Interface implements A,B
{
    public static void main(String args[])
    {
      
       //System.out.println(x); 
       System.out.println(A.x);
       System.out.println(B.x);
    }
}
############
class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("A - "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
}

class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("B - "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
}

class Multiple_Thread1
{
	public static void main(String args[])
	{
		A t1=new A();
		B t2=new B();
		t1.start();
		t2.start();
	}
}
############
class A implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("A - "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
}

class B implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("B - "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
		}
	}
}

class Multiple_Thread2
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		
		t1.start();
		t2.start();
	}
}
#############
import java.util.*;
public class Newexce
{
	public static void main(String args[])
	{
		try
		{
			int a=args.length;
			if(a==0)
			{
				throw new excep();
			}
			int c=10/0;
			System.out.println("c");
		}
		catch(excep e)
		{
			System.out.println("Exception is catched");
		}
	}
}

class excep extends Exception
{
	excep()
	{
		System.out.println("Divided by zero");
	}
}
##########
import java.util.*;
class palin
{
	public static void main(String arg[])
	{
		char a[10],dup[10];
		int i,j=0,n,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of letters");
		n=s.nextInt();
		System.out.println("enter the string  ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextChar(10);
		
		}
		for(i=0;i<n;i++)
		{
			dup[j]=a[i];
			j++;
		}
		j='/0';
		for(i=0;j;i!=j;i++;j--)
		{
			if(a[i]!=a[j])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("it is not a pallindrome  ");	
		else
			System.out.println("it is a pallindrome  ");	
	}
	
}
	
}
###############
import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		String original,reverse="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		original=s.nextLine();
		int l=original.length();
		for(int i=l-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("The given string is pallindrome");
		else
			System.out.println("The given string is not pallindrome");
	}
}
#############
import java.util.*;
class palindromen
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,temp,rn=0,d;
		System.out.println("enter the number");
		n=s.nextInt();
		temp=n;
		while(n>0)
		{	
			d=n%10;
			rn=rn*10+d;
			n=n/10;
		}
		if(rn==(temp))
			System.out.println(" the given number is palindrome");
		else
			System.out.println(" the given number is not palindrome");
	}
}
#############
import java.util.*;
class prime
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int s,e;
		System.out.println("Enter the limits");
		System.out.println("Enter the upper limit");
		s=s.nextInt();
		System.out.println("Enter the lower limit");
		e=s.nextInt();
		System.out.println("The prime numbers are ")
		for(int n=s;n<=e;n++)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				count++;
			}
			if(count==2)
				System.out.println("   "+n);
		}
	}
}
#############
import java.util.*;
class primel
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int f,e;
		System.out.println("Enter the limits");
		System.out.println("Enter the lower limit");
		f=s.nextInt();
		System.out.println("Enter the upper limit");
		e=s.nextInt();
		System.out.println("The prime numbers are ");
		for(int n=f;n<=e;n++)
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				count++;
			}
			if(count==2)
				System.out.println("   "+n);
		}
	}
}
###############
	import java.util.*;
	class rectangle
	{	
		public static void main(String arg[])
		{
			int l,b,a,p;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the length of the rectangle");
			l=s.nextInt();
			System.out.println("Enter the bredth of rectangle");
			b=s.nextInt();
			a=l*b;
			p=2*(l+b);
			System.out.println("Area of rectangle is "+a);
			System.out.println("perimeter of the rectangle is "+p);
		}
	}
		
		###############
		import java.util.*;
class operation
{
	int z;
	public void addition(int a,int b)
	{
		z=a+b;
		System.out.println("the addition of two numbers is "+z);
	}
	public void sub(int a,int b)
	{
		z=a-b;
		System.out.println("the difference between two numbers is "+z);
	}
	public void multiplication(int a,int b)
	{
		z=a*b;
		System.out.println("the product of two numbers is "+z);
	}
	
}

public class single_inheritance extends operation
{
	
	public static void main(String args[])
	 {
		Scanner s= new Scanner(System.in);
		int a,b;
		single_inheritance dps=new single_inheritance();
		System.out.println("Enter the value of a");
		a=s.nextInt();
		System.out.println("Enter the value of b");
		b=s.nextInt();
		dps.addition(a,b);
		dps.sub(a,b);
		dps.multiplication(a,b);
	}
}
################
import java.util.*;
public class StringToken
{
	public static void main(String args[])
	{
  		String str;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		str=s.nextLine();
		StringTokenizer a=new StringTokenizer(str," ",false);
		System.out.println("integers are ");
		while(a.hasMoreTokens())
    		{
			int b=Integer.parseInt(a.nextToken());
			sum=sum+b;
			System.out.println(" "+b);
			
     		}
		System.out.println("sum of integers is "+sum);
	}
}



###############
import java.io.IOException;  
class throws1
{  
	void A()throws IOException
	{  
		throw new IOException("device error");
    }  
	void B()throws IOException
	{  
		m();  
	}  
	void C()
	{  
		try
		{  
			n();  
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}  
	}  
	public static void main(String args[])
	{  
		Testthrows1 dps=new Testthrows1();  
		dps.A();  
		System.out.println("normal flow...");  
	}  
}  
#############
import java.io.*;
public class Example
{
	void mymethod(int num)throws IOException
	{
		class NotFoundException;
		{
			if(num==1)
				throw new IOException("Eception Message 1");
			else
				throw new classNotFoundException("Exception Message 2");
		}
	}
}

public class Throwsex
{
	public static void main()
	{
		try
		{
			Example dps=new Example();
			dps.mymethod(1);
		}
		catch(exception e)
		{
			System.out.println(e);
		}
	}
}
#############
import java.util.*;
class Exception1 extends Exception
{
    public Exception1(String s)
    {
        super(s);
    }
}
 
public class userexp
{
	void intCheck(int x) throws Exception1
	{
		if(x<100)
		{
			throw new Exception1("Invalid number");
		}
		else
		{
			throw new Exception1("valid number");
		}
   }
   public static void main(String args[])    
   {
    	userexp dps = new userexp();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number above 100");
		int a=s.nextInt();
        try
        {
            dps.intCheck(a);
        }
        catch (Exception1 ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
############
import java.util.*;
class zero
{
	public static void main(String arg[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		if(n==0)
			System.out.println("the given number is zero");
		else 
			System.out.println("given number is not zero");
	}
}
###
