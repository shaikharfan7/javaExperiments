class Subject{

	String subName;
	int marks[][];
	String[] marksType = new String[5];

	public String getName()
	{
		return subName;
	}

	public int[][] getMarks()
	{
		return marks;
	}

	public Subject()
	{
		this.subName = "SUBJECT NAME";
		this.marksType[0] = "THEORY";
		this.marksType[1] = "  PRACTICAL";
		this.marksType[2] = "  INTERNALS";
		this.marksType[3] = "   TERMWORK";
		this.marksType[4] = "    TOTAL";
		this.marks = new int[][]{{100,25,25,150,0},{064,17,19,110,0}}; 
		

	}

	public void genTotal()
	{
		int total  = this.marks[0][0]+this.marks[0][1]+this.marks[0][2]+this.marks[0][3]; //total marks of sub	
		this.marks[0][4] = total;
	 

	    

	}

	public void display()
	{
		System.out.println("\n\t DISPLAYING MARKS DATA\n");
		System.out.print("SUBJECT NAME \t");
		for(int i=0;i<5;i++)
		{
			System.out.print(" " + marksType[i] +"\t");
		}
		int i=0;
		System.out.print("\n" +" \t" +"\t");
		
			for(int j=0;j<5;j++)
			{
				System.out.print(" " + marks[i][j] +"\t"+ "     ");
			}	

	}

	public void genScore()
	{
		int scored = this.marks[1][0]+this.marks[1][1]+this.marks[1][2]+this.marks[1][3]; //total marks scored
		this.marks[1][4] = scored; 
		int i = 1;
		System.out.print("\nSUBJECT " +i +"   \t");
		for(int j=0;j<5;j++)
			{
				System.out.print(" " + marks[i][j] +"\t"+ "     ");
			}	

	}
}

public class task3m2{
	public static void main(String args[])
	{
		Subject obj1 = new Subject();
		obj1.genTotal();
		obj1.display();
		obj1.genScore();
	}
}