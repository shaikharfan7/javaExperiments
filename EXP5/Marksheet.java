import java.util.Scanner;

public class Marksheet{

	Subject sobj[] = new Subject[4];
	int totMks=0;
	float percent;


	Scanner s = new Scanner(System.in);

	/*public Marksheet()
	{
		for(int i=0;i<=4;i++)
		{
			sobj[i].subName = "DEFAULT";
			sobj[i].mksTheory = 100;
			sobj[i].mksPrac = 100;
			sobj[i].mksTermWrk = 100;
			sobj[i].mksInternal = 100;
		}
	}*/


	public void calcTotal()
	{
		for(int i=0;i<=4;i++)
		{
			totMks=totMks+sobj[i].getMarksTotal();
		}
	}

	public void calcPercent()
	{
		percent = (totMks/750)*100;
	}

	public int getMarks()
	{
		System.out.println("\nENTER THE SUBJECT NUMBER TO RETRIVE MARKS : ");
		int sub = s.nextInt();
		System.out.println("======THEORY=====INTERNALS=====PRACTICAL=====TERMWORK=====TOTAL");
		System.out.println("========="+sobj[sub].getMarksTheory()+"======"+sobj[sub].getMarksInternal()+"======"+sobj[sub].getMarksPractical()+"======"+sobj[sub].getMarksTermwork()+"======"+sobj[sub].getMarksTotal());
		return sobj[sub].getMarksTotal();
	}

	public int  getTotal()
	{
		return totMks;
	}

	public float getPercentage()
	{
		return percent;
	}

	public void displayMksheet()
	{ 	System.out.println("===========================RESULT==============================");
		System.out.println("======THEORY=====INTERNALS=====PRACTICAL=====TERMWORK=====TOTAL");
		for(int j=0;j<=4;j++)
		{
			System.out.println("\t" +sobj[j].getMarksTheory()+"\t" + sobj[j].getMarksInternal()+"\t"+sobj[j].getMarksPractical()+"\t"+sobj[j].getMarksTermwork()+"\t"+sobj[j].getMarksTotal());
		}	
	}

}