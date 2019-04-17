import java.util.Scanner;

public class Subject{

	String subName;
	int mksTheory;
	int mksPrac;
	int mksTermWrk;
	int mksInternal;

	Scanner s1 = new Scanner(System.in); //string
	Scanner s = new Scanner(System.in); //integer

    public Subject() {
 		this.subName = "DEFAULTSUBNAME";
 		this.mksTheory = 0;
 		this.mksPrac = 0;
 		this.mksTermWrk = 0;
 		this.mksInternal = 0;
    }

    public Subject(String subName,int mksTheory,int mksPrac,int mksTermWrk,int mksInternal) {
        this.subName = subName;
        this.mksTheory = mksTheory;
        this.mksPrac = mksPrac;
        this.mksTermWrk = mksTermWrk;
        this.mksInternal = mksInternal;
    }	



	public String getSubjectName()
	{
		return subName;
	}

	public int getMarksTheory()
	{
		return mksTheory;
	}

	public int getMarksPractical()
	{
		return mksPrac;
	}

	public int getMarksTermwork()
	{
		return mksTermWrk;
	}

	public int getMarksInternal()
	{
		return mksInternal;
	}

	public int getMarksTotal()
	{
		return mksInternal+mksTheory+mksPrac+mksTermWrk;
	}

	public void editSubjectName()
	{
		System.out.println("\nRE-ENTER SUBJECT NAME : ");
		this.subName = s1.nextLine();
	}

	public void editMarksTheory()
	{
		System.out.println("\nRE-ENTER THEORY MARKS : ");
		this.mksTheory = s.nextInt();		

	}


	public void editMarksPractical()
	{
		System.out.println("\nRE-ENTER PRACTICAL MARKS : ");
		this.mksPrac = s.nextInt();		

	}



	public void editMarksTermWork()
	{
		System.out.println("\nRE-ENTER TERMWORK MARKS : ");
		this.mksTermWrk = s.nextInt();		

	}


	public void editMarksInternal()
	{
		System.out.println("\nRE-ENTER INTERNAL MARKS : ");
		this.mksInternal = s.nextInt();
	}





}