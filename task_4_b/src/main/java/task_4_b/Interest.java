package task_4_b;
import java.lang.System;
import java.util.*;


	public class Interest
	{
	public static void main(String args[])
	{
	   double principal;
	   int period,choice;
	   float rateOfInterest;
	   Scanner sc=new Scanner(System.in);
	   System.console().writer().println("Calculation of interest\n-------------------------");
	   System.console().writer().println("Enter the principal amount:");
	   principal=sc.nextDouble();
	   System.console().writer().println("Enter the period(in years):");
	   period=sc.nextInt();
	   System.console().writer().println("Enter the rate of interest:");
	   rateOfInterest=sc.nextFloat();
	   Calculation cal=new Calculation();
	   while(true)
	   {
	   	System.console().writer().println("What should I calculate for the above information:\n1.Simple interest\n2.Compound Interest");
	   	choice=sc.nextInt();
	  	 if(choice==1)
	   	 {
	    	   System.console().writer().println("Simple Interest:"+cal.calculateSimpleInterest(principal,period,rateOfInterest));
	     	  break;
	   	 }
	  	 else if(choice==2)
	    	{
	   	  System.console().writer().println("Compound Interest:"+cal.calculateCompoundInterest(principal,period,rateOfInterest));
	    	 break;
	    	}
	  	 else
	   	  System.console().writer().println("Enter a valid option");
	   }
	   sc.close();
	}
	}

