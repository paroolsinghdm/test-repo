package com.datametica.test
{
class App
{
public static void main(String args[])throws IOException;
int i=0;
System.out.prinltn("enter the number of lines ");
DataInputStream in= new DataInputStream(System.in);
i=Integer.parseInt(in.readLine());
for(int outer=i; outer>0; outer--)
{
	for(int inner =1; inner<=i; inner++)
	{
		if(inner>=outer)
		System.out.print("*");
		else
		System.out.print(" ");
	}
	System.out.println();

}
}

