import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Marksheet{

	ArrayList<Subject> sobj = new ArrayList<Subject>();
	//Subject access = new Subject();
	int totMks=0;
	float percent;


	Scanner s = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);

	public Marksheet()
	{
		
	}

	public void addMarksData()
	{
		for(int i=0;i<5;i++)
	{	
		System.out.println("\n===ENTER NEW MARKSHEET DETAILS===");
		System.out.println("\nENTER SUBJECT NAME FOR SUBJECT " +(i+1) + ": ");
		String subName = s1.nextLine();
		System.out.println("\nENTER THEORY MARKS FOR SUBJECT " +(i+1) + ": ");
		int thMks = s.nextInt();
		System.out.println("\nENTER PRACTICAL MARKS FOR SUBJECT " +(i+1) + ": ");
		int pMks = s.nextInt();
		System.out.println("\nENTER TERMWORK MARKS FOR SUBJECT " +(i+1) + ": ");
		int tMks = s.nextInt();
		System.out.println("\nENTER INTERNAL MARKS FOR SUBJECT " +(i+1) + ": ");
		int iMks = s.nextInt();
		sobj.add(new Subject(subName,thMks,pMks,tMks,iMks));
	}
	}





	public Marksheet(String subName,int mksTh,int mksPr,int mksTrmwrk,int mksInt)
	{
		
		sobj.add(new Subject(subName,mksTh,mksPr,mksTrmwrk,mksInt));
		
	}

	public int calcTotal()
	{
		for(int i=0;i<5;i++)
		{
			Subject totobj = sobj.get(i);	
			totMks=totMks+totobj.getMarksTotal();
		}
		return totMks;
	}

	public float calcPercent()
	{
		
		percent = (totMks/875)*100;
		return percent;
	}

	

	public int  getTotal()
	{
		//calcTotal();
		return totMks;
	}

	public float getPercentage()
	{

		return percent;
	}

	public void displayMksheet()
	{ 	System.out.println("=====================================RESULT=======================================");
		System.out.println("SUBJECT"+"\t\t"+"THEORY(100)"+"\t"+"    INTERNALS(25)"+"\t"+"   PRACTICAL(25)"+"\t"+"     TERMWORK(25)"+"\t"+"     TOTAL(175)");
		
		for(int j=0;j<5;j++)
		{
			Subject tmpobj = sobj.get(j);
			System.out.println(tmpobj.getSubjectName()+"\t            " + tmpobj.getMarksTheory()+"\t\t    "+tmpobj.getMarksInternal()+"\t\t           "+tmpobj.getMarksPractical()+"\t\t\t          "+tmpobj.getMarksTermwork()+"\t\t\t    "+tmpobj.getMarksTotal());
		}
		System.out.println(" " + "\t" + "TOTAL = " +calcTotal());	
	}

	

}