package NguyenDuyNghia.com;

import java.util.Scanner;

public class GiaiPTBac2 {

	public static void GiaiPTbac2(double a,double b,double c)
	{
		if(a==0)
		{
			if(b==0&&c!=0)
			{
				System.out.println("Phương trình đã cho vô nghiệm");
			}
			else if(b!=0&&c!=0)
			{
				System.out.println("Phương trình đã cho có nghiệm x= "+(-b/a) );
			}
			else
			{
				System.out.println("Phương trình đã cho vô  số nghiệm");
			}
		}
		else
		{
			double delta=b*b-4*a*c;
			if(delta<0) {System.out.println("Phương trình đã cho vô nghiệm");}
			else if(delta==0)
			{
				System.out.println("Phương trình có nghiệm kép x="+(-b/(2*a)));
			}
			else
			{
				System.out.println("Phương trình có 2 nghiệm phân biệt:\n\tx1="+((-b+Math.sqrt(delta))/(2*a))+"\n\tx2="+((-b-Math.sqrt(delta))/(2*a)));
			}
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		System.out.println("mời bạn nhập a:");
		double a= new Scanner(System.in).nextDouble();
		System.out.println("mời bạn nhập b:");
		double b= new Scanner(System.in).nextDouble();
		System.out.println("mời bạn nhập c:");
		double c= new Scanner(System.in).nextDouble();
		GiaiPTbac2(a, b, c);
		
		}
		catch(Exception ex)
		{
		
			throw ex;
		}
		
	}

}
