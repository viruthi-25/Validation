import java.io.*;
import java.util.*;
class vali{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String s1=sc.next();
int n= s1.length();
int flag=0;
int count=0;
for(int i=0;i<n;i++)
{
	if(Character.isUpperCase(s1.charAt(i)))
	{
		flag=1;
	}
}
if(flag==1)
{
	count++;
}
flag=0;
if(n<8)
{
	count--;
}
for(int i=0;i<n;i++)
{
	if(Character.isLowerCase(s1.charAt(i)))
	{
		flag=1;
	}
}
if(flag==1)
{
	count++;
}
flag=0;
for(int i=0;i<n;i++)
{
	if(s1.charAt(i)=='.'||s1.charAt(i)=='_'||s1.charAt(i)=='-'||s1.charAt(i)=='$')
	{
		flag=1;
	}
}
if(flag==1)
{
	count++;
}
flag=0;
for(int i=0;i<n;i++)
{
	if(s1.charAt(i)=='1'||s1.charAt(i)=='2'||s1.charAt(i)=='3'||s1.charAt(i)=='4'||s1.charAt(i)=='5'||s1.charAt(i)=='6'||s1.charAt(i)=='7'||s1.charAt(i)=='8'||s1.charAt(i)=='9'||s1.charAt(i)=='0')
	{
		flag=1;
	}
}
if(flag==1)
{
	count++;
}
flag=0;
if(s1.contains(s))
{
	count--;
}
else{
	count++;
}
for(int i=0;i<n;i++)
{
	if(s1.charAt(i)=='1'||s1.charAt(i)=='2'||s1.charAt(i)=='3'||s1.charAt(i)=='4'||s1.charAt(i)=='5'||s1.charAt(i)=='6'||s1.charAt(i)=='7'||s1.charAt(i)=='8'||s1.charAt(i)=='9'||s1.charAt(i)=='0')
	{
		flag=1;
		int x=Integer.parseInt(String.valueOf(s1.charAt(i)));
		if(s1.contains(Integer.toString(x+1)))
		{
			flag=0;
		}
		else
		{
			flag=1;
		}
		if(s1.charAt(i+1)==x+1||s1.charAt(i-1)==x-1)
		{
			flag=0;
		}
		else{
			flag=0;
		}
	}
}
if(flag==1)
{
	count++;
}
if(count==6)
{
	System.out.println("Valid!");
}
else
{
	System.out.println("Invalid!");
}
}
}
