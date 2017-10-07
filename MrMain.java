import java.util.*;
import java.io.*;

//########################################################################
class Experiment_Methods
{
	public static void Ex1()
	{  
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number: ");
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			int count=0;
			for(int i=1;i<=j;i++)
			if(j%i==0)
				count++;
			if(count==2)
				System.out.print(j+" ");}
	}
	public static void Ex2()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s1=s.next();
		String s2=new String();
		int n=s1.length();
		for(int i=n-1;i>=0;i--)
			s2=s2+ s1.charAt(i);
		if(s1.equals(s2)==true)
			System.out.println("String is Palindrome");
		else
			System.out.println("string is not a Palindrome");
	}
//xxxxxxxxxxxxXXXxxxxxxxxxxxxXXXxxxxxxxxxxxxXXXxxxxxxxxxxxxxxxxxxx
public static void Ex3(){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number of String");
	int n=scan.nextInt();
	String arr[]=new String[n];
	System.out.println("Enter String's");
	for(int i=0;i<n;i++)
	arr[i]=scan.next();
	System.out.println("Given String's are");
	for(int i=0;i<n;i++)
	System.out.print(arr[i]+" ");
	for(int i=0;i<n;i++)
    {
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j].compareTo(arr[j+1])>0)
			{  
			String tmp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=tmp;
			}
		}
	}
	System.out.println("\nGiven String's after sorting");
	for(int i=0;i<n;i++)
	System.out.print(arr[i]+" ");
}
//xaxaxaxaxaxaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
public static void Ex4()
{
	Scanner s=new Scanner(System.in);
	System.out.print("Enter a string of integer with a comma(,) as delimiter: ");
	String s1=s.next();
	int sum=0;
	StringTokenizer a=new StringTokenizer(s1,",",false);
	System.out.println("integers are ");
	while(a.hasMoreTokens())
		{
		int b=Integer.parseInt(a.nextToken());
		sum=sum+b;
		System.out.println(" "+b);
		}
	System.out.println("sum of integers is "+sum);
}
//xxxxxxxxxxxxXXXxxxxxxxxxxxxXXXxxxxxxxxxxxxXXXxxxxxxxxxxxxxxxxxx
	public static void Ex5() throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String fname;
	System.out.print("Enter File Name to Open (with extension like file.txt) : ");
	fname = br.readLine();	
	String line = null;
	try
    {
	FileReader fileReader = new FileReader(fname);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	int number=1;
	while((line = bufferedReader.readLine()) != null)
    {
		System.out.print(number+":   ");
		System.out.println(line);
		number++;
    }
	bufferedReader.close();
    }
	catch(IOException ex)
	        {
	System.out.println("Error reading file named '" + fname + "'");
	        }
	}

//xaxaxaxaxaxaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
public static void Ex6() throws IOException
	{
		String fname1;
		int char_count=0,word_count=0,line_count=0;
		StringTokenizer st;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter filename : ");
		fname1=buf.readLine();
		buf=new BufferedReader(new FileReader(fname1));
			while((fname1=buf.readLine())!=null)
			{
				line_count++;
				st=new StringTokenizer(fname1," ,;:.");
				while(st.hasMoreTokens())
				{
					word_count++;
					fname1=st.nextToken();
					char_count+=fname1.length();
				}
			}
		System.out.println("Character Count : "+char_count);
		System.out.println("Word Count : "+word_count);
		System.out.println("Line Count : "+line_count);
		buf.close();	
	}
	
}
//########################################################################	

class MrMain extends Experiment_Methods{
	public static void main(String args[]){
		int op=0, pos;
		Experiment_Methods o2= new Experiment_Methods();
		do
		{
			System.out.println("\n ***************************************\n");
			System.out.println("*** LIST OF OOPS LAB EXPERIMENTS *** \n");
			System.out.println(" 1.Experiment 1: Java program that prompts the user for an integer and then prints out all prime numbers up to that Integer. \n");
			System.out.println(" 2.Experiment 2: Java program that checks whether a given string is a palindrome or not.\n");
			System.out.println(" 3.Experiment 3: Java program for sorting a given list of names in ascending order.\n");
			System.out.println(" 4.Experiment 4: Java Program that reads a line of integers, and then displays each integer, and the sum of all the integers (use StringTokenizer class).\n");
			System.out.println(" 5.Experiment 5: Java program that reads a file and displays a file and displays the file on the screen, with a line number before each line.\n");
			System.out.println(" 6.Experiment 6: Java program that displays the number of characters, lines and words in a text file.\n");
			System.out.println(" 7.Experiment 7: Java program for creating multiple threads using Thread class.\n");

			System.out.println("\n ***************************************\n");

			System.out.println(" \n ENTER YOUR OPTION \n");
			Scanner s1= new Scanner(System.in);
			int i1=s1.nextInt();
			switch(i1)
			{
				case 1: Ex1();
					break;
				case 2: Ex2();
					break;
				case 3: Ex3();
					break;
				case 4: Ex4();
					break;
				case 5: try{
							Ex5();
						}
						catch(IOException ex){
							System.out.println("Error reading file named");
							}
						break;			
				case 6: try{
							Ex6();
						}
						catch(IOException e){
							System.out.println("Somthing went wrong! try to do it again.");
							}
						break;
			}
		}while(op!=9);
	}
}

//########################################################################